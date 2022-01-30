package TestPrototype;

public class Prototype {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try{
            System.out.println("------------------------------------");

            String musicPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MUSIC).toString();
            System.out.println(musicPrototype);

            System.out.println("------------------------------------");

            String albumPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
            System.out.println(albumPrototype);

            System.out.println("------------------------------------");

        } catch(CloneNotSupportedException exception){
            exception.printStackTrace();
        }
    }

}
