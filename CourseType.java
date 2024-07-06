
public enum CourseType {

    ENGLISH_REMEDIAL("English Remedial", 100, 1),
    MATH_REMEDIAL("Math Remedial", 100, 1),
    ENGINEERING_MATRICULATION("Engineering Matriculation", 500, 1),
    IT_MATRICULATION("IT Matriculation", 400, 1),
    BUSINESS_MATRICULATION("Business Matriculation", 300, 1),
    LAW_MATRICULATION("Law Matriculation", 350, 1),
    ENGINEERING_UNDERGRADUATE("Engineering Undergraduate", 600, 2),
    IT_UNDERGRADUATE("IT Undergraduate", 500, 2),
    BUSINESS_UNDERGRADUATE("Business Undergraduate", 400, 2),
    LAW_UNDERGRADUATE("Law Undergraduate", 450, 2),
    ENGINEERING_POSTGRADUATE("Engineering Postgraduate", 700, 3),
    IT_POSTGRADUATE("IT Postgraduate", 600, 3),
    BUSINESS_POSTGRADUATE("Business Postgraduate", 500, 3),
    LAW_POSTGRADUATE("Law Postgraduate", 550, 3);

    private final String name;
    private final double cost;
    private final int level;

    CourseType(String name, double cost, int level) {
        this.name = name;
        this.cost = cost;
        this.level = level;
    }

    public double getCost() {
        return cost;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return name;
    }
}
