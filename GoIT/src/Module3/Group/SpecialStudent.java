package Module3.Group;
/*
Class SpecialStudent that is child of CollegeStudent.
With additional fields long secretKey, String email.
Create three constructors: two the same as in CollegeStudend and one with secretKey field.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group, collegeName, rating, id);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    public long getSecretKey() { return secretKey; }
    public String getEmail() { return email; }

    public void setSecretKey(long secretKey) { this.secretKey = secretKey; }
    public void setEmail(String email) { this.email = email; }
}
