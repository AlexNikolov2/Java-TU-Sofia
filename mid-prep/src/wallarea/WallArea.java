package wallarea;

public class WallArea {
    private double width;
    private double height;
    
    public WallArea(){
    }
    public WallArea(double width, double height){
        this.width = width;
        this.height = height;
        if(width < 0){
            this.width = 0;
        }
        if(height < 0){
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if(height > 0){
            this.height = height;
        }
        else{
            this.height = 0;
        }
    }

    public void setWidth(double width) {
        if(width > 0){
            this.width = width;
        }
        else{
            this.width = 0;
        }
    }

    public double getArea(){
        return width * height;
    }
}
