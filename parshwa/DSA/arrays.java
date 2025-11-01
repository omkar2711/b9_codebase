package parshwa.DSA;
public class arrays {
    public static void main(String[] args) {
        // // static array initialization
        // int[] arr={1,2,3,4,5};
        // System.out.println(arr.length);
        
        // dynamic array initialization
        // int n=5;
        // int[] arr2=new int[n];
        // arr2[0]=10;
        // System.out.println(arr2[0]);

        //create an array of size 6 and stores the names of students
        // String[] arr={"Parshwa","Priya","Aditi","Riya","Ankita","Pooja"};
        // System.out.println(arr.length);

        // dynamic array initialization
        int n=6;
        String[] arr=new String[n];
        arr[0]="Parshwa";
        arr[1]="Priya";
        arr[2]="Aditi";
        arr[3]="Riya";
        arr[4]="Ankita";
        // arr[5]="Pooja";
        // System.out.println(arr[5]);

        //accessing all the elements of an array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        

    }
}