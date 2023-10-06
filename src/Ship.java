public class Ship {
    private int size; 
    private int[] position; 
    private String type; 


    public void setPosition(int[] position){
        this.position  = position; 
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setType(String type) {
      this.type = type;
    }

    public String getType() {
        return type;
    }

    public int[] getPosition() {
        return position;
    }

}
