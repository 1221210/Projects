// Ian Selby 700720666
#include <stdio.h>

int main(void){
// var initialization
    float download;
    float fileSize;
    float dlTime;

// Ask user for needed dl speed and file size
    printf("Please enter your download speed in Mb/s: \n");
    scanf("%f", &download);

    printf("Please enter your file's size in MB: \n");
    scanf("%f", &fileSize);

    dlTime = fileSize / (download * 0.125);

    printf("At %.2f megabits per second, a file of %.2f megabytes downloads in %.2f seconds. \n", download, fileSize, dlTime);
}