package com.vicensvives.digital.javahiringtest.controller.request;

public final class CreateAttemptRequest {

    private String userId;
    private String activityId;
    private int grade;

    //Required for Spring
    public CreateAttemptRequest() {
    }

    public CreateAttemptRequest(String userId, String activityId, int grade) {
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
