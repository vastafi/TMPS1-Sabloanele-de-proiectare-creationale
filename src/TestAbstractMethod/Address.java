package TestAbstractMethod;

abstract class Address {
    private int id;
    private String country;
    private String city;
    private String zone;
    private String street;
    private String flat;


    public static final String EOL_STRING =
            System.getProperty("line.separator");
    public static final String SPACE = " ";

    public int getId(){ return id; }
    public String getCountry(){ return country; }
    public String getCity(){ return city; }
    public String getZone(){ return zone; }
    public String getStreet(){ return street; }
    public String getFlat(){ return flat; }


    public String getFullAddress(){
        return country + EOL_STRING + city +  SPACE + EOL_STRING+  zone  +  SPACE + EOL_STRING+ street +  SPACE + EOL_STRING+ flat + EOL_STRING;
    }
    public void setId(int newId){ id= newId; }
    public void setCountry(String newCountry){ country = newCountry; }
    public void setCity(String newCity){ city = newCity; }
    public void setZone(String newZone){ zone = newZone; }
    public void setStreet(String newStreet){ street = newStreet; }
    public void setFlat(String newFlat){ flat = newFlat; }
}

