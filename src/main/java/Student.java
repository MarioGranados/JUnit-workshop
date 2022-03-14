import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    protected long id;
    protected String name;
    protected ArrayList<Integer> grades = new ArrayList<>();

    Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade (int grade) {
        grades.add(grade);
    }
    public long getGradeAverage () {
        int totalGrades = 0;
        for(int grade : this.grades) {
            totalGrades += grade;
        }
        return totalGrades / this.grades.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(100);
        grades.add(70);
        grades.add(80);

        Student st = new Student(23425, "Mario", grades);

        System.out.println("--------------");
        System.out.println("Grades: " + st.getGrades());
        System.out.println("Id: " + st.getId());
        System.out.println("name: " + st.getName());
        System.out.println("--------------");
    }
}
