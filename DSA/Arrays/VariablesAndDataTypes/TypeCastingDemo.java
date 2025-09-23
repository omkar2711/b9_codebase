package DSA.Arrays.VariablesAndDataTypes;

public class TypeCastingDemo {
    public static void main(String[] args) {
        //Type Casting : Converting a data from one DataType into another DataType
        //Types :implicit / Automatic
        //      :Explicit / Manual

// 1)Implicit TypeCasting : small dataType Element is directly convert into LargeDataType Element.
        byte a = 10;
        short b = a;
        int e = a;
        float c = a;
        double d = a;

//  2) Explicit TypeCasting : Big DataType Element converts into Small DataType Element.
        int p = 5000;
        byte b1 = (byte) p;
        short s1 = (short) p;

        double d1 = 45.05d;
        float f1 = (float) d1;
        int b3 = (int) d1;
    }
}
