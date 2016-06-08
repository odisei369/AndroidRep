package org.ilia.petrenko.kartapolakaquiz;

/**
 * Created by WinAdmin on 6/8/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        setTextResId(textResId);
        setAnswerTrue(answerTrue);
    }
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        this.mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        this.mAnswerTrue = answerTrue;
    }
}
