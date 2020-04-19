package Facade;

import java.util.ArrayList;
import java.util.Arrays;

public class BMW implements CarBrands {
    private int car = 22;
    private int suv = 15;
    private int truck = 0;
    ArrayList<String> dictionary = new ArrayList<String>( Arrays. asList( "suv" , "car" , "truck" ) );

    @Override
    public void checkInventory() {
        System.out.println("According to our database, our inventory for BMW Shows:\nCars: "+car+"\nSUVS: "+suv+"\nTrucks: "+truck+"\n");

    }

    /*@Override
    public void setInventory(int car, int suv, int truck) {
        this.car = car;
        this.suv = suv;
        this.truck = truck;

    }*/

    @Override
    public void changeInventory(String name, int num) {
        if(dictionary.contains(name.toLowerCase())){
            System.out.println("System Updated");
            if (name.toLowerCase().equals("truck")){
                this.truck=num;
            }
            if (name.toLowerCase().equals("suv")){
                this.suv=num;
            }
            if (name.toLowerCase().equals("car")){
                this.car=num;
            }
            checkInventory();
        }
        if(!dictionary.contains(name.toLowerCase())){
            System.out.println("INVALID INPUT: NO CHANGES MADE");
        }    
    }
    

}