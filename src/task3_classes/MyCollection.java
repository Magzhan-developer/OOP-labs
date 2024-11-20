package task3_classes;
import java.util.Iterator;
public interface MyCollection<E> {
	boolean add(E element);
	boolean remove(E element);
	boolean contains(E element);
	int size();
	boolean isEmpty();
	void clear();
	Iterator<E> iterator();
}
