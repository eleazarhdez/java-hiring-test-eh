package com.vicensvives.digital.javahiringtest.repository;

import com.vicensvives.digital.javahiringtest.controller.response.UserResultResponse;
import com.vicensvives.digital.javahiringtest.model.ActivityStats;

import java.util.List;

public interface IActivityStatsRepository {
    List<ActivityStats> findAll();
    ActivityStats findById(ActivityStats activityStats);
    void save(ActivityStats activityStats);
    void update(ActivityStats activityStats);
    void updateAverage(ActivityStats activityStats);
}
