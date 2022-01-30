package TestSingleton;

public class User {
    private static User userInstance;
        private int id;
        private String fullNameOfUser;
        private String dateOfBirth;
        private String email;

        private User(int id, String fullNameOfUser, String dateOfBirth, String email) {
            this.id = id;
            this.fullNameOfUser = fullNameOfUser;
            this.dateOfBirth = dateOfBirth;
            this.email = email;
        }

        public static User getInstance(int id, String fullNameOfUser, String dateOfBirth, String email) {
            if (userInstance == null) {
                userInstance = new User(id, fullNameOfUser, dateOfBirth, email);
            }

            return userInstance;
        }

        public static User getUserInstance() {
            return userInstance;
        }

        public static void setUserInstance(User userInstance) {
            User.userInstance = userInstance;
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
            return "User {id=" + this.id + ", fullNameOfUser='" + this.fullNameOfUser + "', dateOfBirth='" + this.dateOfBirth + "', email='" + this.email + "'}";
        }
    }

