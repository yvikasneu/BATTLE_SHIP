public class Ship {
    private int size; 
    private int[] position; 


    public void setPosition(int[] position){
        this.position  = position; 
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int[] getPosition() {
        return position;
    }

}
