package dev2_methodUpdate;

public class Test {

    public static void main(String[] args) {

        inFlight(new Jet());

    }


    private static void inFlight(FlightEnabled flier){

        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }


}
