import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void createStudent() {
        Student test = new Student(1L, "Test" );
        Student nullTest = null;
        assertNull(nullTest);
        assertNotNull(test);
    }
    @Test
    public void studentFieldsTest() {
        String name = "Test";
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(100);
        grades.add(80);
        grades.add(79);
        long l = 1L;

        Student test = new Student(l, name, grades);

        test.setName(name);
        assertSame(name, test.getName());
        test.setGrades(grades);
        assertSame(grades, test.getGrades());
        test.setId(1L);
        assertSame(1L, test.getId());
    }
    @Test
    public void addGradeTest() {
        Student test = new Student(1L, "Test");
        test.addGrade(100);
        assertSame(100,test.getGrades().get(0));
        test.addGrade(90);
        assertSame(90, test.getGrades().get(1));
        test.addGrade(80);
        assertSame(80, test.getGrades().get(2));
    }

    @Test
    public void testGetGradeAverage () {
        Student test = new Student(1L , "Name");
        test.addGrade(100);
        test.addGrade(50);
        assertEquals(75, test.getGradeAverage());
    }
}
