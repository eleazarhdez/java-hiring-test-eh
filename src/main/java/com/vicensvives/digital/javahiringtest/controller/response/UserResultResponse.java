package com.vicensvives.digital.javahiringtest.controller.response;

import java.util.List;

public final class UserResultResponse {

    private final String userId;
    private final List<ResultResponse> results;

    public UserResultResponse(String userId, List<ResultResponse> results) {
        this.userId = userId;
        this.results = results;
    }

    public String getUserId() {
        return userId;
    }

    public List<ResultResponse> getResults() {
        return results;
    }

}
