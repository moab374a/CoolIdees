package code;

import test.ObserverTest;

import java.util.List;

public abstract class JContent {
    private String title;
    private String description;

    private List<ContentObserver> observers;

    public JContent(String title, String description) {

        if(title.isEmpty() || description.isEmpty()) throw new IllegalArgumentException();


        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null) throw new NullPointerException();
        if(title.isEmpty()) throw new IllegalArgumentException();

        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description == null) throw new NullPointerException();
        if(description.isEmpty()) throw new IllegalArgumentException();



        this.description = description;
    }

    @Override
    public abstract String toString();

    public abstract int countObservers();
}
