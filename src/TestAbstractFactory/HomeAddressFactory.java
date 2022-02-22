package TestAbstractFactory;

class HomeAddressFactory implements AddressFactory{
    public Address createAddress(){
        return new HomeAddress();
    }

    public PhoneNumber createPhoneNumber(){
        return new HomePhoneNumber();
    }
}
