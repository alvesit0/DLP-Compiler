grammar Xana;

@header {
package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.*;
}

program returns [es.uniovi.dlp.ast.Program ast]
            : definition_list {$ast = new es.uniovi.dlp.ast.Program(0, 0, $definition_list.list);}
            ;


// ########## DEFINITIONS ##########

definition_list returns [List<Definition> list = new ArrayList<Definition>();]
            : (definition
                {$list.addAll($definition.list);}
              )* main_function
                {$list.add($main_function.ast);}
            ;

definition returns [List<Definition> list = new ArrayList<Definition>();]
            : var_definition_list {$list.addAll($var_definition_list.list);}
            | function_definition {$list.add($function_definition.ast);}
            | main_function {$list.add($main_function.ast);}
            ;

var_definition_list returns [List<VarDefinition> list = new ArrayList<VarDefinition>();]
            : ids+=ID (','ids+=ID)* '::' t=type {
                for (var id : $ids) {
                    $list.add(new VarDefinition(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), $type.ast));
                }
            }
            ;

function_definition returns [FunctionDefinition ast]
            : 'def' f=ID'('params')' '::' t=function_type 'do' function_body 'end'
                {$ast = new FunctionDefinition($f.getLine(), 1,
                    new FuncType($t.ast.getLine(), $t.ast.getColumn(), $params.list, $t.ast)
                , $f.text, $function_body.statementList, $function_body.varDefinitionList);}
            ;

main_function returns [FunctionDefinition ast]
            : 'def' m='main' '('params')' 'do' function_body 'end'
                {$ast = new FunctionDefinition($m.getLine(), $m.getCharPositionInLine() + 1,
                    new FuncType($m.getLine(), $m.getCharPositionInLine() + 1, $params.list, new VoidType($m.getLine(), $m.getCharPositionInLine() + 1))
                , "main", $function_body.statementList, $function_body.varDefinitionList);}
            ;

params returns [List<VarDefinition> list = new ArrayList<VarDefinition>();]
            : var1=ID '::' t1=type {$list.add(new VarDefinition($var1.getLine(), $var1.getCharPositionInLine() + 1, $var1.text, $t1.ast));}
                (',' var2=ID '::' t2=type {$list.add(new VarDefinition($var2.getLine(), $var2.getCharPositionInLine() + 1, $var2.text, $t2.ast));})*
            |
            ;

function_body returns [List<Statement> statementList = new ArrayList<>(), List<VarDefinition> varDefinitionList = new ArrayList<>()]
            : (var_definition_list
                {$varDefinitionList.addAll($var_definition_list.list);}
              )*(statement
                {$statementList.addAll($statement.list);}
              )*
            ;


// ########## STATEMENTS ##########

statement returns [List<Statement> list = new ArrayList<Statement>();]
            : if_else_statement {$list.add($if_else_statement.ast);}
            | while_statement {$list.add($while_statement.ast);}
            | assignment_statement {$list.add($assignment_statement.ast);}
            | function_invocation {$list.add($function_invocation.ast);}
            | return_statement {$list.add($return_statement.ast);}
            | puts_statement {$list.addAll($puts_statement.list);}
            | in_statement {$list.addAll($in_statement.list);}
            ;

statement_list returns [List<Statement> list = new ArrayList<Statement>();]
            : (statement {$list.addAll($statement.list);})*
            ;

if_else_statement returns [If ast]
            : 'if' e=expression 'do' sl1=statement_list 'end' {$ast = new If($e.ast, $sl1.list, null);}
            | 'if' e=expression 'do' sl1=statement_list 'else' sl2=statement_list 'end' {$ast = new If($e.ast, $sl1.list, $sl2.list);}
            ;

while_statement returns [While ast]
            : 'while' e=expression 'do' sl=statement_list 'end' {$ast = new While($e.ast, $sl.list);}
            ;

assignment_statement returns [Assignment ast]
            : e1=expression '=' e2=expression {$ast = new Assignment($e1.ast, $e2.ast);}
            ;

return_statement returns [Return ast]
            : 'return' expression {$ast = new Return($expression.ast);}
            ;

puts_statement returns [List<Write> list = new ArrayList<>()]
            : 'puts' io_list {
                for (Expression e : $io_list.list)
                    $list.add(new Write(e));
                }
            ;

in_statement returns [List<Read> list = new ArrayList<>()]
            : 'in' io_list {
                for (Expression e : $io_list.list)
                    $list.add(new Read(e));
                }
            ;

io_list returns [List<Expression> list = new ArrayList<Expression>();]
            : expression {$list.add($expression.ast);} (','expression{$list.add($expression.ast);})*
            ;


// ########## EXPRESSIONS ##########

