/*
After close(STDOUT_FILENO) is called in the child process, using printf() results in no output.
This happens because the close() system call takes in a parameter of a source of output/input,
whether it be a file our standard i/o, and then closes it. Although no errors are thrown/the
program does not quit, the child branch is unable to print anything out to the console. The
parent, on the other hand, is unaffected, as it is a part of an entirely separate processes
than the child branch.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <fcntl.h>
#include <assert.h>
#include <sys/wait.h>

void p6()
{
	int x = 100;
	int rc = fork();
	if(rc < 0) {
		// fork failed, quit program
		//printf(stderr, "fork failed :(\n");
		printf("fork failed :(\n");
		exit(1);
	} else if(rc == 0){
		// Child branch
		close(STDOUT_FILENO);
		printf("This is the child branch!\n");
		printf("Value of x in child branch: %d\n", x);
		x += 25;
		printf("New value of x in the child branch: %d\n", x);
	} else {
		printf("This is the parent branch!\n");
		printf("Value of x in the parent branch: %d\n", x);
		x += 50;
		printf("New value of x in the parent branch: %d\n", x);
	}
}

int main()
{
	p6();
	return 0;
}