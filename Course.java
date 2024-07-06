
public class Course {

    private final CourseType type;
    private final double cost;

    public Course(CourseType type) {
        this.type = type;
        this.cost = type.getCost();
    }

    public CourseType getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return type + " - RM" + cost;
    }
}
