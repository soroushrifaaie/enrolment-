
import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private static CourseManager instance;
    private final List<Course> courses;
    private final List<Fee> fees;

    private CourseManager() {
        courses = new ArrayList<>();
        fees = new ArrayList<>();
        initializeFees();
    }

    public static CourseManager getInstance() {
        if (instance == null) {
            instance = new CourseManager();
        }
        return instance;
    }

    private void initializeFees() {
        fees.add(new Fee(FeeType.IT_NETWORK, 50));
        fees.add(new Fee(FeeType.LIBRARY, 20));
        fees.add(new Fee(FeeType.CLUB_SOCIETY, 30));
    }

    public List<Fee> getFees() {
        return new ArrayList<>(fees);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addCourses(List<Course> courses) {
        this.courses.addAll(courses);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }
}
