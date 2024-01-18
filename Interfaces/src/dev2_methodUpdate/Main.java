package dev2_methodUpdate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        bird.move();
        animal.move();
        //flier.move(); //불가능
        //tracked.move(); //불가능

        //flier.takeOff();
        //flier.fly();
        //flier.track(); //불가능
        //flier.land();

        //tracked.takeOff(); //불가능
        //tracked.fly(); 불가능
        //tracked.track();
        //tracked.land(); 불가능

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        //interface의 field를 부를 때는 static이므로 'Interface이름.field이름' 해야 함.
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);


        //List라고 type을 넓게 잡아주는 게 더 좋다. 뒤에 LinkedList, ArrayList 다 객체 생성 가능하니까
        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

    }

    private static void inFlight(FlightEnabled flier){

        flier.takeOff();
        flier.fly();
        //java16에서는 if block 안에서 instanceof 쓰면 auto type casting이 되게 되어 있다.
        //원래는 명시적 형변환 Trackable tracked = (Trackable) flier, tracked.track() 해야 함.
        //하지만 java16에서는 Bird {Trackable, FlightEnabled}인 걸 알아서 자동으로 형변환해줌. 단, if 안에서 instanceof 쓸 때만!!!!!
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnabled> fliers){
        for (var flier : fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for (var flier : fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers){
        for (var flier : fliers){
            flier.land();
        }
    }


}
