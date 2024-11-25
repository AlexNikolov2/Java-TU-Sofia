
import java.util.Stack;

public class Train{
    private Stack<String> wagons;
    
    public Train() {
        this.wagons = new Stack<>();
    }
        
    public void addWagon(String wagon) {
        wagons.push(wagon);
        System.out.println("Wagon added: " + wagon);
    }

    public void removeWagon() {
        if (wagons.isEmpty()) {
            System.out.println("No wagons to remove.");
        } else {
            String removedWagon = wagons.pop();
            System.out.println("Wagon removed: " + removedWagon);
        }
    }
    
    public static void main(String[] args) {
        Train train = new Train();

        train.addWagon("Wagon 1");
        train.addWagon("Wagon 2");
        train.addWagon("Wagon 3");

        train.removeWagon();
        
    }     
}