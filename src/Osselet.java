import java.util.Arrays;
import java.util.List;

public class Osselet extends RollObject {
    private int nbFaces;

    public Osselet(){
        this.Faces = Arrays.asList(1, 3, 4, 6);
        this.nbFaces = 4;
    }
}
