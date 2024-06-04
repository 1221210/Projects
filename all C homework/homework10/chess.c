// Ian Selby 700720666
/*
a) Include chess.h.

b) Using the Square type from chess.h, define an 8x8 array called board that can store
the entire contents of a chessboard.

c) Add an initializer to the declaration in part a) so that board corresponds to the usual
placement at the start of a chess game. A square that’s not occupied by a piece should
have an “empty” piece value, and a color black.

d) Write a main() function which uses nested loops to print the Chessboard by calling
printSquare(), for each of the elements of the board array. There should be a
space between each column and each row of the board should be on a different line.

You should get an output like:

R N B K Q B N R
P P P P P P P P
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
p p p p p p p p
r n b q k b n r
*/
#include <stdio.h>
#include "chess.h"

// premake the setup for each array for pieces and colors.
Piece initlailzePieces[8][8] = {
    {ROOK, KNIGHT, BISHOP, QUEEN, KING, BISHOP, KNIGHT, ROOK},
    {PAWN, PAWN, PAWN, PAWN, PAWN, PAWN, PAWN, PAWN},
    {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
    {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
    {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
    {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
    {PAWN, PAWN, PAWN, PAWN, PAWN, PAWN, PAWN, PAWN},
    {ROOK, KNIGHT, BISHOP, QUEEN, KING, BISHOP, KNIGHT, ROOK}
};

Color initlailzeColors[8][8] = {
    {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
    {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
    {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
    {BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK, BLACK},
    {WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE},
    {WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE},
    {WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE},
    {WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE, WHITE}
};

int main() {

    // define a 8x8 array named board
    Square board[8][8];

    
    // use the preset arrays above to init the board setup for chess
    for (int row = 0; row < 8; row++) {
        for (int column = 0; column < 8; column++) {
            board[row][column].currentPiece = initlailzePieces[row][column];
            board[row][column].currentColor = initlailzeColors[row][column];
        }
    }
    
    
    // setup a print portion to display the board
    for(int row = 0; row < 8; row++){
        for (int column = 0; column <8; column++){
            printSquare(&board[row][column]);
            printf(" ");
    
        }
        // make new line for formatting
        printf("\n");

    }
    return 0;
}



