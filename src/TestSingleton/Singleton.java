package TestSingleton;

public class Singleton {

    public static void main(String[] args) {
        User user  = User.getInstance(1,"Camencov andrei","31-08-1972","camencov.andreiAdm@gmail.com");
        User exUser = User.getInstance(2, "Bejenuta Vasile","31-07-1949","bejenutavasile@gmail.com");
        if (user.getFullNameOfUser() == exUser.getFullNameOfUser()) {
            System.out.println("Test is passed.The use of the singleton was successful!");
        } else {
            System.out.println("Something went wrong");
        }

        System.out.println(user );
        System.out.println(exUser);
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        UserEnum actualUser = UserEnum.user_Instance.getInstance();
        UserEnum anotherUser  = UserEnum.user_Instance.getInstance();
        anotherUser .setFullNameOfUser("Vasilau Ion");
        System.out.println(actualUser );
        System.out.println(anotherUser );
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        UserSyncronized userSyncronized2 = UserSyncronized.getInstance(3, "Bejenuta Vasile","31-07-1949","bejenutavasile@gmail.com");
        System.out.println(userSyncronized2);
    }
}


