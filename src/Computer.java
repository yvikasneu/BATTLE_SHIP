public class Computer extends Player {

    Computer() {
        super("COMPUTER");
    }

    // RANDOMLY ARRANGES SHIPS
    public void randomlyArrangeShips(){
        for (int i = 0; i < 6; i++) {
            this.addShip(this.getRandomShip());      
        }
    } 

    // GENERATES RANDOM SHIP
    public Ship getRandomShip() {
        Ship ship1 = new Submarine();        
        Ship ship2 = new Battleship();        
        Ship ship3 = new Destroyer();
        Ship ship4 = new Cruiser();
        Ship ship5 = new Carrier();
        Ship[] ships = {ship1, ship2, ship3, ship4, ship5};
        return ships[(int)Math.random() * 5];
    }
    
}
