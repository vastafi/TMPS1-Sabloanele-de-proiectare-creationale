package TestFactoryMethod;


public class Firefox extends Company {

    private String ipv4;
    private String ipv6;

    public Firefox (String ipv4, String ipv6) {
        this.ipv4 = ipv4;
        this.ipv6 = ipv6;
    }

    @Override
    public String getIpv4() {
        return this.ipv4;
    }

    @Override
    public String getIpv6() {
        return this.ipv6;
    }
}

