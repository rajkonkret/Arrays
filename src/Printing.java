import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Collections;

public class Printing {
    public static void main(String[] args) {

        int[] table = {1, 2, 3, 4};

        System.out.print("[");
        for (int value : table) {
            //System.out.println(value);
            System.out.print(value + ", ");
        }
        System.out.println("]");

        //print by loop with StringBuilder
        StringBuilder builder = new StringBuilder();

        builder.append("[");
        for (int value : table) {
            builder.append(value);
            builder.append(", ");
        }
        builder.append("]");

        int last = builder.lastIndexOf(", ");
        builder.delete(last,last+2);
        System.out.println(builder.toString());
        System.out.println(builder);



        //other solution
        System.out.print("[");
        for (int value : table) {
            //System.out.println(value);
            System.out.print(value);
            System.out.print(",");
            System.out.print(" ");
        }
        System.out.println("]");
        System.out.println(Arrays.toString(table));
    }


}
