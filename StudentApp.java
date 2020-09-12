import java.util.*;
class Student
{
 private String name;
 private int roll,age,m1,m2,m3;
 private double avg;
 public Student()
 {
  this.name="Unknowm";
  this.age=0;
  this.roll=0;
  this.m1=0;
  this.m2=0;
  this.m3=0;
 }
 public void getDetails()
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the Student name : ");
  name=in.nextLine();
  System.out.println("Enter the age : ");
  age=in.nextInt();
  System.out.println("Enter the roll no :");
  roll=in.nextInt();
  System.out.println("Enter the marks : ");
  m1=in.nextInt();
  m2=in.nextInt();
  m3=in.nextInt();
 }
 public void DispDetails()
 {
  System.out.println("Student name : "+name);
  System.out.println("Student Age : "+age);
  System.out.println("Student Roll no : "+roll);
  System.out.println("Marks : "+"\n"+m1+"\n"+m2+"\n"+m3);
  System.out.println("Average : "+avg);
 }
 public void Average()
 {
  avg = (m1+m2+m3)/3;
 }
}
public class StudentApp
{
 public static void main(String[] args)
 {
  Scanner in =new Scanner(System.in);
  int size;
  System.out.println("Enter the number of students : ");
  size=in.nextInt();
  Student []t1=new Student[size];
  for(int i =0 ;i<size;i++)
  {
   t1[i].getDetails();
   t1[i].Average();
  }
  for(int i =0 ;i<size;i++)
   t1[i].DispDetails();
 }
}