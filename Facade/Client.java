package Facade;
public class Client{
    public static void main(String [] args) {
        DealerShipFacade dealerShipFacade = new DealerShipFacade();

        System.out.println("\n********************Client Running********************\n");

        dealerShipFacade.GermanCars();
        dealerShipFacade.GermanCarChange("suv", 23);
        System.out.println("---------------------------------------");
        dealerShipFacade.JapaneseCars();
        dealerShipFacade.JapaneseCarChange("TruCk", 10);//test to show user input ignores case mistakes
        System.out.println("---------------------------------------");
        dealerShipFacade.AmericanCars();
        dealerShipFacade.AmericanCarChange("caRs", 31);//Test to show that the inventory wont chang because the input is cars not car
        System.out.println("---------------------------------------");
    }
}