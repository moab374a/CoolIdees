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


            pool.putIfAbsent(topic, ideasSet);
    }

    public void add(JIdea idea, JTopic topic) {
        if (idea == null || topic == null) throw new NullPointerException();


        // Create a Set to Merge all sets
        Set<JIdea> mergedSet = new HashSet<>();

        // Loop in The Map
        for (Map.Entry<JTopic, Set<JIdea>> entry : pool.entrySet()) {

            //Add Every Set to the Merged Set
            mergedSet.addAll(entry.getValue());
        }


        // Loop in The Map < Topics ,  < Ideas > >
        for (Map.Entry<JTopic, Set<JIdea>> entry : pool.entrySet()) {

            if ( !pool.containsKey(topic) ) {
                add(topic);
                break;
            }

            // If the Topic exist in the Map
             if  (entry.getKey() == topic) {

                //Loop in the Merged Set
                for (JIdea ideasInSet : mergedSet) {

                    // If the title of the Idea doesn't match any title in the Set
                    if (!ideasInSet.getTitle().equals(idea.getTitle())) {
                        //add this idea to the looping Topic
                        entry.getValue().add(idea);
                    }
                }
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
        return true;

    }

    public JIdea getIdea(String title) {

        if (title == null) throw new IllegalArgumentException();


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


