package lista_encadeada.aula.model;

public interface IList<T> {

    public void addFirst(T t) throws Exception;
    public void addLast(T t) throws Exception;
    public void add(T t, int position) throws Exception;
    public void removeFirst() throws Exception;
    public void removeLast() throws Exception;
    public void remove(int position) throws Exception;
    public boolean isEmpty();
    public T get(int position) throws Exception;
    public int size();
}
