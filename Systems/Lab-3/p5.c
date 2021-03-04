/*
waitpid() allows a program to specify which specific child branch to wait for through its
parameters. This is useful if a parent branch wants to wait for only one of two or more
child branches created by one or more earlier fork() calls.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <fcntl.h>
#include <assert.h>
#include <sys/wait.h>

void p5()
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
		printf("This is the child branch!\n");
		printf("Value of x in child branch: %d\n", x);
		x += 25;
		printf("New value of x in the child branch: %d\n", x);
	} else {
		int* status;
		int wc = waitpid(-1, status, 0);
		printf("This is parent wait: %d\n", wc);
		printf("This is the parent branch!\n");
		printf("Value of x in the parent branch: %d\n", x);
		x += 50;
		printf("New value of x in the parent branch: %d\n", x);
	}
}

int main()
{
	p5();
	return 0;
}