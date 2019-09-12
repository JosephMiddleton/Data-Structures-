import java.util.ArrayList;

public class Schedule {

   private ArrayList<Course>m_courses = new ArrayList<Course>();

public static void main(String args[]) {
    Schedule s = new Schedule();
}

public Schedule() {
}

public void addCourse(Course C) {
    m_courses.add(C);
}

public String toString() {
    String Schedule = "Your Schedule\n";
    for (Object o  : m_courses) {
       Schedule += o.toString();
       System.out.println();
    }
    return Schedule;
}

}









