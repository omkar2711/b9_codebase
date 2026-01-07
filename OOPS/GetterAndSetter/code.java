package OOPS.GetterAndSetter;


class employee{
    private String name;
    private int id;

    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
    void setId(int i){
        id = i;
    }
    int getId(){
        return id;
    }
}



public class code {
    public static void main(String[] args) {
        employee em = new employee();
        em.setName("aditya");

        System.out.println(em.getName());
    }
}
