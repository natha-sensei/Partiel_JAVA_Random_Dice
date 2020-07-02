import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> face = new ArrayList<>();
        face.add(1);
        face.add(5);
        face.add(12);
        face.add(16);

        Dice d = new Dice(face);
        for (int i = 0; i<2; i++){
            System.out.println(d.IntGenerator());
        }

        System.out.println("------------------");

        for (int i = 0; i<3; i++){
            System.out.println(d.IntGeneratorStub());
        }
    }
}
