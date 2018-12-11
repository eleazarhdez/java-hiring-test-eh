package com.vicensvives.digital.javahiringtest.controller.response;

public final class ResultResponse {

    private final String activityId;
    private final int grade;

    public ResultResponse(String activityId, int grade) {
        this.activityId = activityId;
        this.grade = grade;
    }

    public String getActivityId() {
        return activityId;
    }

    public int getGrade() {
        return grade;
    }
}
