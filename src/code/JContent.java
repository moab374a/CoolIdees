package code;

import test.ObserverTest;

import java.util.List;

public abstract class JContent {
    private String title;
    private String description;

    private List<ContentObserver> observers;

    public JContent(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public abstract String toString();

    public abstract int countObservers();
}
