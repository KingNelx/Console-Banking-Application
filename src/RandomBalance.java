import java.util.Random;

final public class RandomBalance {

    public int randomBalance(){
        int[] randomBalance={10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000};
        Random random=new Random();
        int randomNumber=random.nextInt(randomBalance.length);
        return(randomBalance[randomNumber]);
    }
}
