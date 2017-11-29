package com.vicensvives.digital.javahiringtest.controller.response;

public final class ResultResponse {

    private final String userId;
    private final String activityId;
    private final int grade;

    public ResultResponse(String userId, String activityId, int grade) {
        this.userId = userId;
        this.activityId = activityId;
        this.grade = grade;
    }

    public String getUserId() {
        return userId;
    }

    public String getActivityId() {
        return activityId;
    }

    public int getGrade() {
        return grade;
    }
}
