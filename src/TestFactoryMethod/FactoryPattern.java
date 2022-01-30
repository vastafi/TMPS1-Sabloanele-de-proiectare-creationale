package TestFactoryMethod;

public class FactoryPattern {
    public static Company getDetails(String type, String ipv4, String ipv6) {
        if ("Firefox".equalsIgnoreCase(type))
            return new Firefox(ipv4, ipv6);
        else if ("Google".equalsIgnoreCase(type))
            return new Google(ipv4, ipv6);
        return null;
    }

}