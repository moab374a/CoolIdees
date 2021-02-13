import code.JIdea;
import code.JIdeaPool;
import code.JTopic;

public class Main {

    public static void main(String[] args) {


        JIdeaPool ideaPool= new JIdeaPool();
        JIdea i1 = new JIdea("titleIdea1", "descriptionIdea1");
        JIdea i2 = new JIdea("titleIdea2", "descriptionIdea2");
        JIdea i3 = new JIdea("titleIdea3", "descriptionIdea3");
        JTopic t1 = new JTopic("titleTopic1", "descriptionTopic1", 1);
        JTopic t2 = new JTopic("titleTopic2", "descriptionTopic2", 2);
        JTopic t3 = new JTopic("titleTopic3", "descriptionTopic3", 3);

        final JIdea ideaWithExistingTitle = new JIdea(i1.getTitle(), "already existing title");


        ideaPool.add(i1, t1);//"JIdeaPool.add(JIdea, JTopic) should add the topic if the pool did not contain it!",

        ideaPool.add(ideaWithExistingTitle, t1);//"JIdeaPool.add(JIdea, JTopic) should not add an idea if the pool already contains another idea with the same title!",

        ideaPool.add(ideaWithExistingTitle, t2);//"JIdeaPool.add(JIdea, JTopic) should not add the topic to the pool if the idea is not added!"


        ideaPool.add(i3, t1);//"JIdeaPool.add(JIdea, JTopic) should add the idea to the set of ideas of the given topic!",

        ideaPool.add(i1, t2);//"JIdeaPool.add(JIdea, JTopic) should add the idea to the set of ideas of the given topic even if"
        // + " the idea is already associated to another topic!"


    }
}
