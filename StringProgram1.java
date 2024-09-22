/*Given a string, the task is to Reversing Each Word’s Characters in the given string. 
Examples:
input:inputString="Rakesh kumar sethi"
output:outputString="hsekar ramuk ihtes"

 */

/*Solution 1: Using split() and StringBuilder */

import java.util.Scanner;
public class StringProgram1{

    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a String:");
       String inputString=sc.nextLine();

       StringBuilder outputString=new StringBuilder();
       
       //split the input string by spaces
        String words[]=inputString.split(" ");

        //Reverse each word
        for (String word:words)
        {
            StringBuilder reverseWord=new StringBuilder(word);
            outputString.append(reverseWord.reverse().toString()).append(" ");
        }
       
       System.out.println("Required Output:"+outputString.toString().trim());
    }
}