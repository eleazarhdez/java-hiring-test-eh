package com.vicensvives.digital.javahiringtest.controller.response;

public final class CreateAttemptResponse {

    private final String attemptId;

    public CreateAttemptResponse(String attemptId) {
        this.attemptId = attemptId;
    }

    public String getAttemptId() {
        return attemptId;
    }
}
