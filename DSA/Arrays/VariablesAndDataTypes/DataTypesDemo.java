package DSA.Arrays.VariablesAndDataTypes;

public class DataTypesDemo {
    public static void main(String[] args) {
//        Primitive Data Type
//          The Data types which has fixed memory alloctation size .there are 8 Primitive DataTypes in Java.
        byte age = 20;   // 1 byte = -2*10^7 to 2*10^7     (-128 to 127)
        short Recharge = 599; // 2 bytes = -2*10^15 to 2*10^15  (-32768 to 32767)
        int Salary = 25000000; // 4 bytes = -2*10^31  to 2*10^31  (-2147483648 to 2147483647)
        long Mobile_no = 7709648063l; // 8 bytes = -2*10^63  to 2*10^63 (-9223372036854775808 to 9223372036854775807)
        float balance = 100.00f;// 4 bytes = -2*10^31  to 2*10^31  (-2147483648 to 2147483647)
        double balance2 = 100000000000000.00d;// 8 bytes =  -2*10^63  to 2*10^63 (-9223372036854775808 to 9223372036854775807)
        char gender = 'a'; // 1 byte = -2*10^7 to 2*10^7     (-128 to 127)
        boolean flag = false; //  1 bit

        //Refrenece Data Types or Non - Primitive Data Types
        //Object , Class , Interface and Array
        //The Data Types whose Memory alloctaion size is not fixed , these data types is known as refrence datatypes.

        String name = " Aditya"; // String is a Non-Primitive Datatype becuase it is a Class.
    }
}
