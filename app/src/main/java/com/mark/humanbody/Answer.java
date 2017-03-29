package com.mark.humanbody;

/**
 * Created by Mark on 1/2/2017.
 */

public class Answer {
    private int cn;
    private String Answer;
    private String remark;

    public Answer(){

    }

    public Answer(int id, String no, String rem_){
        cn  =id;
        Answer = no;
        remark = rem_;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public void setAnswer(String ans) {
        this.Answer = ans;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCn() {
        return cn;
    }

    public String getAnswer() {
        return Answer;
    }

    public String getRemark() {
        return remark;
    }
}
