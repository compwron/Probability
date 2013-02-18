import java.util.Random;

public class Die {
    Random random;
    Integer result;

    public Die(Random random){
        this.random = random;
        this.result = roll();
    }

    int roll(){
        int rollResult = random.nextInt();
        if(rollResult % 6 == 0){
            return 6;
        } else {
            return Math.abs(rollResult % 6);
        }
    }

    public boolean isSix(){
        return result == 6;
    }
}
