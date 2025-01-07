package composite;

public class File implements FileSystemComponent{

    String name;
    Double size;


    public File(String name, Double size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println(this.name + " : " + this.size + " Mb.");
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new RuntimeException("Unsupported operation!!");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new RuntimeException("Unsupported operation!!");
    }
}
