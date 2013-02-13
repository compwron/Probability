import java.util.Random;

public class Coin {
    Random random;

    public Coin(Random random){
        this.random = random;
    }

    public String flip(){
        if (random.nextInt() % 2 == 1){
            return "Heads";
        } else {
            return "Tails";
        }
    }
}
