package composite;

public class Driver {
    public static void main(String[] args) {
        File file1 = new File("Study material",30.0);
        File file2 = new File("DSA",100.0);

        file1.showDetails();
        file2.showDetails();

        Directory directory = new Directory();
        directory.add(file1);
        directory.add(file2);

        directory.showDetails();
    }
}
