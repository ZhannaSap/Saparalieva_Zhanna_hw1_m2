public class Main {
    public static void main(String[] args) {

        Graduate graduate = new Graduate("Tom", Style.BAD, new AcademicPerfomance(95, 100));
        Freshman freshman1 = new Freshman("Verossica", Style.EXELLENT,new AcademicPerfomance(0,0));
        Freshman freshman2 = new Freshman("John", Style.GOOD, new AcademicPerfomance(0,0));
        graduate.print();
        System.out.println("------------------");
        graduate.print(graduate.getName());
        System.out.println("==================");
        freshman1.print(freshman1.getName());
        System.out.println("------------------");
        freshman1.print();
        System.out.println("==================");
        freshman2.print(freshman2.getName());
        System.out.println("------------------");
        freshman2.print();
    }
}