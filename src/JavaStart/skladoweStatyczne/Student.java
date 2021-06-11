package JavaStart.skladoweStatyczne;

public class Student {

    public static int studentsNumber = 0;


    private String name;
    private String surname;
    private int indexNumber;

    public Student(String name, String surname, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;
        studentsNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentsNumber=" + studentsNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", indexNumber=" + indexNumber +
                '}';
    }
}

