package code;

import java.util.Map;
import java.util.Set;

public class JIdeaPool {


    private Map<JTopic , Set<JIdea>> pool;

    public JIdeaPool()
    {

    }


    public void add (JTopic topic)
    {

    }
    public void add (JIdea idea, JTopic topic)
    {

    }

    public boolean remove (JTopic topic)
    {
        return true;
    }
    public boolean remove (JIdea idea)
    {
        return true;

    }

    public JIdea getIdea() {
        JIdea test = new JIdea("","");
        return test ;
    }
    public int numberOfTopics(){
        return 0;
    }
    public int numberOfIdeas(){
        return 0;
    }
    public void removeDeclined(){

    }
    public void removeReleased(){

    }



}
