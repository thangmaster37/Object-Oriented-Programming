package Bai1_2;

public class TestPerson
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Nguyen Van C", "Nha Trang");
        System.out.println(person1);

        Student student1 = new Student("Nguyen Van A", "Ha Noi", "Python", 2000, 1000);
        System.out.println(student1);
        student1.setProgram("Java");
        System.out.println(student1);

        Staff staff1 = new Staff("Nguyen Van B", "TP HCM", "Amsterdam", 2000);
        System.out.println(staff1);
        staff1.setSchool("HUS");
        System.out.println(staff1);
    }
}
