import UniqueSum.UniqueSum;
import blackjack.BlackJack;
import taxes.Person;
import taxes.taxCalc;
import week3Classes.Human;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Human john = new Human("brown", 10);
        Human jacob = new Human("brown", LocalDate.of(2001, 12,07), 10);
        Human jeff = new Human();
        System.out.println(jacob.getAgeLocal());
        System.out.println(john.getAgeLocal());
    }
}