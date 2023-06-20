class student
{
    String name;
    int marks;
    int rollno;
}

  public class enhancedforloop
  {
    public static void main(String a[])
    {
        student s1=new student();
        s1.rollno=48;
        s1.marks=89;
        s1.name="shreyas";

        student s2=new student();
        s2.rollno=468;
        s2.marks=99;
        s2.name="vinay";

        student s3=new student();
        s3.rollno=20;
        s3.marks=91;
        s3.name="sandeep";

        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(student stud :students)
        {
            System.out.println(stud.name +" : "+ stud.marks);
        }
    }
  }
