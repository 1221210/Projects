// Ian Selby 700720666

/*
a) Each square of a chessboard can hold one piece – a pawn, knight, bishop, rook, queen or
king – or it may be empty. Each piece is either black or white. Define two enumerated
types: 1) Piece, which has seven possible values (one of which is empty), and 2)
Color, which is either black or white.

b) Using the types from part a), define a structure type named Square that can store both
the type of a piece and it’s color.

c) Define the prototype of a function called printSquare(), which returns nothing
and takes a pointer to a Square structure.
*/

#ifndef CHESS_H
#define CHESS_H

// as mentioned define two enums for pieces and colors of teams or tiles.

typedef enum{
    EMPTY,
    PAWN,
    KNIGHT,
    BISHOP,
    ROOK,
    QUEEN,
    KING
} Piece;

// make enum for team colors

typedef enum{
    BLACK,
    WHITE
} Color;

// define structure square

typedef struct {
    Piece currentPiece;
    Color currentColor;
} Square;


// prototype for printSquare()
void printSquare(Square *sq);

#endif