expression returns [Expression ast]
            : id=ID {$ast = new Variable($id.getLine(), $id.getCharPositionInLine() + 1, $id.text);}
            | intconst=INT_CONSTANT {$ast = new IntLiteral($intconst.getLine(), $intconst.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($intconst.text));}
            | charconst=CHAR_CONSTANT {$ast = new CharLiteral($charconst.getLine(), $charconst.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($charconst.text));}
            | realconst=REAL_CONSTANT {$ast = new DoubleLiteral($realconst.getLine(), $realconst.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($realconst.text));}
            | expr=expression'.'attribute=expression {$ast = new StructAccess($expr.ast.getLine(), $expr.ast.getColumn(), $expr.ast, $attribute.ast);}
            | array=expression'['indexes+=expression']'('['indexes+=expression']')*
                {
                    List<Expression> aux = new ArrayList<Expression>();
                    $indexes.forEach(e -> aux.add(e.ast));
                    $ast = new ArrayAccess($array.ast.getLine(), $array.ast.getColumn(), $array.ast, aux);
                }
            | expr=expression 'as' type {$ast = new Cast($expr.ast.getLine(), $expr.ast.getColumn(), $expr.ast, $type.ast);}
            | function_invocation {$ast = $function_invocation.ast;}
            | expr1=expression op=('+'|'-'|'*'|'/'|'%') expr2=expression {$ast = new ArithmeticOperation($op.getLine(), $op.getCharPositionInLine() + 1, $op.text, $expr1.ast, $expr2.ast);}
            | '!'expression {$ast = new BooleanNot($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
            | expr1=expression op=('||'|'&&') expr2=expression {$ast = new ComparisonOperation($op.getLine(), $op.getCharPositionInLine() + 1, $op.text, $expr1.ast, $expr2.ast);}
            | expr1=expression op=('<'|'>'|'<='|'>='|'=='|'!=') expr2=expression {$ast = new BooleanOperation($op.getLine(), $op.getCharPositionInLine() + 1, $op.text, $expr1.ast, $expr2.ast);}
            | '('expression')' {$ast = $expression.ast;}
            | '-'expression {$ast = new Negative($expression.ast.getLine(), $expression.ast.getColumn(), $expression.ast);}
            ;

function_invocation returns [Invocation ast]
            : f=ID'('function_invocation_params')' {$ast = new Invocation($f.getLine(), $f.getCharPositionInLine() + 1, new Variable($f.getLine(), $f.getCharPositionInLine() + 1, $f.text), $function_invocation_params.list);}
            ;

function_invocation_params returns [List<Expression> list = new ArrayList<Expression>()]
            : expr1=expression {$list.add($expr1.ast);} (','expr2=expression {$list.add($expr2.ast);})*
            |
            ;


// ########## TYPES ##########

type returns [Type ast]
            : primitive_type {$ast = $primitive_type.ast;} // PRIMITIVES
            | t='['size=INT_CONSTANT'::' at=type ']' {$ast = new Array($t.getLine(), $t.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($size.text), $at.ast);} // ARRAYS
            | t='defstruct' 'do' struct_field_list 'end' {$ast = new Struct($t.getLine(), $t.getCharPositionInLine() + 1, $struct_field_list.list);} // STRUCTS
            ;

struct_field_list returns [List<StructField> list = new ArrayList<StructField>();]
            : (struct_field {$list.addAll($struct_field.list);})*
            ;

struct_field returns [List<StructField> list = new ArrayList<StructField>();]
            : ids+=ID (','ids+=ID)* '::' t=type
                {
                    for (var id : $ids) {
                        $list.add(new StructField(id.getLine(), id.getCharPositionInLine() + 1, id.getText(), $type.ast));
                    }
                }
            ;

function_type returns [Type ast]
            : primitive_type {$ast = $primitive_type.ast;}
            | t='void' {$ast = new VoidType($t.getLine(), $t.getCharPositionInLine() + 1);}
            ;

primitive_type returns [Type ast]
            : t='int' {$ast = new IntType($t.getLine(), $t.getCharPositionInLine() + 1);}
            | t='double' {$ast = new DoubleType($t.getLine(), $t.getCharPositionInLine() + 1);}
            | t='char' {$ast = new CharType($t.getLine(), $t.getCharPositionInLine() + 1);}
            ;


// ########## LEXEMES ##########

INT_CONSTANT: [0-9]+
            ;

CHAR_CONSTANT: '\'' (.|'\\t'|'\\n'|'\\'[0-9][0-9][0-9]) '\''
            ;

REAL_CONSTANT: [0-9]+('.'|'E''-'?)[0-9]+
            ;

ID : [_a-zA-Z][_a-zA-Z0-9]*
            ;

SINGLE_LINE_COMMENT: '#' ~[\r\n\t]* -> skip
            ;

MULTI_LINE_COMMENT: '"""'(.)*?'"""' -> skip
            ;

WS: [ \r\n\t] -> skip
            ;