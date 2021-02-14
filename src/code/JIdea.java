package code;

import java.util.ArrayList;
import java.util.List;

public class JIdea extends JContent {

    private List<JAttachment> attachments;

    private JState state;


    public JIdea(String title, String description) {

        super(title, description);

        attachments = new ArrayList<>();
        this.state= new Draft();

    }


    public void discuss(String text) {

    }

    public void evaluate(JValuation valuation) {

    }

    public void hold() {

    }

    public void release() {

        this.state= new ReleaseIdea();
    }

    public void decline() {

        this.state= new DeclinedIdea();
    }

    public boolean isDeclined() {
        if (state instanceof DeclinedIdea) {
            return true;
        }
        return false;
    }

    public boolean isReleased() {
        if (state instanceof ReleaseIdea) {
            return true;
        }
        return false;
    }

    public String getCurrentDiscussion() {
        return "";
    }

    public JValuation getValuation() {
        return null;
    }

    public void addAttachment(JAttachment attachment) {
        if (attachment==null)throw new NullPointerException();
        attachments.add(attachment);

    }

    public List<JAttachment> getAttachments() {
        return attachments;

    }

    public boolean removeAttachment(JAttachment attachment) {
        if (attachment==null)throw new NullPointerException();


        if (attachments.contains(attachment)) {
            attachments.remove(attachment);
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Idea: "+getTitle()+"\n"+getDescription();
    }

    @Override
    public int countObservers() {
        return attachments.size();
    }


    public abstract  class JState {

        private JValuation valuation;

        public void discuss(String text) {

        }

        public void evaluate(JValuation valuation) {

        }

        public void hold() {
            throw new IllegalStateException();
        }

        public void release() {

        }

        public void decline() {

        }

        public String getCurrentDiscussion() {
            return "";
        }

        public void setCurrentDiscussion(String currentDiscussion) {

        }

        public JValuation getValuation() {
            return valuation;
        }

        public void setValuation(JValuation valuation) {
            this.valuation = valuation;
        }
    }
        //__________________________________________________

        public class Draft extends JState {


            public void hold() {
                state= new OpenDraft();
            }

            public void declined() {

            }

        }

        public class OpenDraft extends JState {

            public void discuss(String text){}

            public void evaluate(JValuation valuation){}

            public void hold(){

            }

            public void decline(){


            }

        }

        public class ApprovedIdea extends JState {

            public void release(){}

        }

        public class ReleaseIdea extends JState
        {

        }
        public class DeclinedIdea extends JState
        {

        }

    }

