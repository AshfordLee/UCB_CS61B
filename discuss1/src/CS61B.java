import java.util.ArrayList;

public class CS61B
{
    public static String university="UC Berkeley";
    public String semester;
    public CS61BStudent[] students;
    public int capacity;


    public CS61B(String semester,CS61BStudent[] signups)
    {
        this.students=new CS61BStudent[this.capacity];
        this.semester=semester;

        for (int i=0;i<this.capacity;i++)
        {
            this.students[i]=signups[i];
        }
    }

    public int makeStudentsWatchLecture()
    {
        int total=0;
        for (CS61BStudent student:this.students)
        {
            boolean watched=student.watchLecture();
            if (watched)
            {
                total+=1;
            }
        }

        return total;
    }

    public static void changeUniversity(String new_university)
    {
        university=new_university;
    }

    public void expand(int new_capacity)
    {
        this.capacity=new_capacity;
    }

}