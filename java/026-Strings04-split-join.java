/* Create a program called SortJoin that asks the user to enter a list 
of names separated by whitespaces. Then, the program must split the 
string, sort the names alphabetically and output them separated by 
commas. For instance, if the user types this name list: Susan Kailey 
William John, then the program must output John, Kailey, Susan, 
William.

*/

import java.util.Scanner;
import java.util.Arrays;

public class Strings04 /*SortJoin*/ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String listOfWords = sc.nextLine();
        
        String[] words = listOfWords.split(" ");
        Arrays.sort(words);
        System.out.println(String.join(",",words));
    }
}
