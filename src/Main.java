import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Раз ", "Два ", "Провода ", "Боевой вертолет ", "Пельмени ", "Два ", "Раз ", "Меня ", "Два ", "Боевой вертолет ", "Меня "};
        RemoveDoubles task2 = new RemoveDoubles(arr);
        task2.show();




        String example = "Example text 123!";
        String example1 = new String("Example text 123!");
        String example3 = example;
        String example5 = example + "Any Text" + example1 + 28;
        String example4 = arr.toString();

        System.out.println("example == example1 = " + (example == example1));
        System.out.println("example.equals(example1) = " + example.equals(example1));
        System.out.println("example == example3 = " + (example == example3));
    }
}
