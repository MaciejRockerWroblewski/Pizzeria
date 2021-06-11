package JavaStart.skladoweStatyczne;

public class University {
    public static void main(String[] args) {

        System.out.println("Liczba studentów przed zapisami: "
                + Student.studentsNumber);

        Student student1 = new Student("Jan",
                "Kowalski", 1234567890);
        //studentsNumber = studentsNumber +1;
        Student student2 = new Student("Katarzyna",
                "Ruda", 1876543210);
        //studentsNumber = studentsNumber +1;
        System.out.println("Lista studentów po zapisach: "
                + Student.studentsNumber);

    }
}