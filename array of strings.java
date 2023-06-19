//in this file name should be same of method class name

class student
{
    int rollno;
    int marks;
    String name;
}

public class arraysofstring
   {
    public static void main(String a[])
    {
        student s1=new student();
        s1.rollno=48;
        s1.marks=99;
        s1.name="shreyas";

        student s2=new student();
        s2.rollno=68;
        s2.marks=91;
        s2.name="shrs";

        student s3=new student();
        s3.rollno=05;
        s3.marks=59;
        s3.name="shreya";

        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + " "+ students[i].marks );
        }



    }
   }
