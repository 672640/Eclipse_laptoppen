package oppgåve1;

import java.util.Arrays;
import java.util.EmptyStackException;
import oppgåve1.Stabel;


public final class TabellStabel<T> implements Stabel<T> {

	
	private T[] stack;
	private int topIndex;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	public TabellStabel() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public TabellStabel(int initialCapacity) {
		stack = (T[]) new Object[initialCapacity];
		topIndex = -1;
	}

	@Override
	public void push(T newEntry) {
		ensureCapacity();
		stack[topIndex + 1] = newEntry;
		topIndex++;
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		T top = stack[topIndex];
		stack[topIndex] = null;
		topIndex--;
		return top;
		}

	@Override
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
	}
		return stack[topIndex];
	}
	@Override
	public boolean isEmpty() {
		return topIndex < 0;
	}

	@Override
	public void clear() {
		while(topIndex > -1) {
			stack[topIndex] = null;
			topIndex--;
		}
	}
	private void ensureCapacity() {
		if(topIndex >= stack.length - 1) {
			stack = Arrays.copyOf(stack, 2 * stack.length);
		}
	}
}
