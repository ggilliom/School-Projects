/*
Calling wait() in the parent returns the process id, or pid, as an int. If wait() is called in the
child branch, wait() returns a -1 to signify the wait() call failed/caused an error.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <fcntl.h>
#include <assert.h>
#include <sys/wait.h>

void p4()
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
		int wc = wait(NULL);
		printf("This is wait: %d\n", wc);
		printf("This is the child branch!\n");
		printf("Value of x in child branch: %d\n", x);
		x += 25;
		printf("New value of x in the child branch: %d\n", x);
	} else {
		int wc = wait(NULL);
		printf("This is wait: %d\n", wc);
		printf("This is the parent branch!\n");
		printf("Value of x in the parent branch: %d\n", x);
		x += 50;
		printf("New value of x in the parent branch: %d\n", x);
	}
}

int main()
{
	p4();
	return 0;
}