/*Given a string, the task is to Reversing Each Word’s Characters in the given string. 
Examples:
input:inputString="Rakesh kumar sethi"
output:outputString="hsekar ramuk ihtes"*/

 

 /*Solution 3:Using Stream API(Java 8 and above*/
 import java.util.*;
import java.util.stream.Collectors;
public class StringProgram3 {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a String:");
        String inputString=sc.nextLine();

        //Use Streams to reverse each word and join them
        String result=Arrays.stream(inputString.split(" ")).
        map(word->new StringBuilder(word).reverse().toString()).
        collect(Collectors.joining(" "));

        System.out.println("Required Output:"+result.trim());
    }
}
