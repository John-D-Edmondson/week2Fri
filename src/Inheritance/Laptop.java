package Inheritance;

public class Laptop extends ElectronicDevice {

    private String brand;
    private int RAM;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public Laptop(){}

    public Laptop(Boolean screen, String brand, int RAM) {
        super(screen);
        this.brand = brand;
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\n' +
                ", RAM=" + RAM + '\n' +
                ", " + super.isScreen() +'}';
    }

    @Override
    public void turnOn(){
        System.out.println("Turning on..... a laptop");
    }
}
