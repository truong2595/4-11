public class KhoaLuanDemo {
    public static void main(String[] args) {
        Student sv1 = new Student("Nguyen Cong Truong", "nct@gmail.com", "1");
        Student sv2 = new Student("Nguyen Truong Cong", "ntc@email.com", "2");
        Student sv3 = new Student("Truong Nguyen Cong", "tnc@email.com", "3");

        Teacher gv1 = new Teacher("Giang vien 1", "gv1@email.com", "GV1", "Giáo sư");
        Advisor adv1 = new Advisor("Co van", "covan@gmail.com");

        KLTN<?, ?> kltn1 = new KLTN<>(sv1, gv1, "khoa luan 1");
        KLTN<?, ?> kltn2 = new KLTN<>(sv2, adv1, "khoa luan 2");
        KLTN<?, ?> kltn3 = new KLTN<>(sv3, gv1, "khoa luan 3");

        ListSortable<KLTN<?, ?>> danhSachKLTN = new ListSortable<>();

        danhSachKLTN.add(kltn1);
        danhSachKLTN.add(kltn2);
        danhSachKLTN.add(kltn3);

        danhSachKLTN.print();
    }
}