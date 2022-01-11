package day33_Statics;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int StudentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, char gender, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name);
        StudentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", StudentID=" + StudentID +
                ", grade=" + grade +
                '}';
    }
}

