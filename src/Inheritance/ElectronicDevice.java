package Inheritance;

public class ElectronicDevice {
    public boolean isScreen() {
        return screen;
    }

    public void setScreen(boolean screen) {
        this.screen = screen;
    }

    private boolean screen;
    public void turnOn(){
        System.out.println("Turning on.....");
    }

    public ElectronicDevice(){}
    public ElectronicDevice(Boolean screen){
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "screen=" + screen +
                '}';
    }
}
