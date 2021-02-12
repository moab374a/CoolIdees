package code;

import java.io.File;

public class JAttachment extends JContent {
    private File file;

    public JAttachment(String title, String description , File file) {
        super(title, description);
        this.file = file;
    }

    public File getFile() {
        return file;
    }


    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String toString() {
        return null;
    }
}
