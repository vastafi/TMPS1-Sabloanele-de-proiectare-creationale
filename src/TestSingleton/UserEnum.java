package TestSingleton;

public enum UserEnum {

    user_Instance(1,"Camencov andrei","31-08-1972","camencov.andreiAdm@gmail.com");
    private int id;
    private String fullNameOfUser;
    private String dateOfBirth;
    private String email;

    private UserEnum(int id, String fullNameOfUser, String dateOfBirth, String email) {
        this.id = id;
        this.fullNameOfUser = fullNameOfUser;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public UserEnum getInstance() {
        return user_Instance;
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
        return "UserEnum{id=" + this.id + ", fullNameOfUser='" + this.fullNameOfUser + "', dateOfBirth='" + this.dateOfBirth + "', email='" + this.email + "'}";
    }

}
