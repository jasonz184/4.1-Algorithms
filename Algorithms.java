import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        System.out.println("Odds: " + odds());
        System.out.println("Evens: " + evens());
        System.out.println("Two digit numbers: " + twoDigit());
        System.out.println("Numbers greater than 500: " + fiveHundred());
        System.out.println("Greatest number: " + greatest());
        System.out.println("Least number: " + least());
        System.out.println("Sum of all numbers: " + sum());
        System.out.println("Mean of all numbers: " + mean());
        System.out.println(mode());
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if(s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twoDigit() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigit = 0;
        while(s.hasNext()) {
            if(s.nextInt() >= 10 && s.nextInt() < 100)
                twoDigit++;
        }
        return twoDigit;
    }

    public static int fiveHundred() throws FileNotFoundException{
        s = new Scanner(f);
        int fiveHundred = 0;
        while(s.hasNext()) {
            if(s.nextInt() > 500)
                fiveHundred++;
        }
        return fiveHundred;
    }

    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = 0;
        while(s.hasNext()) {
            if(s.nextInt() > greatest)
                greatest = s.nextInt();
        }
        return greatest;
    }

    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = 0;
        while(s.hasNext()) {
            if(s.nextInt() < least)
                least = s.nextInt();
        }
        return least;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while(s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }

    public static double mean() throws FileNotFoundException{
        s = new Scanner(f);
        double mean = 0;
        int count = 0;
        while(s.hasNext()) {
            mean += s.nextInt();
            count++;
        }
        return mean / count;
    }

    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);
        
    }
}