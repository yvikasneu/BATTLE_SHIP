public class Torpedo {
    private int x;     
    private int y;  

    Torpedo(){}

    Torpedo(int x, int y){
        this.x = x; 
        this.y = y; 

    }
    
    public void setCoordinates(int x, int y){
        this.x = x; 
        this.y = y; 
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
