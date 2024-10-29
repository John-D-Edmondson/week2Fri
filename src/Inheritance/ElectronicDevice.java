package Inheritance;

public abstract class ElectronicDevice {
//    public ElectronicDevice(){};
    public boolean isScreen() {
        return screen;
    }

    public void setScreen(boolean screen) {
        this.screen = screen;
    }

    private boolean screen;
    public void turnOn(){};



}
