
//
//
//     can you spot the memory leak?
//
//


import java.util.Arrays;
import java.util.EmptyStackException;

public class stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public void Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];

    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;

    }


    ///its right here, This will cause issues with the garbage collector.
//    public Object pop(){
//        if(size == 0)
//            throw new EmptyStackException();
//        return elements[--size];
//    }

    // The correct pop Object should look like this.


    public Object pop(){
        if(size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        System.out.println("Correct Pop = " + result);
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity(){
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);

    }

}
