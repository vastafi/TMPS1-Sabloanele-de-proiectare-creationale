package TestAbstractMethod;

class HomeAddress extends Address{
    private static final String COUNTRY = "Moldova";


    public String getCountry(){ return COUNTRY; }

    public String getFullAddress(){
        return getCountry() + EOL_STRING +
                getCity() + SPACE +EOL_STRING+
                getZone() + SPACE +EOL_STRING+
                getStreet() + EOL_STRING +
                getFlat() + SPACE + EOL_STRING;
    }
}

