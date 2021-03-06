package DesignPatterns.StackOverflow;

import java.util.Date;
import java.util.List;

/**
 * Created by rkhurana on 12/3/18.
 */
public class Answer {
    private String answerText;
    private boolean accepted;
    private int voteCount;
    private int flagCount;
    private Date creationTime;

    private Member creatingMember;
    private List<Photo> photos;

    public boolean incrementVoteCount() {
        return false;
    }
}