public class Human extends Player{

    Human(String name) {
        super(name);
    }

    // TAKE INPUT FROM THE USER AND ARRANGE SHIPS ACCORDINGLY
    public void arrangeShips(){
        Ship ship1 = new Submarine();        
        Ship ship2 = new Submarine();        
        Ship ship3 = new Destroyer();
        Ship ship4 = new Cruiser();
        Ship ship5 = new Carrier();

        this.addShip(ship1);      
        this.addShip(ship2);
        this.addShip(ship3);
        this.addShip(ship4);
        this.addShip(ship5);
    } 
    
}
