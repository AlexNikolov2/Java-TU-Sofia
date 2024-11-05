package car;

public class Ford extends Car{
    public Ford(int cyliners, String name){
        super(cyliners, name);
    }

    @Override
    public String startEngine(){
        return "Ford Engine started";
    }

    @Override
    public String accelerate(){
        return "Ford Acceleration";
    }

    @Override
    public String brake(){
        return "Ford Kunig STOP!";
    }
}
