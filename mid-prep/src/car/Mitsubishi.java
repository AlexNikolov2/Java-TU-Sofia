package car;

public class Mitsubishi extends Car {
    public Mitsubishi(int cyliners, String name){
        super(cyliners, name);
    }

    @Override
    public String startEngine(){
        return "Mitsubishi Engine started";
    }

    @Override
    public String accelerate(){
        return "Mitsubishi Acceleration";
    }

    @Override
    public String brake(){
        return "Mitsubishi Kunig STOP!";
    }
}
