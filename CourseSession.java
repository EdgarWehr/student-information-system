import java.util.ArrayList;


public class CourseSession
{
    private String department;
    private String number;
    private int numberStudents;
    private ArrayList<Student> allStudents;
    
    public CourseSession(String department, String number)
    {
        this.department = department;
        this.number = number;
        this.numberStudents = 0;
        this.allStudents = new ArrayList<Student>();
    }
    
    public String getDepartment()
    {
        return this.department;
    }
    
    public String getNumber()
    {
        return this.number;
    }
    
    public int getNumberOfStudents()
    {
        return numberStudents;
    }
    
    public void enroll(Student student)
    {
        allStudents.add(student);
        numberStudents += 1;
    }
    
    public Student getStudent(int p)
    {
        return allStudents.get(p);
    }
    
    public Student getStudent(String a)
    {
        for(int i = 0; i < numberStudents; i++)
        {
            Student student = allStudents.get(i);
            if(student.getName() == a)
            {
                return student;
            }
        }
        return null;
    }
    
    public void unenroll(Student student)
    {
        allStudents.remove( student );
        numberStudents--;
    }
}