import java.util.Date;

public class Game {
    private Player player1; 
    private Player player2; 
    private Date startDate; 
    private Date endDate; 
    private String status; 
    private Grid player1Grid; 
    private Grid player2Grid; 

    Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }


    public void startGame() {
        this.startDate = new Date();
        this.status = "running"; 
    }

    public void endDate(){
        this.endDate = new Date();
        this.status = "ended";
    }

    public Result getResult() {
        Result result = new Result(this.player1, this.player2); 
        return result;
    }


    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public String getStatus() {
        return status;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setPlayer1Grid(Grid player1Grid) {
        this.player1Grid = player1Grid;
    }

    public void setPlayer2Grid(Grid player2Grid) {
        this.player2Grid = player2Grid;
    }
}
