package com.vicensvives.digital.javahiringtest.controller.request;

public final class UpdateResultRequest {

    private int grade;
    private String comment;
    
    public int getGrade() {
        return grade;
    }

    public UpdateResultRequest setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public UpdateResultRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
