package oppgåve1;

public interface Stabel<T> {
	
	public void push(T newEntry);
	
	public T pop();
	
	public T peek();
	
	public boolean isEmpty();
	
	public void clear();
}