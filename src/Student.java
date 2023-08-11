public class Student {
    private String name;
    private Style style;
    private AcademicPerfomance academicPerfomance;

    public Student(String name, Style style, AcademicPerfomance academicPerfomance) {
        this.name = name;
        this.style = style;
        this.academicPerfomance = academicPerfomance;
    }

    public String getName() {
        return name;
    }

    public Style getStyle() {
        return style;
    }

    public AcademicPerfomance getAcademicPerfomance() {
        return academicPerfomance;
    }
}
