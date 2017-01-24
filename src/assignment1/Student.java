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
public class Student 
{
    private int age;
    private int idNumber;
    private String firstName;
    private String lastName;
    private int[] examResults;
    
    
    public Student(int idNum, String fName, String lName, int age, int[] examRes)
    {
        idNumber=idNum;
        firstName=fName;
        lastName=lName;
        this.age=age;
        
    }
    
    
}
