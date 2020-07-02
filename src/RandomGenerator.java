import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public int run(List<Integer> face){
        int max =  face.size();
        Random r = new Random();
        return face.get(r.nextInt(max));
    }
}

