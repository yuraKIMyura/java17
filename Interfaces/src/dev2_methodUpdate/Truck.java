package dev2_methodUpdate;

public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+ "'s coordinate recorded");
    }

}
