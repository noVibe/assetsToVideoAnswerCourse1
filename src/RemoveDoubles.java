import java.util.ArrayList;

public class RemoveDoubles {


    String[] arr;
    ArrayList<String> copiesOut = new ArrayList<>();
    StringBuilder answer = new StringBuilder();
    boolean isCopy = false;

    public RemoveDoubles(String[] arr) {
        this.arr = arr;
    }

    public void show() {
        for (String bit : arr) {
            for (String i : copiesOut) {
                if (bit.equals(i)) {
                    isCopy = true;
                    break;
                }
            }
            if (isCopy) {
                continue;
            }
            copiesOut.add(bit);
            answer.append(bit);
            isCopy = false;
        }

        System.out.println(answer);

    }
}

