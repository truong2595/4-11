public class Student extends Person {
    private String ID;

    public Student(String fullname, String email, String ID) {
        super(fullname, email);
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Student: " + fullname + " (ID: " + ID + ", Email: " + email + ")";
    }
}