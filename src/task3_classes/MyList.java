package task3_classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MyList<E> implements MyCollection<E> {
	private List<E> list = new ArrayList<>();
	
	@Override
    public boolean add(E element) {
        return list.add(element);
    }

	@Override
	public boolean remove(E element) {
		return list.remove(element);
	}
	
	@Override
    public boolean contains(E element) {
        return list.contains(element);
    }
	
	@Override
	public int size() {
		return list.size();
	}
	
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public void clear() {
		list.clear();
	}
	
	public Iterator<E> iterator() {
        return list.iterator();
    }
	 
}
