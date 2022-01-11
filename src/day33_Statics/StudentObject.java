package day33_Statics;

import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun", 'F');

        Student student3 = new Student("Nigara", 'F', 32);

        Student student4 = new Student("Mert", 'M', 26, 13);

        Student student5 = new Student("Cihad", 'M', 39, 11, 'A');
        System.out.println(student1 == student2);

        Student[] students = {student1, student2, student3, student4, student5};

        System.out.println(Arrays.toString(students) );


    }





}
