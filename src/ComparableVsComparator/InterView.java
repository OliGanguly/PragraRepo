package ComparableVsComparator;

public class InterView implements Comparable<InterView> {
    private int interview_id;
    private String topic;
    private int marks;

    @Override
    public int compareTo(InterView interview) {
        //this which calls compareTo
        //2nd one interview in params
        if(this.getMarks()<interview.getMarks()){
            return 1;
        }else if(this.getMarks()>interview.getMarks()){
            return -1;
        }else {
            return 0;
        }

    }
    public InterView() {
    }

    public InterView(int interview_id, String topic, int marks) {
        this.interview_id = interview_id;
        this.topic = topic;
        this.marks = marks;
    }

    public int getInterview_id() {
        return interview_id;
    }

    public void setInterview_id(int interview_id) {
        this.interview_id = interview_id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "InterView{" +
                "interview_id=" + interview_id +
                ", topic='" + topic + '\'' +
                ", marks=" + marks +
                '}';
    }


}
