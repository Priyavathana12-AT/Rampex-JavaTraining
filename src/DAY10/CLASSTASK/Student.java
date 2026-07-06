package DAY10.CLASSTASK;

public class Student {
    String name;
    int id;
    String dept;
    public static void main(String[] args) {

        Student S1 = new Student();
        Student S2 = new Student();
        S1.name = "Riya";
        S2.name = "Diya";
        S1.id = 1;
        S2.id = 2;
        S1.dept = "AIDS";
        S2.dept = "ECE";

        System.out.println("ID number " + S1.id + " is " + S1.name + " who was studying in " + S1.dept);
        System.out.println("ID number " + S1.id + " is " + S2.name + " who was studying in " + S2.dept);
    }
}