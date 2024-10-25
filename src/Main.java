import UniqueSum.UniqueSum;
import blackjack.BlackJack;
import taxes.Person;
import taxes.taxCalc;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        Person Jim = new Person("Jim Smyth", 10000);
        Person Keeley = new Person("Keeley", 45000);
        taxCalc tax = new taxCalc();

        System.out.println(tax.calcTax(Jim));
        System.out.println(tax.calcTax(Keeley));

        UniqueSum adder = new UniqueSum();

        System.out.println(adder.stringOutput(new Integer[]{2,34,1,98,98,98}));



        BlackJack blackJack = new BlackJack();
        blackJack.startGame(3);

    }
}