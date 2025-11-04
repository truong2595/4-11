import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list;

    public ListSortable() {
        this.list = new ArrayList<>();
    }

    public void add(E element) {
        this.list.add(element);
    }

    public void print() {
        Collections.sort(this.list);

        System.out.println("Danh sách khóa luận: ");
        for (E e : this.list) {
            System.out.println(e);
        }
    }
}