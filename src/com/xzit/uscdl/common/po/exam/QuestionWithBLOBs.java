package com.xzit.uscdl.common.po.exam;

public class QuestionWithBLOBs extends Question {
    private String quesStem;

    private String quesRemark;

    private String quesAnswer;

    public String getQuesStem() {
        return quesStem;
    }

    public void setQuesStem(String quesStem) {
        this.quesStem = quesStem == null ? null : quesStem.trim();
    }

    public String getQuesRemark() {
        return quesRemark;
    }

    public void setQuesRemark(String quesRemark) {
        this.quesRemark = quesRemark == null ? null : quesRemark.trim();
    }

    public String getQuesAnswer() {
        return quesAnswer;
    }

    public void setQuesAnswer(String quesAnswer) {
        this.quesAnswer = quesAnswer == null ? null : quesAnswer.trim();
    }
}