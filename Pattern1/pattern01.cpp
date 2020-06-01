// including header files
#include <iostream>
using namespace std;

//function to print the pattern
void pattern01(int n)
{
    int i,j; // variables for rows and columns
    for(int i=0;i<n;i++){ //row operation
        for(j=0;j<n;j++){ // column operation
            cout<<"1 ";   // printing the desired o/p
        }
        cout<<endl; //changing thepointer to next line i.e moving to next row
    }
}

// main function 
int main()
{
    int n;
    pattern01(n); // calling the function to print the output
    return 0;
}
