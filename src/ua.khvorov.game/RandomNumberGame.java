package ua.khvorov.game;
import java.util.*;

/**
 * Created by umb on 13.01.14.
 */
public class RandomNumberGame {
    public static void main (String args[]){
        Random random = new Random();
        int secretNumber = random.nextInt(99) + 1; // 0 - 99

        Scanner scanner = new Scanner (System.in);

        while (true) {
            int myNumber = Integer.valueOf(scanner.nextLine());
            if(secretNumber < myNumber){
                System.out.println ("Не угадал , моё число меньше!");
            } else if(secretNumber > myNumber){
                System.out.println ("Не угадал , моё число больше!");
            }else {
                System.out.println ("Поздравляем , вы победили компьютер . Число угадано!!!");
                break;
            }
        }

    }
}