// Ian Selby 700720666

// 35 points – Save as search.c

// Write a program called search.c that takes two command-line arguments. The first is a string;
// the second is the name of a file. The program should then search the file, printing all lines
// containing the string. Because this task is line oriented rather than character oriented, use
// fgets() instead of getc(). 

// Use the standard C library function strnstr() to search each line for the
// string. Assume no lines are longer than 255 characters.

// If the wrong number of command line arguments are provided by the user, print out the
// following:

// Usage: search_string filename

// If the program is unable to open the file, print out the following and exit the program.

// Unable to open file.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LINE_LENGTH 255

int main(int argc, char *argv[]) {
    // old top portion: 
    /*int main(int argc, char *argv[]) {
    printf("Welcome. Please enter as follows: \n Usage: search <string> <filename>\n ");
    // Check if correct number of command-line arguments are provided
    if (argc != 3) {
        printf("Usage: search <string> <filename>\n");
        return 1; // Indicate error
    }

    // Extract command-line arguments
    char *searchQuery = argv[1];
    char *filename = argv[2];

    // Open the file for reading
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        printf("Unable to open file.\n");
        return 1; // Indicate error
    }

    int lineCounter = 1; // Line counter
    char line[MAX_LINE_LENGTH + 1]; // Buffer for reading lines

    // Read lines from the file and search for the string
    while (fgets(line, sizeof(line), file)) {
        // Check if the search string is present in the current line
        if (strstr(line, searchQuery) != NULL) {
            // Print the line containing the search string
            printf("Line %d: %s", lineCounter, line);
        }
        lineCounter++; // Increment line number
    }

    // Close the file
    fclose(file);

    return 0; // Indicate successful execution
}*/
     char searchQuery[MAX_LINE_LENGTH];
    char filename[MAX_LINE_LENGTH];
    
    // Prompt for search string
    printf("Enter search string: ");
    if (fgets(searchQuery, sizeof(searchQuery), stdin) == NULL) {
        printf("Bad search string.\n");
        return 1;
    }
    // Remove newline character if present
    searchQuery[strcspn(searchQuery, "\n")] = '\0';

    // Prompt for filename
    printf("Enter filename: ");
    if (fgets(filename, sizeof(filename), stdin) == NULL) {
        printf("Error reading file.\n");
        return 1;
    }
    // Remove newline character if present
    filename[strcspn(filename, "\n")] = '\0';
        
    // Open the file for reading
    FILE *file = fopen(filename, "r");
    if (file == NULL) {
        printf("Error opening file.\n");
        return 1; // Indicate error
    }

    int lineCounter = 1; // Line counter
    char line[MAX_LINE_LENGTH + 1]; // Buffer for reading lines

    // Read lines from the file and search for the string
    while (fgets(line, sizeof(line), file)) {
        // Check if the search string is present in the current line
        if (strstr(line, searchQuery) != NULL) {
            // Print the line containing the search string
            printf("Line %d: %s", lineCounter, line);
        }
        lineCounter++; // Increment line number
    }

    // Close the file
    fclose(file);

    return 0; // Indicate successful execution
}
