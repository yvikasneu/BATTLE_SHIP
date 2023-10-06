public class Result {
    private Player winner; 
    private int score; 


    Result(Player player1, Player player2){
        int player1Score = player1.getScore();         
        int player2Score = player2.getScore(); 
        
        this.score = player1Score > player2Score ? player1Score :  player2Score;
        this.winner = player1Score > player2Score ? player1 : player2;
    }

    public Player getWinner() {
        return winner;
    }

    public int getScore() {
        return score;
    }
}
