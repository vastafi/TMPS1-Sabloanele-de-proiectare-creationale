package TestAbstractFactory;

abstract class PhoneNumber {
    private String phoneNumber;
    public String getPhoneNumber(){ return phoneNumber; }

    public void setPhoneNumber(String newNumber){
        try{
            Long.parseLong(newNumber);
            phoneNumber = newNumber;
        }
        catch (NumberFormatException exc){
        }
    }
}


