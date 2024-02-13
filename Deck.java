public class Deck {
    private String[][]deck = new String[13][4];
    
    public Deck(){
        String[][]deck1 = {{"AHeart","ADiamond","ASpaid","AClub"},{"2Heart","2Diamond","2Spaid","2Club"},
        {"3Heart","3Diamond","3Spaid","3Club"},{"4Heart","4Diamond","4Spaid","4Club"},{"5Heart",
        "5Diamond","5Spaid","5Club"},{"6Heart","6Diamond","6Spaid","6Club"},{"7Heart","7Diamond",
        "7Spaid","7Club"},{"8Heart","8Diamond","8Spaid","8Club"},{"9Heart","9Diamond","9Spaid",
        "9Club"},{"10Heart","10Diamond","10Spaid","10Club"},{"JHeart","JDiamond","JSpaid","JClub"},
        {"QHeart","QDiamond","QSpaid","QClub"},{"KHeart","KDiamond","KSpaid","KClub"}};

        for(int r = 0;r<deck1.length;r++){
            for(int c = 0;c<deck1[r].length;c++){
                deck[r][c]=deck1[r][c];
            }
        }
    }

    public void resetDeck(){
        String[][]deck1 = {{"AHeart","ADiamond","ASpaid","AClub"},{"2Heart","2Diamond","2Spaid","2Club"},
        {"3Heart","3Diamond","3Spaid","3Club"},{"4Heart","4Diamond","4Spaid","4Club"},{"5Heart",
        "5Diamond","5Spaid","5Club"},{"6Heart","6Diamond","6Spaid","6Club"},{"7Heart","7Diamond",
        "7Spaid","7Club"},{"8Heart","8Diamond","8Spaid","8Club"},{"9Heart","9Diamond","9Spaid",
        "9Club"},{"10Heart","10Diamond","10Spaid","10Club"},{"JHeart","JDiamond","JSpaid","JClub"},
        {"QHeart","QDiamond","QSpaid","QClub"},{"KHeart","KDiamond","KSpaid","KClub"}};

        for(int r = 0;r<deck1.length;r++){
            for(int c = 0;c<deck1[r].length;c++){
                deck[r][c]=deck1[r][c];
            }
        }
    }

    public void printDeck(){
        for(int r = 0;r<deck.length;r++){
            for(int c = 0;c<deck[r].length;c++){
                System.out.print(deck[r][c] + " ");
            }
            System.out.println();
        }
    }
    
    public void getCard(){
        int num = (int)(Math.random()*52)+1;
    }
}
