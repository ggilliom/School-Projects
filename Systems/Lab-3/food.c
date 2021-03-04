/*

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

void p2()
{
	int fd = open("./p2.txt", O_RDWR | O_CREAT);
	printf("fd: %d\n", fd);
	if(fd < 0){
		printf("File open failed.");
		exit(1);
	}

	printf("opened the fd: %d\n", fd);
	
	int rc = fork();
	if(rc < 0){
		// fork failed, quit program
		//printf(stderr, "fork failed :(\n");
		printf("fork failed :(\n");
		exit(1);
	} else if(rc == 0){
		// Child branch
		char str1[45] = "Child Branch.\n";
		for(int spot = 0; spot < 300; spot++){
			write(fd, str1, strlen(str1));
		}
	} else {
		char str2[45] = "Parent branch.\n";
		for(int spot = 0; spot < 300; spot++){
			write(fd, str2, strlen(str2));
		}
	}
}

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
	printf("P1 START\n");
	p1();
	printf("P2 START\n");
	p2();
	printf("P3 START\n");
	p3();
	printf("P4 START\n");
	p4();
	printf("P5 START\n");
	p5();
	printf("P6 START\n");
	p6();
	return 0;
}