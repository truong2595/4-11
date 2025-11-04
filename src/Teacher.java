public class Teacher extends Person {
    private String ID;
    private String title; // Chức danh

    public Teacher(String fullname, String email, String ID, String title) {
        super(fullname, email);
        this.ID = ID;
        this.title = title;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Teacher: " + title + " " + fullname + " (ID: " + ID + ")";
    }
}