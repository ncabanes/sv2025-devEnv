/*
Challenge 12: Linked words
Acepta el reto, 188
https://www.aceptaelreto.com/problem/statement.php?id=188

Samuel and Clara love playing word association games. If Samuel says "Mata", 
Clara follows with "Tapa". Samuel plays along by saying "Papa", and Clara 
finishes by saying "Pato".

Can you write a program that tells Samuel and Clara if their list of linked 
words is correct? Don't worry about the existence or non-existence of the words 
they use; their long-suffering parents will continue to take care of that.

Input: The input consists of a set of test cases, each made up of a series of 
between 1 and 50 words on a single line. Each word, with a minimum of 2 
characters and a maximum of 24, is separated from the next by a space. Clara 
and Samuel don't yet have a very extensive vocabulary, so we can assume that 
the words they use are made up of two-letter syllables.

Output

For each test case, a line will be written that displays "SI" if all the words 
in the series are correctly linked, and "NO" otherwise.

Two words are considered linked if the last syllable of the first word is the 
same as the first syllable of the second. For one-syllable words, that syllable 
is considered both the first and last syllable.

We want the children to learn spelling, so we will require that not only the 
sounds be the same, but also the spelling. However, all words will be written 
in lowercase, and there will be no accented vowels or other symbols not 
belonging to the English alphabet.

Sample input
gugutata
mata tapa papa pato
seto taco coma matute
sien encima mapa patuco comida
cata tasama malote tejaba batama
kiosko comida

Sample output
SI
SI
NO
SI
SI
NO
*/

import java.util.*;

public class LinkedWords {
    public static void main(String[] args) {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        while (line != "") {
            
            String[] words = line.split(" ");

            boolean acceptable = true;

            for (int i = 0; i < words.length - 1; i++) {
                String w1 = words[i];
                String w2 = words[i + 1];

                String lastSyllable = w1.substring(w1.length() - 2);
                String firstSyllable = w2.substring(0, 2);

                if (!lastSyllable.equals(firstSyllable)) {
                    acceptable = false;
                }
            }

            System.out.println(acceptable ? "SI" : "NO");
            line = sc.nextLine();
        }

        sc.close();
    }
}
