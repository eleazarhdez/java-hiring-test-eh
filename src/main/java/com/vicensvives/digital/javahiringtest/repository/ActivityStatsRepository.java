package com.vicensvives.digital.javahiringtest.repository;

import com.vicensvives.digital.javahiringtest.model.ActivityStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActivityStatsRepository implements IActivityStatsRepository {

    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<ActivityStats> findAll() {
        String sql = "SELECT user_id, activity_id, average_grade FROM activity_stats";
        return jtm.query(sql, new BeanPropertyRowMapper<>(ActivityStats.class));
    }

    @Override
    public ActivityStats findById(ActivityStats activityStats) {
        String sql = "SELECT * FROM activity_stats WHERE activity_id = ? AND user_id = ?";
        return jtm.queryForObject(sql,new Object[]{activityStats.getActivity_id(),
        activityStats.getUser_id()}, new BeanPropertyRowMapper<>(ActivityStats.class));
    }

    @Override
    public void save(ActivityStats activityStats) {
        String sql = "INSERT INTO activity_stats (activity_id, user_id, average_grade, attempts_number, " +
                     "accumulated_grade) VALUES (?,?,?,?,?)";
        jtm.update(sql, activityStats.getActivity_id(), activityStats.getUser_id(),
                activityStats.getAverage_grade(), 1, activityStats.getAverage_grade());
    }

    @Override
    public void update(ActivityStats activityStats) {
        String sql = "UPDATE activity_stats " +
                     "SET average_grade = ?, " +
                         "attempts_number = ?, " +
                         "accumulated_grade = ? " +
                    "WHERE activity_id = ? AND user_id = ?";
        jtm.update(sql, activityStats.getAverage_grade(), activityStats.getAttempts_number(),
                activityStats.getAccumulated_grade(), activityStats.getActivity_id(), activityStats.getUser_id());
    }

    @Override
    public void updateAverage(ActivityStats activityStats) {
        String sql = "UPDATE activity_stats " +
                "SET average_grade = ?, " +
                "manual = 1, " +
                "comment = ? "+
                "WHERE activity_id = ? AND user_id = ?";
        jtm.update(sql, activityStats.getAverage_grade(), activityStats.getComment(), activityStats.getActivity_id(),
                activityStats.getUser_id());
    }
}
