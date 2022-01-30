package TestFactoryMethod;

public abstract class Company {

    public abstract String getIpv4();

    public abstract String getIpv6();

    @Override
    public String toString() {
        return "IPv4 = " + this.getIpv4() + ", IPv6 = " + this.getIpv6();
    }
}