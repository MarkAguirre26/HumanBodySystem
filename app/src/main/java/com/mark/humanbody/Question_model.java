package com.mark.humanbody;

/**
 * This class is for holding the question with images
 */
public class Question_model {

    private String Question;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String answer;


    public Question_model(String question, String a, String b, String c, String d, String ans) {
        this.Question = question;
        this.choiceA = a;
        this.choiceB = b;
        this.choiceC = c;
        this.choiceD = d;
        this.answer = ans;

    }

    public String getQuestion() {
        return Question;
    }

    public String getA() {
        return choiceA;
    }

    public String getB() {
        return choiceB;
    }

    public String getC() {
        return choiceC;
    }

    public String getD() {
        return choiceD;
    }

    public String getAnswer() {
        return answer;
    }


    public void setQuestion(String question) {
        Question = question;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
    }
}
