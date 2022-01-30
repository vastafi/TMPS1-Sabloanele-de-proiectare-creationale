package TestPrototype;

public class PrototypeFactory {
    public static class ModelType
    {
        public static final String MUSIC = "music";
        public static final String ALBUM = "album";
    }

    private static java.util.Map<String , PrototypeCapable> prototypes = new java.util.HashMap<String , PrototypeCapable>();

    static
    {
        prototypes.put(ModelType.MUSIC, new Music());
        prototypes.put(ModelType.ALBUM, new Album());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable) prototypes.get(s)).clone();
    }

}
