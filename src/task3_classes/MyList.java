package task3_classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyList<E> implements MyCollection<E> {
	private List<E> list;
	protected boolean isElemsUnique = false;
	protected boolean isOrdered = false;
	
	public MyList(boolean isElemsUnique,boolean isOrdered) {
		list = new ArrayList<>();
		this.isElemsUnique = isElemsUnique;
		this.isOrdered = isOrdered;
	}
	
	@Override
    public boolean add(E element) {
		if (isElemsUnique == true) {			
			for (E x : list) {
				if (x.equals(element)) {
					System.out.println("В коллекции уже есть такой элемент!");
	                return false;
	            }
			}
		}
		
		boolean isAdded = list.add(element);
		
		if(!isOrdered) {
			Collections.shuffle(list);
		}
		
		return isAdded;
    }
	
	public List<E> getList(){
		return new ArrayList<>(list);
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
