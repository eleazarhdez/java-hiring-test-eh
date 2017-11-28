package com.vicensvives.digital.javahiringtest.controller.response;

public final class GradeResponse {

    private final String userId;
    private final String resourceId;
    private final int grade;

    public GradeResponse(String userId, String resourceId, int grade) {
        this.userId = userId;
        this.resourceId = resourceId;
        this.grade = grade;
    }

    public String getUserId() {
        return userId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public int getGrade() {
        return grade;
    }
}
