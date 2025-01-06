package iterator;

public class LibraryIterator implements BookIterator{
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Book next() {
        return null;
    }
}
