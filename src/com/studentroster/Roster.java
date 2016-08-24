package com.studentroster;
import java.util.ArrayList;

/* * Created by joshkennede on 8/22/16.
 * IntelliJ IDEA 2016.2.1
 * Build #IC-162.1447.26, built on August 2, 2016
 * JRE: 1.8.0_76-release-b216 x86_64
 * JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
 * */

public class Roster {

    private static ArrayList<Student> students = new ArrayList<>();

    //main method to run the program
    public static void main(String[] args)
    {
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                            "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                            "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                            "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                            "5,Josh,Kennedy,jkenn66@wgu.edu,29,80,94,70"};

        // Split the input string by comma
        for(int i = 0; i < students.length; i++)

        {
            String characters = students[i];
            String[] arrayVar = characters.split(",");
            String studentId = arrayVar[0];
            String firstName = arrayVar[1];
            String lastName = arrayVar[2];
            String email = arrayVar[3];

            int age = Integer.parseInt(arrayVar[4]);
            int grade1 = Integer.parseInt(arrayVar[5]);
            int grade2 = Integer.parseInt(arrayVar[6]);
            int grade3 = Integer.parseInt(arrayVar[7]);

            // use the add method to add a student to the students ArrayList
            Roster.add(studentId, firstName, lastName, email, age, grade1, grade2, grade3);
        }

        //method calls for wgu project requirements
        Roster.print_all(); //prints all students + info
        Roster.print_invalid_emails(); //prints invalid email(s)
        Roster.print_average_grade("5"); //optional method call - prints my average grade
        Roster.remove("3"); //prints the result of removing the third student in the Array
        Roster.remove("3"); //prints the confirmation that the third student has been removed
    }

    public static void add(String studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3)
    {
        Student student = new Student(studentId, firstName, lastName, email, age, grade1, grade2, grade3);
        students.add(student);
    }

    //method for removing a student from the roster
    public static void remove(String studentId)
    {
        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getStudentId().equals(studentId))
            {
                students.remove(i);
                System.out.println("Student " + studentId + " has been removed.");
                return;
            }
        }
        System.out.println("Error: Student ID " + studentId + " can not be found.");
    }

    //method for printing the entire student arrayList
    public static void print_all()
    {
        for (Student student : students)
        {
            student.print();
        }
    }

    //method for printing invalid emails
    public static void print_invalid_emails()
    {
        String invalidEmail = "Invalid email address: ";
        for(Student Student : students)
        {
            String emailsInRoster = Student.getEmail();
            if (!(emailsInRoster.contains("@")) || (emailsInRoster.contains(" ")) || !(emailsInRoster.contains(".")))
            {
                System.out.println(invalidEmail + emailsInRoster);
            }
        }
    }

    //method for printing the average grade of a given student
    public static void print_average_grade(String studentId)
    {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                int totalGrades = student.getGrade1() + student.getGrade2() + student.getGrade3();
                int gradeAverage = totalGrades / 3;

                System.out.println("Student " + studentId + "'s average grade overall is " + gradeAverage);
            }
        }
    }
}