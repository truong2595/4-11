public class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<?, ?>> {

    private T student;
    private V supervisor;
    private String tenKhoaLuan;

    public KLTN(T student, V supervisor, String tenKhoaLuan) {
        this.student = student;
        this.supervisor = supervisor;
        this.tenKhoaLuan = tenKhoaLuan;
    }

    public T getStudent() {
        return student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    public String getTenKhoaLuan() {
        return tenKhoaLuan;
    }

    @Override
    public int compareTo(KLTN<?, ?> other) {
        return this.tenKhoaLuan.compareTo(other.tenKhoaLuan);
    }

    @Override
    public String toString() {
        return "KLTN [Đề tài: " + tenKhoaLuan + "]\n" +
                "\tSinh viên: " + student.getFullname() + " (ID: " + student.getID() + ")\n" +
                "\tHướng dẫn: " + supervisor.getFullname() + "\n";
    }
}