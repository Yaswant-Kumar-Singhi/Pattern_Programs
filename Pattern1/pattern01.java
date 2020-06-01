//importing scanner class to take user input
import java.util.Scanner;

//main class
public class Main
{   
public static void pattern01(int n){ //function to print the result
    int i,j;   //variables for rows and columns
    for(i=0;i<n;i++){  //row operation
        for(j=0;j<n;j++){  //column operation
            System.out.print("1 ");  //printing in the format
        }
        System.out.println(); //moving the cursor to next line
    }
}

	public static void main(String[] args) { // main method
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //taking input from user for the o/p
		pattern01(n);
	}
}
