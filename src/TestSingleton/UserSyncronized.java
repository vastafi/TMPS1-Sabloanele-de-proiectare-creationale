package TestSingleton;

public class UserSyncronized {
    private static volatile UserSyncronized instance;
    private int id;
    private String fullNameOfUser;
    private String dateOfBirth;
    private String email;
    private static Object mutex = new Object();

    private UserSyncronized(int id, String fullNameOfUser, String dateOfBirth, String email) {
        this.id = id;
        this.fullNameOfUser = fullNameOfUser;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public static UserSyncronized getInstance(int id, String fullNameOfUser, String dateOfBirth, String email) {
        UserSyncronized result = instance;
        if (result == null) {
            synchronized(mutex) {
                result = instance;
                if (result == null) {
                    instance = result = new UserSyncronized(1223, "Camencov andrei","31-08-1972","camencov.andreiAdm@gmail.com");
                }
            }
        }

        return result;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullNameOfUser() {
        return this.fullNameOfUser;
    }

    public void setFullNameOfUser(String fullNameOfUser) {
        this.fullNameOfUser = fullNameOfUser;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "UserSyncronized{id=" + this.id + ", fullNameOfUser='" + this.fullNameOfUser + "', dateOfBirth='" + this.dateOfBirth + "', email='" + this.email + "'}";
    }
}
