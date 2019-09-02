

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CourseSessionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CourseSessionTest
{
    /**
     * Default constructor for test class CourseSessionTest
     */
    public CourseSessionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testCreate()
    {
        CourseSession session1 = new CourseSession("ENGL","101");
        assertEquals("ENGL", session1.getDepartment());
        assertEquals("101", session1.getNumber());
        assertEquals(0,session1.getNumberOfStudents());
    }
    
    @Test
    public void testRollStudent()
    {
        CourseSession session1 = new CourseSession("ENGL","101");
        
        Student student1 = new Student("Cain DiVoe");
        
        session1.enroll( student1 );
        assertEquals(1, session1.getNumberOfStudents());
        
        Student student2 = new Student("Carol DeVaughne");
        
        session1.enroll( student2 );
        assertEquals(2, session1.getNumberOfStudents());
        
        assertEquals(student1, session1.getStudent(0));
        assertEquals(student2, session1.getStudent(1));
    }
    /*
    @Test
    public void unenrollStudent()
    {
        CourseSession session1 = new CourseSession("ENGL","101");
        
        Student student1 = new Student("Jack Ford");
        session1.enroll( student1 );
        session.unenroll( student1 );
        assertEquals(null, session1.getStudent("Jack Ford"));
    }*/
}
