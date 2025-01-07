package composite;

public interface FileSystemComponent {
    void showDetails();
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
}
