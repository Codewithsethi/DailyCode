/*Given a string, the task is to Reversing Each Word’s Characters in the given string. 
Examples:
input:inputString="Rakesh kumar sethi"
output:outputString="hsekar ramuk ihtes"*/

 

 /*Solution 2: Without StringBuilder, using Manual Reversal*/

import java.util.*;
public class StringProgram2 {
    
    public static void main (String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a String:");
       String inputString=sc.nextLine();

       String result="";

       //split the input string by spaces
       String words[]=inputString.split(" ");

       //Reverse each word
       for(String word:words)
       {
        String reverseWord="";

        for(int i=word.length()-1;i>=0;i--)
        {
          reverseWord+=word.charAt(i);
        }
       
        result+=reverseWord+" ";
       }

       System.out.println("Required Output:"+result.trim());

       
    }
}
