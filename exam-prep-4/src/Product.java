public class Product{
    private String productName;
    private double price;
    private int quantity;
    
    private int buy(int quantity) throws Exception{
        if(quantity < 0 && quantity > quantity){
            throw new Exception("Invalid quantity");
        }
        return this.quantity -= quantity;
    }

    private int restock(int quantity) throws Exception{
        if(quantity < 0){
            throw new Exception("Invalid quantity");
        }
        return this.quantity += quantity;
    }
}