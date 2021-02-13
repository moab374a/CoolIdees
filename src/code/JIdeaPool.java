package code;

import org.junit.Test;

import java.util.*;

public class JIdeaPool {


    private Map<JTopic, Set<JIdea>> pool;

    public JIdeaPool() {
        pool = new HashMap<>();
    }


    public void add(JTopic topic) {
        if (topic == null) throw new NullPointerException();

        Set<JIdea> ideasSet = new HashSet<>();


        if (!pool.containsKey(topic)) {

            pool.putIfAbsent(topic, ideasSet);
        }

    }

    public void add(JIdea idea, JTopic topic) {
        if (idea == null || topic == null) throw new NullPointerException();

        Set<JIdea> set_idea = new HashSet<>();
        Set<String> titles = new HashSet<>();
        boolean test = false;

        for (Set<JIdea> d : pool.values()) {
            set_idea.addAll(d);

        }
        for (JIdea id : set_idea) {
            titles.add(id.getTitle());
            if (id == idea ) {
                test=true;
                if (!pool.containsKey(topic)) {
                    Set<JIdea> ideas = new HashSet<>();
                    ideas.add(idea);
                    pool.put(topic, ideas);
                }
                else {
                    pool.get(topic).add(id);
                }
                break;
            }
        }


        if (!titles.contains(idea.getTitle())) {

            if (!pool.containsKey(topic) && !pool.containsValue(idea)) {
                Set<JIdea> ideas = new HashSet<>();
                ideas.add(idea);
                pool.put(topic, ideas);
            } else if (pool.containsKey(topic) && pool.containsValue(idea) && !pool.get(topic).contains(idea)) {

                pool.get(topic).add(idea);


            } else if (pool.containsKey(topic)) {
                pool.get(topic).add(idea);
            }
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

        for (Set<JIdea> id : pool.values()) {
            if (id.contains(idea)) {
                id.remove(idea);
                return true;
            }
        }


        return false;

    }

    public JIdea getIdea(String title) {

        if (title == null) throw new NullPointerException();
        if (title.isEmpty()) throw new IllegalArgumentException();


        for (Map.Entry<JTopic, Set<JIdea>> entry : pool.entrySet()) {

            // Loop in the the Set For This Topic
            Iterator<JIdea> iterator = entry.getValue().iterator();

            // Get the title of every Idea in The Set For That topic
            while (iterator.hasNext()) {

                JIdea id = iterator.next();
                if (id.getTitle().equals(title)) {
                    return id;
                }
            }


        }

        return null;
    }

    public int numberOfTopics() {

        return pool.size();
    }

    public int numberOfIdeas() {

        Set<JIdea> set_idea = new HashSet<>();
        for (Set<JIdea> d : pool.values()) {
            set_idea.addAll(d);
        }

        return set_idea.size();
    }

    public void removeDeclined() {

    }

    public void removeReleased() {


    }


}


