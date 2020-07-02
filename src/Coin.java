import java.util.Arrays;
import java.util.List;

public class Coin extends RollObject {
    private int nbFaces;

    public Coin(){
        this.Faces = Arrays.asList(1, 2);
        this.nbFaces = 2;
    }
}
