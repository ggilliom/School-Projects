#include <stdio.h>
/*
By: Garrett Gilliom and Jonathan Licht
*/

int main() {

  int week[7]; // holds minutes per day
  int total;
  float average;
  float perfRate;
  int lowest;
  int highest;
  float weekInMin = 60.0 * 24.0 * 7.0; // minutes/hour * hours/day * days/week

  char* days[7]; // holds names of days at each index
  days[0] = "Sunday";
  days[1] = "Monday";
  days[2] = "Tuesday";
  days[3] = "Wednesday";
  days[4] = "Thursday";
  days[5] = "Friday";
  days[6] = "Satuday";

  printf("Input (in minutes) how long the computer has been idle for on each day of the week\n");

  printf("Sunday: ");
  scanf("%d", &week[0]);
  total += week[0];

  printf("Monday: ");
  scanf("%d", &week[1]);
  total += week[1];

  printf("Tuesday: ");
  scanf("%d", &week[2]);
  total += week[2];

  printf("Wednesday: ");
  scanf("%d", &week[3]);
  total += week[3];

  printf("Thursday: ");
  scanf("%d", &week[4]);
  total += week[4];

  printf("Friday: ");
  scanf("%d", &week[5]);
  total += week[5];

  printf("Saturday: ");
  scanf("%d", &week[6]);
  total += week[6];

  printf("The total idle time during the week was %d minutes\n", total); // total

  perfRate = (total / weekInMin) * 100;
  printf("The performance rate over the week was %.2f%%\n", perfRate); // performance rate

  average = total / 7;
  printf("The average daily idle time for the week was %.2f minutes\n", average); // average


  // Determine values of highest/lowest idle time
  lowest = week[0];
  highest = week[0];
  for(int spot = 1; spot < 7; spot++) {
    if (week[spot] < lowest) {
      lowest = week[spot];
    }
    if (week[spot] > highest) {
      highest = week[spot];
    }
  }


  // Determine days with lowest/highest idle time
  printf("Day(s) with lowest idle time:\n");
  for(int spot = 0; spot < 7; spot++){
    if(week[spot] == lowest){
      printf("%s\n", days[spot]);
    }
  }

  printf("Day(s) with highest idle time:\n");
  for(int spot = 0; spot < 7; spot++){
    if(week[spot] == highest){
      printf("%s\n", days[spot]);
    }
  }

  return 0;
}
