import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("ка");
        A.add("при");
        A.add("очки");
        A.add("цветы");
        A.add("привет");
        System.out.println(A);

        ArrayList<String> B = new ArrayList<>();
        B.add("1");
        B.add("2");
        B.add("3");
        B.add("4");
        B.add("5");

        ArrayList<String> C = new ArrayList<>();
       // C.addAll(A);
        //C.addAll(B);
         while (A.size() > 0) {
            int i = 0;
            int i1 = 1;
            int i2 = 2;
            int i3 = 3;
            int i4 = 4;
            C.add(A.get(i) + B.get(i + 0));
            C.add(A.get(i1) + B.get(i1 + 0));
            C.add(A.get(i2) + B.get(i2 + 0));
            C.add(A.get(i3) + B.get(i3 + 0));
            C.add(A.get(i4) + B.get(i4 + 0));
            System.out.println(C);
            break;
        }
        for (String ret : C) {
            System.out.println(ret);
        }
    }
}


