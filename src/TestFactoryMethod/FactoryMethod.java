package TestFactoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        Company firefox = FactoryPattern.getDetails("Firefox", "142.250.220.0/24", "2600:1901:101::10/126");
        Company google = FactoryPattern.getDetails("Google", "108.177.16.0/24", "2600:1901:101::0/126");

        System.out.println("--------------------------------------------------------------------");

        System.out.println("Firefox Config::" + firefox);

        System.out.println("--------------------------------------------------------------------");

        System.out.println("Google Config::" + google);

        System.out.println("--------------------------------------------------------------------");
    }
}

