package com.jcallinan.geoquizjan2022;

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResid, boolean answerTrue) {
        mTextResId = textResid;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
