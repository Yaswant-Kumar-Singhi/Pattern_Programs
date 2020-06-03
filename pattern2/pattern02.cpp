/*Pattern:
1
12
123
1234
12345
*/

//including header files
#include<bits/stdc++.h>
using namespace std;

//main method
int  main()
{
 for(int i=1;i<=5;i++) // outer loop for rows
 {
  for(int j=1;j<=i;j++) // inner loop for columns
     cout<<j; // printing
 }
  cout<<endl; //changing lines
  return 0;
}//end of program
