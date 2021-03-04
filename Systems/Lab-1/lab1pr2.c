#include <stdio.h>
#include <stdbool.h>
#include <string.h>


bool isHex(char* string){

	char hex[23] = "01234567890ABCDEFabcdef";
	char* check;
	
	for(int spot = 0; spot < strlen(string); spot++){
		check = strchr(hex, string[spot]); // checks if each char in string is in hex
		if(check == NULL){ // check is assigned a NULL pointer if a char in string is not valid
			return false;
		}
	}

	return true; 
}

int main(){

	char string[20];
	bool valid = false;

	while(!valid){
		printf("Please enter a valid hexadecimal number: ");
		scanf("%s", str ing);
		valid = isHex(string);
	}

	printf("Thank you!\n");

	return 0;
}

