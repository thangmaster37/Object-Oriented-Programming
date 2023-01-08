package observer.pseudocode;

import java.io.File;

public class Editor
{
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open","save");
    }

    public void openFile(String path){
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() throws Exception{
        if (this.file != null){
            events.notify("save",file.getName());
        }
        else {
            throw new Exception("Please open a file first.");
        }
    }
}
