package TestPrototype;

public class Music implements PrototypeCapable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Music clone() throws CloneNotSupportedException {
        System.out.println("Cloning music object ... ");
        return (Music) super.clone();
    }

    @Override
    public String toString(){
        return "Music";
    }
}
