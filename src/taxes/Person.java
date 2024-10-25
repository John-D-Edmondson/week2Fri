package taxes;

public class Person {

    public Person(String name, int wage){
        this.name = name;
        this.wage = wage;
        this.taxRate = 0;
    }
    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int wage;
    private int taxRate;
    private String name;

}
