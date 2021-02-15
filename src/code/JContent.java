package code;

import test.ObserverTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class JContent {



    private String title;
    private String description;

    private Set<ContentObserver> observers = new HashSet<>();

    public JContent(String title, String description) {

        if(title.isEmpty() || description.isEmpty()) throw new IllegalArgumentException();

        this.title = title;
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description == null) throw new NullPointerException();
        if(description.isEmpty()) throw new IllegalArgumentException();

        this.description = description;

        notifyall();
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {

        if(title == null) throw new NullPointerException();
        if(title.isEmpty()) throw new IllegalArgumentException();
        this.title = title;

        notifyall();

    }

    public void addObserver(ContentObserver observer)
    {
        observers.add(observer);
    }

    public void removeObserver(ContentObserver observer)
    {
        observers.remove(observer);
    }

    public int countObservers()
    {
       return observers.size();
    }




    public void notifyall()
    {
        for (ContentObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public abstract String toString();


}
