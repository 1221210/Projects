// Ian Selby 700720666
// a) Include the chess.h header file.

#include <stdio.h>
#include "chess.h"

// b) Write the printSquare(), function. It should print a single ASCII character for the
// square. The character printed should be as follows:
// • Empty square: *
// • Black Pawn: P
// • Black Knight: N
// • Black Bishop: B
// • Black Rook: R
// • Black Queen: Q
// • Black King: K
// • White Pawn: p
// • White Knight: n
// • White Bishop: b
// • White Rook: r
// • White Queen: q
// • White King: k

// Note, that a Black piece symbol is the upper case version of a White piece symbol, which
// are all lower case. You can take advantage of that in your function if you like.

void printSquare(Square *sq){
    switch(sq->currentPiece){
        case EMPTY:
            printf("* ");
            break;
    // logic means if color is = to black then make pawn black else make white. Same applies to below in general.
        case PAWN:
            printf(sq->currentColor == BLACK ? "P " : "p ");
            break;
        case KNIGHT:
            printf(sq->currentColor == BLACK ? "N " : "n ");
            break;
        case BISHOP:
            printf(sq->currentColor == BLACK ? "B " : "b ");
            break;
        case ROOK:
            printf(sq->currentColor == BLACK ? "R " : "r ");
            break;
        case QUEEN:
            printf(sq->currentColor == BLACK ? "Q " : "q ");
            break;
        case KING:
            printf(sq->currentColor == BLACK ? "K " : "k ");
            break;
    }
}   
