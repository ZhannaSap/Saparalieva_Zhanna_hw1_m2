public class Freshman extends Graduate{
    public Freshman(String name, Style style, AcademicPerfomance academicPerfomance) {
        super(name, style, academicPerfomance);
    }

    @Override
    public void print(String name) {
        System.out.println("Student " + this.getName() + " attended his/her first lesson!");
        System.out.println("Student`s level of style: " + this.getStyle());
    }
}
