/*
Challenge 09: The clock

Tuenti Contest 2011, Challenge 6 - The clock

You have a digital, 7 led segment, clock. One day, while waking up from a 
sci-fi dream, you wonder: how many times will the individual leds turn on after 
X seconds, from a 00:00:00 position? 

Yeah, geeks. But as a good geek you will not that question stay on your mind 
forever, right? ;) 

Take into account that every second, all leds turn off and then the ones for 
the next position will turn on. 

Sample input
0
4
1000
36000

Sample output
36
172
30630
1069232
*/

import java.util.Scanner;

public class TheClock {

    public static int segments_on(int digit) {
        switch (digit) {
            case 0: return 6;
            case 1: return 2;
            case 2: return 5;
            case 3: return 5;
            case 4: return 4;
            case 5: return 5;
            case 6: return 6;
            case 7: return 3;
            case 8: return 7;
            case 9: return 6;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        while (line != "") {
            
            int totalSeconds = Integer.parseInt(line);
            int answer = 0;
            for (int currentSecond = 0; currentSecond <= totalSeconds; currentSecond++) {
                
                int hours = (int) (currentSecond / 3600);
                int tenHour = (int) (hours / 10);
                int unitHour = hours % 10;
                currentSecond = currentSecond % 3600;
                
                int minutes = (int) (currentSecond / 60);
                int tenMinute = (int) (minutes / 10);
                int unitMinute = minutes % 10;
                currentSecond = currentSecond % 60;
                
                int tenSecond = (int) (currentSecond / 10);
                int unitSecond = currentSecond % 10;
                
                answer = answer +
                    segments_on(tenHour) +
                    segments_on(unitHour) +
                    segments_on(tenMinute) +
                    segments_on(unitMinute) +
                    segments_on(tenSecond) +
                    segments_on(unitSecond);           
            }
            System.out.println(answer);

            line = sc.nextLine();
        }
        sc.close();
    }
}
