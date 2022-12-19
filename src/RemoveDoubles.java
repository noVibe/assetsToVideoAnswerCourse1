import java.util.HashSet;
public class RemoveDoubles {
    String[] arr;
    HashSet<String> copiesOut = new HashSet<>();
    StringBuilder answer = new StringBuilder();
    public RemoveDoubles(String[] arr) {
        this.arr = arr;
    }
    public void show() {
        for (String bit : arr) {
            if (copiesOut.contains(bit)) {
                continue;
            }
            copiesOut.add(bit);
            answer.append(bit);
        }
        System.out.println(answer);
    }
}

