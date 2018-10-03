//Questio 5 Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age;}

import java.util.*;

public class Student implements Comparator<Student> {
    String Name;
    Double Score;
    Double Age;

    public Student(String Name ,Double Score, Double Age) {
        this.Name = Name;
       this. Score = Score;
       this. Age = Age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Score=" + Score +
                ", Age=" + Age +
                '}';
    }

    public int compare(Student o1, Student o2) {
        int flag = (int) (o1.Score - o2.Score);
        if(flag==0) flag = this.Name.compareTo(Name);
        return flag;

    }

    public static void main(String[] args) {
        Student student = null;
        ArrayList list = new ArrayList<Student>();
        Student student1 = new Student("Faisal",70.00,23.00);
        Student student2 = new Student("Faizal",60.00,22.00);
        Student student3 = new Student("Amit",62.00,23.00);
        Student student4 = new Student("Talib",60.00,24.00);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
       // System.out.println(list);
        Collections.sort(list,student1);
       System.out.println(list);
    }
}
