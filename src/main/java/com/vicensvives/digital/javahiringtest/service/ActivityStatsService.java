package com.vicensvives.digital.javahiringtest.service;

import com.vicensvives.digital.javahiringtest.controller.request.CreateAttemptRequest;
import com.vicensvives.digital.javahiringtest.controller.request.UpdateResultRequest;
import com.vicensvives.digital.javahiringtest.controller.response.UserResultResponse;
import com.vicensvives.digital.javahiringtest.mapper.ActivityStatsMapper;
import com.vicensvives.digital.javahiringtest.model.ActivityStats;
import com.vicensvives.digital.javahiringtest.repository.IActivityStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ActivityStatsService {

    @Autowired
    private JdbcTemplate jtm;

    @Autowired
    private IActivityStatsRepository activityStatsRepository;


    public List<ActivityStats> findAll() {
        return activityStatsRepository.findAll();
    }

    public ActivityStats findById(ActivityStats activityStats) {
        return activityStatsRepository.findById(activityStats);
    }

    public void save(ActivityStats activityStats) {
        activityStatsRepository.save(activityStats);
    }

    public void update(ActivityStats activityStats) {
        activityStatsRepository.update(activityStats);
    }

    public void updateAverage(ActivityStats activityStats) {
        activityStatsRepository.updateAverage(activityStats);
    }

    public void saveOrUpdate(ActivityStats activityStats){
        try {
            ActivityStats foundActivityStats = findById(activityStats);
            foundActivityStats.updateStatsAfterAttempt(activityStats.getAverage_grade());
            update(foundActivityStats);
        } catch (EmptyResultDataAccessException ex){
            save(activityStats);
        }
    }

    public void updateAverageGrade(ActivityStats activityStats){
        activityStatsRepository.updateAverage(activityStats);
    }
}
