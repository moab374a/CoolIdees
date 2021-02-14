package code;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class JMember implements ContentObserver {


    Set<JTopic> topics = new HashSet<>();


    public void subscribe(JTopic topic) {
        Objects.requireNonNull(topic);
        topic.addObserver(this);
        this.topics.add(topic);
    }


    public void unsubscribe(JTopic topic) {
        topic.removeObserver(this);
        topics.remove(topic);

    }

    public Set<JTopic> getSubscribedTopics() {
        return topics;
    }

    @Override
    public void update(JContent content) {
        if (content == null) throw new NullPointerException();
        for (JTopic topic : topics) {
            if(topic != null)
            {
                topic.notify();
                System.out.println("The topic " + topic.getId() + " has been updated!");
            }
        }
    }



}
