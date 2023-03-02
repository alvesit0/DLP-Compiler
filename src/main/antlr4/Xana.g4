grammar Xana;


@header {
package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.program.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.*;
}

program returns [Program ast]
            : definition_list {$ast = new Program(0, 0, $definition_list.list);}
            ;

definition_list returns [List<Definition> list = new ArrayList<Definition>();]
            : (definition
                {$list.addAll($definition.list);}
              )* main_function
                {$list.add($main_function.ast);}
            ;

definition returns [List<Definition> list = new ArrayList<Definition>();]
            : var_definition_list
                {$list.addAll($var_definition_list.list);}
            | array_definition
                {$list.add(null);} // ##################### TODO
            | function_definition
                {$list.add($function_definition.ast);} // ##################### TODO
            | struct_definition
                {$list.add(null);} // ##################### TODO
            | main_function
                {$list.add(null);} // ##################### TODO
            ;

var_definition_list returns [List<VarDefinition> list = new ArrayList<VarDefinition>();]
            : v=ID
                {$list.add(new VarDefinition($v.getLine(), $v.getCharPositionInLine() + 1, null, $v.text));}
              (','v2=ID
                {$list.add(new VarDefinition($v2.getLine(), $v2.getCharPositionInLine() + 1, null, $v2.text));}
              )* '::' type
            | array_definition
                {$list.add(null);} // ##################### TODO
            ;

var_definition returns [VarDefinition ast]
            : v=(ID|INT_CONSTANT) '::' type
                {$ast = new VarDefinition($v.getLine(), $v.getCharPositionInLine() + 1, null, $v.text);}
            ;

function_definition returns [FunctionDefinition ast]
            : 'def' f=ID'('params?')' '::' function_type 'do' (statement|definition)* 'end'
                {$ast = new FunctionDefinition($f.getLine(), $f.getCharPositionInLine() + 1, null, $f.text, null, null);}
            ;

main_function returns [FunctionDefinition ast]
            : 'def' m='main' '('params?')' 'do' (statement|definition)* 'end'
                {$ast = new FunctionDefinition($m.getLine(), $m.getCharPositionInLine() + 1, null, "main", null, null);}
            ;

array_definition
            : ID '::' '['array_element*']'
            ;

array_element
            : INT_CONSTANT '::' (type|array_struct_definition)
            | INT_CONSTANT '::' '['array_element']'
            ;

array_struct_definition
            : 'defstruct' 'do' definition* 'end'
            ;

struct_definition
            : ID '::' 'defstruct' 'do' definition* 'end'
            ;

struct_attribute_invocation
            : ID'.'expression
            ;

statement
            : if
            | while
            | asignation
            | function_invocation
            | return
            | puts
            | in
            ;

if
            : 'if' boolean_operation 'do' statement* ('else' statement*)*? 'end'
            ;

while
            : 'while' boolean_operation 'do' statement* 'end'
            ;

asignation
            : (ID|array_invocation|struct_attribute_invocation) '=' (expression | arithmethic_operation | boolean_operation)
            ;

array_invocation
            : ID'['(expression|arithmethic_operation)']'('['(expression|arithmethic_operation)']')*
            ;

function_invocation
            : ID'('function_invocation_params?')'
            ;

function_invocation_params
            : (expression|arithmethic_operation)','function_invocation_params
            | (expression|arithmethic_operation)
            ;

return
            : 'return' (expression|arithmethic_operation|boolean_operation)
            ;

expression
            : ID
            | INT_CONSTANT
            | CHAR_CONSTANT
            | REAL_CONSTANT
            | struct_attribute_invocation
            | array_invocation
            | expression 'as' type
            | function_invocation
            | '('(expression|arithmethic_operation|boolean_operation)')'
            | '-'expression
            | '!'expression
            ;

arithmethic_operation
            : expression ('+'|'-'|'*'|'/'|'%') expression (('+'|'-'|'*'|'/'|'%') expression)*
            ;

boolean_operation
            : '!'boolean_operation
            | (expression|arithmethic_operation) (('||'|'&&') boolean_operation)*
            | (expression|arithmethic_operation) ('<'|'>'|'<='|'>='|'=='|'!=') (expression|arithmethic_operation) (('||'|'&&') boolean_operation)*
            | expression
            ;

params
            : var_definition | var_definition','params
            ;

puts
            : 'puts' io_list
            ;

io_list
            : expression','io_list | expression
            ;

in
            : 'in' io_list
            ;

type
            : 'int' | 'double' | 'char' | '['(expression|var_definition)']';

function_type
            :  'int' | 'double' | 'char' | 'void';


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