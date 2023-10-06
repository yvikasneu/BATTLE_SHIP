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
        
        // ARRANGING SHIPS
        computer.randomlyArrangeShips(); 
        mainPlayer.arrangeShips(); 
         
        // STARTING GAME
        game1.startGame();


        // Players starts attacking each other using Torpedoes
        mainPlayer.addTorpedoes(new Torpedo(1, 1));        
        computer.addTorpedoes(new Torpedo(5, 1));

        // Printing the game result
        Result result = game1.getResult();
        if(result.getWinner() == null){
            System.out.println("Game draw");
        }
        else{
            System.out.println(result.getWinner().getName() + " " + "Won");
        }

        
    }
}
