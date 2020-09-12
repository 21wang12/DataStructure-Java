package bag;

/**
 * 描述Bag类的接口
 * @author Wang
 */
public interface BagInterface<T>{

    public int getCurrentSize();

    public boolean isFull();

    public boolean isEmpty();

    public boolean add(T newEntry);

    public T remove();

    public T remove(T anEntry);

    public void clear();

    public int getFrequncyOf(T anEntry);

    public boolean contains();

    public T[] toArray();

}