import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice extends RollObject {
    private int nbFaces;

    public Dice(ArrayList<Integer> faces){
        if (faces.size() < 3){
            this.Faces = faces.subList(0, faces.size());
            for (int i = this.Faces.size(); i<3; i++){
                Random r = new Random();
                this.Faces.add(r.nextInt(this.Faces.size()));
            }
        }else if (faces.size() > 20){
            this.Faces = faces.subList(0, 21);
        }else{
            this.Faces = faces.subList(0, faces.size());
        }
        this.nbFaces = this.Faces.size();
    }

}
