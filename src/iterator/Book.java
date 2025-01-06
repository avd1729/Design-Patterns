package iterator;

public class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString(){
        return "Book Title : " + this.title + "Book Author :" + this.author;
    }
    
}
