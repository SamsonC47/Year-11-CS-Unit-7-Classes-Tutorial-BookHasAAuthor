public class Author {
    private String name;  // Author's name
    private String email; // Author's email
    private char gender;  // Author's gender

    // Constructor to initialize Author
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for gender
    public char getGender() {
        return gender;
    }

    // Override toString method
    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}

