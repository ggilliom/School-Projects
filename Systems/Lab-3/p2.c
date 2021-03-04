/*
Both the child and parent processes can access the file descriptor created before fork() was
called. This is because both processes are a separate continuation of the original process when
open() was first called. Furthermore, if both  the child and parent processes are attempting to
write to the same file concurrently over an extended period of time, the scheduler will alternate
between running and writing from the child/parent processes. This is not done in a uniform,
consistent pattern, though, and will change between each run of the original process.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <fcntl.h>
#include <assert.h>
#include <sys/wait.h>

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

int main()
{
	p2();
	return 0;
}