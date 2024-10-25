package taxes;

import java.util.HashMap;
import java.util.List;

public class taxCalc {

    private Integer[] taxBands = new Integer[]{14999, 19999, 29999, 44999};
    private Integer[] taxRates = new Integer[]{0,10,15,20,25};


    public taxCalc(){

    }
    public taxCalc(Integer[] taxBands, Integer[] taxRates){
        this.taxBands = taxBands;
        this.taxRates = taxRates;
    }

    private void calcTaxRate(Person person){
        int wage = person.getWage();
        if (wage <= taxBands[0]){
            person.setTaxRate(taxRates[0]);
        } else if (wage <= taxBands[1]) {
            person.setTaxRate(taxRates[1]);
        } else if (wage <= taxBands[2]) {
            person.setTaxRate(taxRates[2]);
        } else if (wage <= taxBands[3]) {
            person.setTaxRate(taxRates[3]);
        } else {
            person.setTaxRate(taxRates[4]);
        }
    }


    public String calcTax (Person person){
        calcTaxRate(person);



        double taxPaid =  ((double) person.getWage() * ((double) person.getTaxRate() /100));
        double takeHome = person.getWage() - taxPaid;

        return "Person: " + person.getName() + "\n Salary is: " + person.getWage() +
                "\n Take home pay is: " + takeHome+ "\n Tax paid: " + taxPaid;
    }

}
