package com.studentroster;
import java.util.ArrayList;
/**
 * Created by joshkennede on 8/22/16.
 */

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

        Roster.printAll();
        Roster.printInvalidEmails();
        Roster.printAverageGrade("1");
        Roster.remove("3");
        Roster.remove("3");
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
    public static void printAll()
    {
        for (Student student : students)
        {
            student.print();
        }
    }
    //method for printing invalid emails
    public static void printInvalidEmails()
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
    public static void printAverageGrade(String studentId)
    {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                double totalGrades = student.getGrade1() + student.getGrade2() + student.getGrade3();
                double gradeAverage = totalGrades / 3;

                System.out.println("Student " + studentId + "'s average grade overall is " + gradeAverage);
            }
        }
    }
}
