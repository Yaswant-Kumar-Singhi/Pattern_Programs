/*pattern:
1
12
123
1234
12345
*/

public class Pattern02 
{
  public static void main(String[] args) 
  {
    int size=5; //initilizing n=5 
    for(int i=1;i<=size;i++) // outer loop
       {
         for(int j=1;j<=i;j++) // inner loop
          {
             System.out.print(j); // printing o/p
          } // end of inner loop
        System.out.println(); // changing line
       }// end of outer loop
  }// end of main class
}// end of program

