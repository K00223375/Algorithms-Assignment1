/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author K00223375
 */
public class Student {

    private int age;
    private int idNumber;
    private String firstName;
    private String lastName;
    private int[] examResults = new int[6];

    public Student(int idNum, String fName, String lName, int age, int[] examRes) {
        this.idNumber = idNum;
        this.firstName = fName;
        this.lastName = lName.toUpperCase();
        this.age = age;

        for (int i = 0; i < examResults.length; i++) {
            this.examResults[i] = examRes[i];
        }
    }

    public Student() {
        this.idNumber = 123456;
        this.firstName = "Bob";
        this.lastName = "Bush".toUpperCase();
        this.age = 21;
        examResults[0] = 80;
        examResults[1] = 76;
        examResults[2] = 90;
        examResults[3] = 85;
        examResults[4] = 88;
        examResults[5] = 79;
    }

    public String printStudentDetails() {
        String studentInfo = "";
        String studentExams="";
        
        studentInfo += "ID = " + this.idNumber + "\n";
        studentInfo += "FName = " + this.firstName + "\n";
        studentInfo += "LName = " + this.lastName + "\n";
        studentInfo += "Age = " + this.age + "\n";
        for(int i=0; i<examResults.length;i++)
        {
            studentExams+= "Exam " + (i + 1)+": "+examResults[i]+"\n";
        }
        
        return studentInfo+studentExams;
    }
}
