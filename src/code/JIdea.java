package code;

import java.util.ArrayList;
import java.util.List;

public class JIdea extends JContent {

    private List<JAttachment> attachments;

    private JState state;


    public JIdea(String title, String description) {
        super(title, description);

        attachments = new ArrayList<>();
    }


    public void discuss(String text) {

    }

    public void evaluate(JValuation valuation) {

    }

    public void hold() {

    }

    public void release() {

    }

    public void decline() {

    }

    public boolean isDeclined() {
        return false;
    }

    public boolean isReleased() {
        return false;
    }

    public String getCurrentDiscussion() {
        return "";
    }

    public JValuation getValuation() {
        return null;
    }

    public void addAttachment(JAttachment attachment) {

    }

    public List<JAttachment> getAttachments() {
        List<JAttachment> temp = new ArrayList<>();
        return temp;
    }

    public boolean removeAttachment(JAttachment attachment) {
        if(attachment == null) throw new NullPointerException();
        return false;
    }


    @Override
    public String toString() {
        return null;
    }

    @Override
    public int countObservers() {
        return 0;
    }
}
