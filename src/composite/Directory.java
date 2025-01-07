package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{

    List<FileSystemComponent> files = new ArrayList<>();

    @Override
    public void showDetails() {
        for(FileSystemComponent component: files){
            component.showDetails();
        }
    }

    @Override
    public void add(FileSystemComponent component) {
        files.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        files.remove(component);
    }
}
