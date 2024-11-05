package car;

public class Holden extends Car{
    public Holden(int cyliners, String name){
        super(cyliners, name);
    }

    @Override
    public String startEngine(){
        return "Holden Engine started";
    }

    @Override
    public String accelerate(){
        return "Holden Acceleration";
    }

    @Override
    public String brake(){
        return "Holden Kunig STOP!";
    }
}
