package PracticeQuestion;

import java.util.Objects;

public class Student {
    int rollID;
    String branch;
    String gender;

    public Student(int rollID, String branch, String gender) {
        this.rollID = rollID;
        this.branch = branch;
        this.gender = gender;
    }

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return(this.rollID==s.rollID && this.branch.equals(s.branch) && this.gender.equals(s.gender));
    }

    public int hashCode() {
        return Objects.hash(rollID,branch,gender);
    }

}

class S{
    public static void main(String[] args) {
        Student s1 = new Student(01,"Science","Male");
        Student s2 = new Student(01,"Science","Male");
        Student s3 = new Student(01,"Science","Male");
        Student s4 = new Student(01,"Science","Male");

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }

}