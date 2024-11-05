package car;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine(){
        return "Car Engine started";
    }

    public String accelerate(){
        return "Car Acceleration";
    }

    public String brake(){
        return "Car Kunig STOP!";
    }
}
