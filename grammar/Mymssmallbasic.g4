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

vardeclexpr        : ID EQ (exprand|keyobjcall)
;

arrdeclexpr        : ID ( LBRACK (INT|STRING) RBRACK )* EQ ( exprand | keyobjcall )
;

exprand            : expror ( AND expror)*
;

expror            : compexpr ( OR compexpr)*
;

label           : ID ':'
;

funccall        : ID LPAREN RPAREN
;

keyobjcall      : OBJKEYWORD '.'  ID  LPAREN (exprand ( ',' exprand? )* )?  ')'
;

compexpr        : arithexpr ( ( EQ | NEQ | LT | GT | LE | GE ) arithexpr )?
;

arithexpr       : arithexpr  (ADD|SUB) term
                | term
;

term            : term  (MUL|DIV) factor
                | factor
;

factor          : (ADD|SUB) atom
                | atom
;

atom            : varcall | INT | DOUBLE | STRING | keyobjcall
                | LPAREN exprand RPAREN
;

varcall         : ID ( (LBRACK INT RBRACK)+ | LBRACK STRING RBRACK )?
;

forexpr         : 'For' vardeclexpr 'To' arithexpr ( 'Step' arithexpr )? NEWLINE* blocknosub 'EndFor'
;

ifexpr          : 'If' LPAREN exprand RPAREN NEWLINE* 'Then' NEWLINE* blocknosub elseifexpr* elseexpr? 'EndIf'
;

elseifexpr      : 'ElseIf' LPAREN exprand RPAREN blocknosub
;

elseexpr        : 'Else' blocknosub
;

whileexpr       : 'While' LPAREN exprand RPAREN NEWLINE* blocknosub 'EndWhile'
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
