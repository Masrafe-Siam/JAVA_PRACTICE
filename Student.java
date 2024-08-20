public class Student {
    private String name;
    private int id;
    private String number;
    private String address;
    
    public Student(String name, int id, String number, String address){
        this.name = name;
        this.id = id;
        this.number = number;
        this.address = address;
    }
    public void Info(){
        System.out.println("Name         : "+name);
        System.out.println("ID           : "+id);
        System.out.println("Phone Number : "+number);
        System.out.println("Address      : "+address);
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1 = new Student("Sam", 1001, "82846***6464", "5/3, Lake View, Munich");
        Student s2 = new Student("John", 1002, "43456***4534", "6/6, Lake view, Munich");
        s1.Info();
        s2.Info();
    }
}
