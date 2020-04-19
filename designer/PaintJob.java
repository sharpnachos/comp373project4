package designer;

public abstract class PaintJob implements Car {
    protected Car paintedCar;

    public PaintJob(Car paintedCar){
        this.paintedCar = paintedCar;
    }

    public void build(){
        paintedCar.build();
    }

}