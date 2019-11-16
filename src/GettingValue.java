import sun.plugin2.gluegen.runtime.StructAccessor;

public class GettingValue {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4};

        int firstValue = table[0];
        System.out.println("First: " + firstValue);
        System.out.println("Second: " + table[1]);

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }

        //for-each
        for (int value : table) {
            System.out.println(value);
        }
        for (int value : table) {
            value = 1; // to nie zadziała bo to jest zmiana referencji : w pythonie powinno zadziałac:) jako wypełnienie tablicy
            System.out.println(value);
        }
        int[] emptyTable = new int[4];
        System.out.println(emptyTable[0]);
        System.out.println(emptyTable[1]);
        System.out.println(emptyTable[2]);
        System.out.println(emptyTable[3]);
        //System.out.println(emptyTable[4]); //index out ofbounds

    }
}
