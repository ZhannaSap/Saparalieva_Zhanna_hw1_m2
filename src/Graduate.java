public class Graduate extends Student{

    public Graduate(String name, Style style, AcademicPerfomance academicPerfomance) {
        super(name, style, academicPerfomance);
    }

    public void print(String name){
        System.out.println("Student " + name + " attended lesson.");
        System.out.println("Student`s level of style: " + this.getStyle());
    }


    public final void print(){
        System.out.println("Student: " + this.getName() + "\nAcademic perfomance: "
                + "\nMidterm exam: " + this.getAcademicPerfomance().getMidTermExam()
                + "\nFinal exam: " + this.getAcademicPerfomance().getFinalExam());
    }
}
