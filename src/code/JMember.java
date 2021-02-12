package code;

import java.util.Set;

public class JMember implements ContentObserver {

   Set<JTopic> topics;


    public void subscribe(JTopic topic)
    {


    }
    public void unsubscribe(JTopic topic)
    {


    }
    public Set<JTopic> getSubscribedTopics()
    {

    return null;
    }

    @Override
    public void update(JContent content) {

    }

    public int countObservers()
    {
     return 0;
    }
}
