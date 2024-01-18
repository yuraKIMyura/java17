package dev1;

public class Jet implements Trackable, FlightEnabled{


    @Override
    public void takeOff() {
        System.out.println(this.getClass().getSimpleName()+ " is taking off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName()+ " is landing");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName()+ " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+ "'s coordinate recorded");
    }
}
