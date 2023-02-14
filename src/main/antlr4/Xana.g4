grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: (INT_CONSTANT | CHAR_CONSTANT | REAL_CONSTANT | ID)*
       ;

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