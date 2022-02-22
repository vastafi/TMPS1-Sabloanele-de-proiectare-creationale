package TestAbstractFactory;

public class AbstractFactory {
        public static void main(String [] arguments){
            System.out.println("------------------------------------");
            AddressFactory homeAddressFactory = new HomeAddressFactory();
            Address homeAddress = homeAddressFactory.createAddress();
            PhoneNumber homePhone = homeAddressFactory.createPhoneNumber();

            homeAddress.setCity("Falesti");
            homeAddress.setZone("Albinetul Vechi");
            homeAddress.setStreet("Luminilor 49");
            homeAddress.setFlat("-");
            homePhone.setPhoneNumber("060076875");

            System.out.println("Home address:");
            System.out.println( homeAddress.getFullAddress());
            System.out.println("------------------------------------");
            System.out.println("Home phone number:");
            System.out.println( homePhone.getPhoneNumber());

            System.out.println("------------------------------------");
            AddressFactory temporaryAddressFactory = new TemporaryAddressFactory();
            Address temporaryAddress = temporaryAddressFactory.createAddress();
            PhoneNumber temporaryPhone = temporaryAddressFactory.createPhoneNumber();

            temporaryAddress.setCity("Chisinau");
            temporaryAddress.setZone("Botanica");
            temporaryAddress.setStreet("Independentei 29");
            temporaryAddress.setFlat("49");
            temporaryPhone.setPhoneNumber("025941478");

            System.out.println("Temporary address:");
            System.out.println(temporaryAddress.getFullAddress());
            System.out.println("------------------------------------");
            System.out.println("Temporary phone number:");
            System.out.println(temporaryPhone.getPhoneNumber());
            System.out.println("------------------------------------");
        }
    }

