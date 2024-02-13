public class Stats {
    private int wins;
    private int losses;

    public Stats(){
        wins = 0;
        losses = 0;
    }

    public void addWin(){
        wins+=1;
    }
    public void addLoss(){
        losses+=1;
    }
    
    public int getWins(){
        return wins;
    }
    public int getLosses(){
        return losses;
    }

    public double calcWinPercentage(){
        return (double)wins/losses;
    }
    
}
