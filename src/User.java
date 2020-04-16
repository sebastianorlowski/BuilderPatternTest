public class User {
    private Long id;
    private String name;
    private String lastName;
    private String login;
    private String email;
    private Integer age;
    private Gender gender;

    public User(Long id, String name, String lastName, String login, String email, Integer age, Gender gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class Builder {
        private Long id;
        private String name;
        private String lastName;
        private String login;
        private String email;
        private Integer age;
        private Gender gender;

        public Builder() {

        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            return new User(id, name, lastName, login, email, age, gender);
        }
    }
}
