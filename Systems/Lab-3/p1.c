/*
The value of x in the child process is the same as what it was originally given before fork()
was called: 100. When both the child and parent processes alter x, though, they change different
versions of x and, therefore, do not affect each other. This happens because fork() creates two
separate processes, each with their own variables inhereited from before fork() was called.
*/

/*
If all of the functions from p1-p6 were written in the same file and sequentially called from the
same main funciton, a few observations could be made. The main program stops after p3() is called
because both the parent and child functions call a function in the exec() family, a system call
which kills the currently running program and starts a new process as specified as an argument
when the function is called. Functions p1-p6 also use the fork function, so the output of each
function doubles as each new function is called. This happens because both the parent and child
processes from the fork() system call return back to the main function, and both of those parent
and child processes then call fork() again to create new parent and child processes, and so on. If
p3 did not have an exec() system call, the amount of processes would continue to double through p6.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <fcntl.h>
#include <assert.h>
#include <sys/wait.h>

void p1()
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
		printf("This is the parent branch!\n");
		printf("Value of x in the parent branch: %d\n", x);
		x += 50;
		printf("New value of x in the parent branch: %d\n", x);
	}

}

int main()
{
	p1();
	return 0;
}