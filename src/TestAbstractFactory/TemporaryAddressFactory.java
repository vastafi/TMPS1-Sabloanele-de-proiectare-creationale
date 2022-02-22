package TestAbstractFactory;

class TemporaryAddressFactory implements AddressFactory{
    public Address createAddress(){
        return new TemporaryAddress();
    }

    public PhoneNumber createPhoneNumber(){
        return new TemporaryPhoneNumber();
    }
}
