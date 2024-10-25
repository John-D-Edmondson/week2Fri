package blackjack;

public class Player {
    public Player(){

    }

    public boolean isStuck() {
        return stuck;
    }

    public void setStuck(boolean stuck) {
        this.stuck = stuck;
    }

    private boolean stuck = false;
    private boolean bust = false;

    public boolean isBust() {
        return bust;
    }

    public void setBust(boolean bust) {
        this.bust = bust;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int addingCard) {
        this.total += addingCard;
    }

    private int total = 0;


}
