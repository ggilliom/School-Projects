/*
There are likely so many different system calls similar to exec() because differnet amounts/kinds
of information may be known about how to call another program before it actually happens. Knowing
or needing to know the specific path to the file, number of arguments necessary for the program to
run, or environment specifications are all possible parts of a program to be run through an exec()
call. Having so many different types of exec() allows for programmers to have greater flexibility
when using them, as specifying information that may be unnecessary can diminish the readability of
code. More specific functions allow programmers to be more precise when choosing the exec() call
that best suits the situation they are dealing with.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <fcntl.h>
#include <assert.h>
#include <sys/wait.h>

void p3()
{
	int rc = fork();

	if(rc < 0) {
		// fork failed, quit program
		//printf(stderr, "fork failed :(\n");
		printf("fork failed :(\n");
		exit(1);
	} 
	else if(rc == 0){
		// Child branch
		printf("This is the child branch!\n");
		char* argsC[2];
		argsC[0] = strdup("/bin/ls");
		argsC[1] = NULL;
		execvp(argsC[0], argsC);
	} 
	else {
		printf("This is the parent branch!\n");
		char* argsP[2];
		argsP[0] = strdup("/bin/ls");
		argsP[1] = NULL;
		execvp(argsP[0], argsP);
	}
}

int main()
{
	p3();
	return 0;
}