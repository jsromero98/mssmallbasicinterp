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

// TODO arreglos y mamadas

vardeclexpr        : ID EQ (expr|keyobjcall)
;

arrdeclexpr        : ID ( LBRACK (INT|STRING) RBRACK )* EQ expr
;

// TODO precedencia And > Or

expr            : compexpr ( ('And'|'Or') compexpr)*
;

label           : ID ':'
;

funccall        : ID LPAREN RPAREN
;

keyobjcall      : OBJKEYWORD '.'  ID  LPAREN (expr ( ',' expr? )* )?  ')'
;

compexpr        : arithexpr ( ( EQ | NEQ | LT | GT | LE | GE ) arithexpr )*
;

arithexpr       : term ( (ADD|SUB) term )*
;

term            : factor ( (MUL|DIV) factor )*
;

factor          : (ADD|SUB) atom
                | atom
;

atom            : ID | INT | DOUBLE | STRING | keyobjcall
                | LPAREN expr RPAREN
;

forexpr         : 'For' vardeclexpr 'To' arithexpr ( 'Step' expr )? NEWLINE* blocknosub 'EndFor'
;

ifexpr          : 'If' LPAREN expr RPAREN NEWLINE* 'Then' NEWLINE* blocknosub elseifexpr* elseexpr? 'EndIf'
;

elseifexpr      : 'ElseIf' LPAREN expr RPAREN blocknosub
;

elseexpr        : 'Else' blocknosub
;

whileexpr       : 'While' LPAREN expr RPAREN NEWLINE* blocknosub 'EndWhile'
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
NEQ             : '<>' ;
GE             : '>=' ;
LE             : '<=' ;
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
