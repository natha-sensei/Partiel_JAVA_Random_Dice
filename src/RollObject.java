import java.util.List;

public class RollObject {
    protected List<Integer> Faces;
    RandomGeneratorStub stub = new RandomGeneratorStub();

    public int IntGenerator(){
        return new RandomGenerator().run(this.Faces);
    }

    public int IntGeneratorStub(){
        return stub.run(this.Faces);
    }

}
