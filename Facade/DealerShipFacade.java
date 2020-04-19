package Facade;
public class DealerShipFacade {
    private CarBrands bmw;
    private CarBrands honda;
    private CarBrands ford;

    public DealerShipFacade() {
        bmw = new BMW();
        honda = new Honda();
        ford = new Ford();
    }
    //--------------------view inventory
    public void GermanCars(){
        bmw.checkInventory();
    }
    public void AmericanCars(){
        ford.checkInventory();
    }
    public void JapaneseCars(){
        honda.checkInventory();
    }
    //--------------------change inventory
    public void GermanCarChange(String name, int num){
        bmw.changeInventory(name, num);
    }
    public void AmericanCarChange(String name, int num){
        ford.changeInventory(name, num);
    }
    public void JapaneseCarChange(String name, int num){
        honda.changeInventory(name, num);
    }

}