public class App {
    public static void main(String[] args) throws Exception {
        
        // CREATING AN USER ACCOUNT
        Account myAccount = Account.register("vikas@gmail.com", "123455", "CANADA", 23);

        // RESENTING PASSWORD
        myAccount.resetPassword("newpassword123");


        // ADD TWO PLAYER
        Human mainPlayer = new Human("Vikas");
        Computer computer = new Computer(); 

        // CREATING A GAME 
        Game game1 = new Game(mainPlayer, computer);

        // DEFINE GRIDS FOR BOTH PLAYERS
        game1.setPlayer1Grid(new Grid(10, 10));        
        game1.setPlayer2Grid(new Grid(10, 10));

        
        // ARRANGING SHIPS
        computer.randomlyArrangeShips(); 
        mainPlayer.arrangeShips(); 
         
        // STARTING GAME
        game1.startGame();


        // Players starts attacking each other using Torpedoes
        mainPlayer.addTorpedoes(new Torpedo(1, 1));        
        computer.addTorpedoes(new Torpedo(5, 1));

        System.out.println("");
        System.out.println("Game: " +  mainPlayer.getName()  + " vs " + computer.getName());
        System.out.println("");
        System.out.println("Player 1 " + mainPlayer.getName()  + "'s ships :");
        for (Ship ship : mainPlayer.getShips()) {
            System.out.println("Type -> " +  ship.getType() + ", Size -> " + ship.getSize());
        }
        System.out.println("");
        System.out.println("Player 2 " + computer.getName()  + "'s ships :");
        for (Ship ship : computer.getShips()) {
            System.out.println("Type -> " +  ship.getType() + ", Size -> " + ship.getSize());
        }
        
    }
}
