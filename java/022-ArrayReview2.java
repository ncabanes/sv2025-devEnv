/*
Arrays review 2

Ask the user how many lists of words do they want.

For each list, ask them how many words will they enter in that list, and then ask them for the words.

Finally, display the words in the first list which are also part of the other lists.
*/

/*
uno, dos, tres
uno, tres, cinco,
dos, tres, cuatro, cinco, dos
*/

import java.util.Scanner;

public class ArrayReview2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lists? ");
        int amountOfLists = sc.nextInt();
        String[][] words = new String[amountOfLists][];
        
        for (int i = 0; i < amountOfLists; i++)
        {
            System.out.print("How many words in list " + (i+1) + "? ");
            int amountInThisList = sc.nextInt();
            sc.nextLine();
            words[i] = new String[amountInThisList];
            for (int j = 0; j < amountInThisList; j++)
            {
                System.out.print("Enter word " + (j+1) + ": ");
                words[i][j] = sc.nextLine();
            }
            
        }
        
        // For each word in the first list
        for(String word : words[0])
        {
            int count = 0;
            // Let's fetch the other lists
            for (int listNumber = 1; listNumber < amountOfLists; listNumber++)
            {
                boolean found = false;
                // And check all the words in them
                for (String currentWord: words[listNumber])
                {
                    if (word.equals(currentWord))
                    {
                        found = true;
                    }
                }
                if (found)
                    count++;                
            }
            if (count == amountOfLists - 1)
                    System.out.println(word);
        }
    }
}
