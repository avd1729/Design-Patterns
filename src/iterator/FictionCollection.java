package iterator;

import java.util.ArrayList;
import java.util.List;

public class FictionCollection implements BookCollection{

    List<Book> books = new ArrayList<>();
    @Override
    public BookIterator createIterator() {
        return new LibraryIterator();
    }
}
