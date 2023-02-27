grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

//program: (INT_CONSTANT | CHAR_CONSTANT | REAL_CONSTANT | ID)*
//       ;


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

MULTI_LINE_COMMENT: '"""'.*'"""' -> skip
            ;

WS: [ \r\n\t] -> skip
            ;

program: definition*
       ;

definition: var_definition
            | var_definition_list
            | array_definition
            | function_definition
            | struct_definition
            | main_function
            ;

var_definition: ID '::' TYPE
            ;

var_definition_list: ID','var_definition_list | var_definition
            ;

function_definition: 'def' ID'('params?')' '::' function_type 'do' statement* 'end'
            ;

main_function: 'def' 'main' '('params?')' 'do' statement* 'end'
            ;

array_definition: ID '::' '['array_element*']'
            ;

array_element: INT_CONSTANT '::' (TYPE|array_struct_definition) | INT_CONSTANT '::' '['array_element']'
            ;

array_struct_definition: 'defstruct' 'do' statement* 'end'
            ;

struct_definition: ID '::' 'defstruct' 'do' statement* 'end'
            ;

struct_attribute_invocation: ID'.'expression
            ;

statement: var_definition
            | var_definition_list
            | array_definition
            | struct_definition
            | if
            | while
            | asignation
            | function_invocation
            | return
            | puts
            | in
            ;

if: 'if' boolean_operation 'do' statement* (('else' statement*)*)? 'end'
            ;

while: 'while' boolean_operation 'do' statement* 'end'
            ;

asignation: (ID|array_invocation|struct_attribute_invocation) '=' (expression | arithmethic_operation | boolean_operation)
            ;

array_invocation: ID'['(expression|arithmethic_operation)']'('['(expression|arithmethic_operation)']')*
            ;

function_invocation: ID'('function_invocation_params?')'
            ;

function_invocation_params: (expression|arithmethic_operation)','function_invocation_params
            | (expression|arithmethic_operation)
            ;

return: 'return' (expression|arithmethic_operation|boolean_operation)
            ;

expression: ID
            | INT_CONSTANT
            | CHAR_CONSTANT
            | REAL_CONSTANT
            | struct_attribute_invocation
            | array_invocation
            | expression 'as' TYPE
            | function_invocation
            | '('(expression|arithmethic_operation|boolean_operation)')'
            | '-'expression
            | '!'expression
            ;

arithmethic_operation: expression ('+'|'-'|'*'|'/'|'%') expression (('+'|'-'|'*'|'/'|'%') expression)*
            ;

boolean_operation: '!'boolean_operation
            | (expression|arithmethic_operation) (('||'|'&&') boolean_operation)*
            | (expression|arithmethic_operation) ('<'|'>'|'<='|'>='|'=='|'!=') (expression|arithmethic_operation) (('||'|'&&') boolean_operation)*
            | expression
            ;

params: var_definition | var_definition','params
            ;

puts: 'puts' io_list
            ;

io_list: expression','io_list | expression
            ;

in: 'in' io_list
            ;

TYPE: 'int' | 'double' | 'char';

function_type :  'int' | 'double' | 'char' | 'void';