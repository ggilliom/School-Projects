#include <stdio.h>
#include <stdbool.h>
#include <string.h>

void swapFake(int x, int y)
{
  int temp;
  temp = x;
  x = y;
  y = temp;
  return;
} 

void swapReal(int *x, int *y)
{
  int temp;
  temp = *x;
  *x = *y;
  *y = temp;
  return;
}

void callSwaps()
{
  int num1 = 1;
  int num2 = 2;
  int num3 = 3;
  int num4 = 4;
  printf("num1: %d\n", num1);
  printf("num2: %d\n", num2);
  printf("num3: %d\n", num3);
  printf("num4: %d\n", num4);
  printf("swapFake(num1, num2)\n");
  printf("swapReal(num3, num4)\n");
  swapFake(num1, num2);
  swapReal(&num3, &num4);
  printf("num1: %d\n", num1);
  printf("num2: %d\n", num2);
  printf("num3: %d\n", num3);
  printf("num4: %d\n", num4);
}

int main(int argc, char* argv[])
{
  callSwaps();

  FILE* file = NULL;
  file = fopen(argv[1], "r");
  if(file == NULL){
    printf("Could not read from file!\n");
    return -1;
  }
  int dayCount;
  fscanf(file, "%d", &dayCount);

  int days[dayCount]; // holds minutes per day
  int total = 0;
  float average;
  float perfRate;
  int lowest;
  int highest;
  float daysInMin = 60.0 * 24.0 * dayCount; // minutes/hour * hours/day * days

  for(int spot = 0; spot < dayCount; spot++)
  {
    fscanf(file, "%d", &days[spot]);
    total += days[spot];
  }
  fclose(file);

  file = fopen(argv[2], "w");
  if(file == NULL){
    printf("Could not read from file!\n");
    return -1;
  }

  fprintf(file, "The total idle time over the days was %d minutes\n", total); // total

  perfRate = (total / daysInMin) * 100;
  fprintf(file, "The performance rate over the days was %.2f%%\n", perfRate);

  average = total / dayCount;
  fprintf(file, "The average daily idle time over the days was %.2f minutes\n", average); // average


  // Determine values of highest/lowest idle time
  lowest = days[0];
  highest = days[0];
  for(int spot = 1; spot < dayCount; spot++) {
    if (days[spot] < lowest) {
      lowest = days[spot];
    }
    if (days[spot] > highest) {
      highest = days[spot];
    }
  }

  // Determine days with lowest/highest idle time
  fprintf(file, "Day(s) with lowest idle time:\n");
  for(int spot = 0; spot < dayCount; spot++){
    if(days[spot] == lowest){
      fprintf(file, "Day %d\n", (spot + 1));

    }
  }

  fprintf(file, "Day(s) with highest idle time:\n");
  for(int spot = 0; spot < dayCount; spot++){
    if(days[spot] == highest){
      fprintf(file, "Day %d\n", (spot + 1));
    }
  }

  fclose(file);

  return 0;
}
