package com.vicensvives.digital.javahiringtest.controller.request;

public final class CreateAttemptRequest {

    private String userId;
    private String activityId;
    private int grade;

    public String getUserId() {
        return userId;
    }

    public String getActivityId() {
        return activityId;
    }

    public int getGrade() {
        return grade;
    }

    public CreateAttemptRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public CreateAttemptRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    public CreateAttemptRequest setGrade(int grade) {
        this.grade = grade;
        return this;
    }
}
