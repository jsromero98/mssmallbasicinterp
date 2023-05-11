grammar Mymssmallbasic;

inicio          : block EOF
;

block           : ( statement (NEWLINE* | EOF ))*
;

blocknosub      : ( statementnosub (NEWLINE* | EOF ))*
;

statement       : vardeclexpr
                | arrdeclexpr
                | forexpr
                | ifexpr
                | funcdef
                | whileexpr
                | LINE_COMMENT
                | label
                | keyobjcall
                | funccall
;

statementnosub  : vardeclexpr
                | arrdeclexpr
                | forexpr
                | ifexpr
                | whileexpr
                | LINE_COMMENT
                | label
                | keyobjcall
                | funccall
;

vardeclexpr        : ID EQ expr
;

arrdeclexpr        : ID ( LBRACK (INT|STRING) RBRACK )* EQ expr
;

expr            : compexpr ( ('And'|'Or') compexpr)*
;

label           : ID ':'
;

funccall        : ID LPAREN RPAREN
;

keyobjcall      : OBJKEYWORD '.'  ID  LPAREN (expr ( ',' expr? )* )?  ')'
;

compexpr        : arithexpr ( ROP arithexpr )*
;

arithexpr       : term ( (ADD|SUB) term )*
;

term            : factor ( (MUL|DIV) factor )*
;

factor          : (ADD|SUB) atom
                | atom
;

atom            : ID | INT | DOUBLE | STRING
                | LPAREN expr RPAREN
;

forexpr         : 'FOR' vardeclexpr 'To' expr ( 'Step' expr )? NEWLINE* blocknosub 'EndFor'
;

ifexpr          : 'If' LPAREN compexpr RPAREN NEWLINE* 'Then' NEWLINE* blocknosub elseifexpr* elseexpr? 'EndIf'
;

elseifexpr      : 'ElseIf' LPAREN compexpr RPAREN blocknosub
;

elseexpr        : 'Else' blocknosub
;

whileexpr       : 'While' LPAREN compexpr RPAREN NEWLINE* blocknosub 'EndWhile'
;

funcdef         : 'Sub' ID blocknosub 'EndSub'
;

MUL             : '*' ;
DIV             : '/' ;
ADD             : '+' ;
SUB             : '-' ;
OBJKEYWORD      : ( 'TextWindow' | 'Program' | 'Stack' | 'Array' ) ;
LINE_COMMENT    : '\'' ~[\r\n\f]* ;
WS              : [ \t\r\n]+ -> skip ;
AND             : 'And' ;
OR              : 'Or' ;
EQ              : '=' ;
ROP             : ( NEQ | GTE | LTE | GT | LT | EQ ) ;
NEQ             : '<>' ;
GTE             : '>=' ;
LTE             : '<=' ;
GT              : '>' ;
LT              : '<' ;
LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACK          : '[' ;
RBRACK          : ']' ;
INT             : [0-9]+;
DOUBLE          : [0-9]+( | [.][0-9]+);
ID              : [a-zA-Z][a-zA-Z0-9_]* ;
STRING          : '"' ~ ["\r\n]* '"' ;
NEWLINE         :'\r'? '\n' ;
