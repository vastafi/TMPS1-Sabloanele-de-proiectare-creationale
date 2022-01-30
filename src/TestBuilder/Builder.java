package TestBuilder;

public class Builder {

    /**
     * @param args
     */
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Ambros", "Vasile")
                .age(54)
                .phone("0600781245")
                .address("Chisinau, 43")
                .build();

        System.out.println(user1);

        System.out.println("------------------------------------");

        User user2 = new User.UserBuilder("Carp", "Doina")
                .age(22)
                .phone("068754558")
                //no address
                .build();

        System.out.println(user2);

        System.out.println("------------------------------------");

        User user3 = new User.UserBuilder("Musteata", "Andrei")
        //No  data for age, phone, address
                .build();

        System.out.println(user3);
    }
}

