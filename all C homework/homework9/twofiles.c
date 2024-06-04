// Ian Selby 700720666
#include <stdio.h>

// 35 points – Save as twofiles.c

// Write a program named twofiles.c that takes two command line arguments which are both
// filenames. The program should open both files, the program print line 1 of the first file, line 1
// of the second file, line 2 of the first file, line 2 of the second file, and so on, until the last line of
// the longer file (in terms of lines) is printed. This means once the shorter file runs out of lines to
// print, only lines from the longer line are printed.

// If the wrong number of command line arguments are provided by the user, print out the
// following:

// Usage: twofiles filename1 filename2

// If the program is unable to open one of the files, print out the following and exit the program.

// Unable to open file.


int main(int argc, char *argv[]){
// check for correct quantity of arguments
    if (argc !=3){
        printf("Usage: twofiles filename1 filename2\n");
        return 1; // indicate error and exit programme.
    }

    // file 1 open
    FILE *file1 = fopen(argv[1], "r");
    if (file1 == NULL){
        printf("unable to open file.");
        return 1;
    }


    // file 2 open
    FILE *file2 = fopen(argv[2], "r");
    if (file2 == NULL){
        printf("unable to open file.");
        fclose(file1); // close file 1 if open
        return 1; // if unable return 1 for error
    }


    char file1length[9999], file2length[9999]; // establish variables for file read storage

    // read lines from both files alternating prints
    while(fgets(file1length, sizeof(file1length), file1) && fgets(file2length, sizeof(file2length), file2)) {
        printf("%s", file1length);
        printf("%s", file2length);
    }

// conditions for if files are longer
    while(fgets(file1length, sizeof(file1length), file1)){
        printf("%s", file1length);
    }

     while(fgets(file2length, sizeof(file2length), file2)){
        printf("%s", file2length);
    }

    // close open files
    fclose(file1);
    fclose(file2);

    return 0; // good end




}

