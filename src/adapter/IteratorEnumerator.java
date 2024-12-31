package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerator implements Enumeration {

    Iterator itr;

    @Override
    public boolean hasMoreElements() {
        return itr.hasNext();
    }

    @Override
    public Object nextElement() {
        return itr.next();
    }
}
