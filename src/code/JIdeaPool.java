package code;

import java.util.*;

public class JIdeaPool {


    private Map<JTopic, Set<JIdea>> pool;
    private Set<JIdea> setJIdeas;

    public JIdeaPool() {
        pool = new HashMap<>();
        setJIdeas = new HashSet<>();

    }


    public void add(JTopic topic) {
        if (topic == null) throw new NullPointerException();
        Set<JIdea> ideasSet = new HashSet<>();

        if (!pool.containsKey(topic)) {
            pool.put(topic, ideasSet);
        }

    }

    public void add(JIdea idea, JTopic topic) {
        if (idea == null || topic == null) throw new NullPointerException();


        for (Map.Entry<JTopic, Set<JIdea>> entry : pool.entrySet()) {

            if (entry.getKey() == topic) {

                Iterator<JIdea> iterator = entry.getValue().iterator();

             if (entry.getValue().contains(idea)) {

                    while (iterator.hasNext()) {
                        if(!iterator.next().getTitle().equals(idea.getTitle()))
                        {
                            entry.getValue().add(idea);
                        }
                    }
                }
             else    if (!entry.getValue().contains(idea)) {
                    // Add the not found Idea to the Set
                    entry.getValue().add(idea);
                }
            }

        }

       if (!pool.containsKey(topic)) {
           // if Topic doesn't exist
           Set<JIdea> newIdeas = new HashSet<>();
           newIdeas.add(idea);
           pool.put(topic,newIdeas);
       }

    }



    public boolean remove(JTopic topic) {
        if (topic == null) throw new NullPointerException();

        if (pool.containsKey(topic)) {
            pool.remove(topic);
            return true;
        }
        return false;
    }

    public boolean remove(JIdea idea) {


        if (idea == null) throw new NullPointerException();
        return true;

    }

    public JIdea getIdea(String title) {

        if (title == null) throw new IllegalArgumentException();
        JIdea test = new JIdea("", "");
        return test;
    }

    public int numberOfTopics() {
        return 0;
    }

    public int numberOfIdeas() {
        return 0;
    }

    public void removeDeclined() {

    }

    public void removeReleased() {

    }


}
