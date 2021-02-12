package code;

public abstract class JState {

    private JValuation valuation;

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

    //__________________________________________________

    public class Draft extends JState {
        public void hold() {

        }

        public void declined() {

        }

    }

    public class OpenDraft extends JState {

        public void discuss(String text){}

        public void evaluate(JValuation valuation){}

        public void hold(){}

        public void decline(){}

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
