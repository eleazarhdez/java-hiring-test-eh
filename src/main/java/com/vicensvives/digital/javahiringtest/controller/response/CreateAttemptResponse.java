package com.vicensvives.digital.javahiringtest.controller.response;

public final class CreateAttemptResponse {

    private final int attemptGrade;
    private final int activityGrade;

    public CreateAttemptResponse(int attemptGrade, int activityGrade) {
        this.attemptGrade = attemptGrade;
        this.activityGrade = activityGrade;
    }

    public int getAttemptGrade() {
        return attemptGrade;
    }

    public int getActivityGrade() {
        return activityGrade;
    }
}
