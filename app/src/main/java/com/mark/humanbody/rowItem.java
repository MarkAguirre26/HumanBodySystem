package com.mark.humanbody;

/**
 * Created by Mark on 4/19/2016.
 */
public class rowItem {

    private String answer;
    private String isCorrect;
    private String realAnswer;
    public rowItem(String answer, String isCorrect, String realAnswer)
    {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.realAnswer = realAnswer;
    }

    public String getAnswer()
    {
        return answer;
    }
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    public String getIsCorrect()
    {
        return isCorrect;
    }
    public void setIsCorrect(String isCorrect)
    {
        this.isCorrect = isCorrect;
    }
    public String getRealAnswer()
    {
        return realAnswer;
    }
    public void setRealAnswer(String realAnswer)
    {
        this.realAnswer = realAnswer;
    }
}
