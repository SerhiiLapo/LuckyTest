/**
 * Created by Lapo Serhii on 25.12.2016.
 */

import java.util.Random;
public class ProgramRandomLuck
{
    public static void main(String[] args){
        int i = Randomluck(4);
        switch(i){
            case 0:
                System.out.println("Are you really Human?");
            case 1:
                System.out.println("Godlike Luck!");
                break;
                case 2:
                System.out.println("Good Luck!");
                break;
                case 3:
                System.out.println("Normal Luck.");
                break;
                case 4:
                System.out.println("Bad Luck...");
                break;
        }
    }

    public static int Randomluck(int range) {
        Random rand = new Random();
        int x = rand.nextInt(range + 1);
        return x;
    }
}
