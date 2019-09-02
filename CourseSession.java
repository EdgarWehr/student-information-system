public class CourseSession
{
    private String department;
    private String number;
    private int numberStudents;
    private Student[] allStudents;
    
    public CourseSession(String department, String number)
    {
        this.department = department;
        this.number = number;
        this.numberStudents = 0;
        this.allStudents = new Student[20];
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
    
    public void enroll(Student studentN)
    {
        allStudents[numberStudents] = studentN;
        numberStudents += 1;
    }
    
    public Student getStudent(int p)
    {
        return allStudents[p];
    }
}