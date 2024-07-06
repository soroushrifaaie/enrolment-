
public enum FeeType {

    IT_NETWORK("IT/Network"),
    LIBRARY("Library"),
    CLUB_SOCIETY("Club and Society");

    private final String name;

    FeeType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
