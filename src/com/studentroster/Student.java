package com.studentroster;

/**
 * Created by joshkennede on 8/22/16.
 */
public class Student {

    //Student class which includes: student ID, first name, last name, e-mail address, age, and array of grades.
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int grade1;
    private int grade2;
    private int grade3;
    private final int GRADES = 3;
    int[] grades = new int[GRADES];

    //Student constructor
    public Student(String studentId, String firstName, String lastName,
                   String email, int age, int grade1, int grade2, int grade3)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        setGrade1(grade1);
        setGrade2(grade2);
        setGrade3(grade3);
    }
    //accessor for studentId
    public String getStudentId()
    {
        return studentId;
    }
    //mutator for changing student id
    private void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }
    //accessor for firstName method
    public String getFirstName()
    {
        return firstName;
    }
    //mutator for firstName method
    private void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    //accessor for lastName method
    public String getLastName()
    {
        return lastName;
    }
    //mutator for lastName method
    private void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    //accessor for getEmail method
    public String getEmail()
    {
        return email;
    }
    //mutator for changing email
    private void setEmail(String eMail)
    {
        this.email = eMail;
    }
    //accessor for reading student age
    public int getAge()
    {
        return age;
    }
    //mutator for setAge method - changing students age
    private void setAge(int age)
    {
        this.age = age;
    }
    //accessor for reading first grade in array
    public int getGrade1()
    {
        return grades[0];
    }
    //mutator for changing first grade in array
    private void setGrade1(int grade1)
    {
        this.grades[0] = grade1;
    }
    //accessor for reading second grade in array
    public int getGrade2()
    {
        return grades[1];
    }
    //mutator for changing second grade in array
    private void setGrade2(int grade2)
    {
        this.grades[1] = grade2;
    }
    //accessor for reading third grade in array
    public int getGrade3()
    {
        return grades[2];
    }
    //mutator for changing third grade in array
    private void setGrade3(int grade3)
    {
        this.grades[2] = grade3;
    }
    //method for printing all student data
    public void print()
    {
        String studentId = getStudentId();
        String firstName = getFirstName();
        String lastName = getLastName();
        String email = getEmail();
        int age = getAge();
        int grade1 = getGrade1();
        int grade2 = getGrade2();
        int grade3 = getGrade3();

        System.out.println("Student ID: " +studentId+ "\t Firstname: " +firstName+ "\t Lastname: "
                +lastName+ "\t Email: " +email+ "\t Age: " +age+ "\t Grades: " + "\t{"+grade1+ ","
                +grade2+ "," +grade3+ "}");
    }
}