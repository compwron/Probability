import java.util.Random;

public class Die {
    Random random;
    public Die(Random random){
        this.random = random;
    }

    public int roll(){
        int rollResult = random.nextInt();
        if(rollResult % 6 == 0){
            return 6;
        } else {
            return rollResult % 6 ;
        }
    }
}
