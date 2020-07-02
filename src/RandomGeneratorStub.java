import java.util.ArrayList;
import java.util.List;

public class RandomGeneratorStub {
    private List<Integer> indexesTurn;
    private Integer position;

    public void indexes(List<Integer> face){
        List<Integer> idx = new ArrayList<>();
        int i = 0;
        for (i=0; i<face.size(); i++){
            idx.add(i);
        }
        this.indexesTurn = idx;
    }

    public int run(List<Integer> list){
        if (this.indexesTurn == null || this.indexesTurn.size() != list.size()) {
            this.indexes(list);
            this.position = 0;
        }
        if (this.position > list.size()){
            this.position = 0;
        }
        Integer value = list.get(this.position);
        this.position += 1;
        return value;
    }
}
