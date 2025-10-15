package DSA.LinearDataStructure.Arrays;

class Student{
    int id;
    String name;


    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class ArrayOfObj {
    public static void main(String[] args) {
        Student[] stud_arr = new Student[5];
        stud_arr[0]= new Student(1,"Aditya");
        stud_arr[1]= new Student(2,"Utkarsh");
        stud_arr[2]= new Student(3,"Parshwa");
        stud_arr[3]= new Student(4,"Saurabh");
        stud_arr[4]= new Student(5,"Karan");

        for(int i=0;i<stud_arr.length;i++){
            System.out.println(stud_arr[i].id+" "+stud_arr[i].name);
        }
    }
}
