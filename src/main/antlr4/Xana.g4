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
            | var_list
            | array_definition
            | function_definition
            | struct_definition
            | main_function
            ;

var_definition: ID '::' type
            ;

var_list: ID','var_list | var_definition
            ;

function_definition: 'def' ID'('params?')' '::' function_type 'do' statement* 'end'
            ;

main_function: 'def main('params?')' 'do' statement* 'end'
            ;

array_definition: ID '::' '['array_element*']'
            ;

array_element: INT_CONSTANT '::' type | INT_CONSTANT '::' '['array_element']'
            ;

struct_definition: ID '::' 'defstruct' 'do' statement* 'end'
            ;

struct_attribute_invocation: ID'.'ID
            ;

statement: var_definition
            | var_list
            | array_definition
            | struct_definition
            | if
            | while
            | asignation
            | function_invocation
            | return
            ;

if: 'if' boolean_operation 'do' statement* (('else' statement*)*)? 'end'
            ;

while: 'while' boolean_operation 'do' statement* 'end'
            ;

asignation: ID '=' arithmethic_operation
            | ID '=' expression
            | array_invocation '=' expression
            | array_invocation '=' arithmethic_operation
            | struct_attribute_invocation '=' expression
            | struct_attribute_invocation '=' arithmethic_operation
            ;

array_invocation: ID'['INT_CONSTANT']'('['INT_CONSTANT']')*
            | ID'['ID']'('['INT_CONSTANT']')*
            | ID'['INT_CONSTANT']'('['ID']')*
            | ID'['ID']'('['ID']')*
            ;

function_invocation: ID'('ID*')'
            ;

return: 'return' expression
            ;

expression: ID | INT_CONSTANT | CHAR_CONSTANT | REAL_CONSTANT
            | cast
            ;

cast: ID 'as' type
            ;

arithmethic_operation: expression '+' expression ('+' expression)*
            | expression '-' expression ('-' expression)*
            | expression '*' expression ('*' expression)*
            | expression '/' expression ('/' expression)*
            ;

boolean_operation: expression '<' expression
            | expression '>' expression
            | expression '<=' expression
            | expression '>=' expression
            ;

params: var_definition | var_definition','params
            ;

type: 'int' | 'double' | 'char';

function_type :  'int' | 'double' | 'char' | 'void';