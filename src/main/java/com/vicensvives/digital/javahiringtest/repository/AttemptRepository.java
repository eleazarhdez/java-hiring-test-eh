package com.vicensvives.digital.javahiringtest.repository;

import com.vicensvives.digital.javahiringtest.controller.request.CreateAttemptRequest;
import com.vicensvives.digital.javahiringtest.controller.response.CreateAttemptResponse;
import com.vicensvives.digital.javahiringtest.model.Attempt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class AttemptRepository implements IAttemptRepository {
    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<Attempt> findAll() {
        String sql = "SELECT * FROM attempts";
        return jtm.query(sql, new BeanPropertyRowMapper<>(Attempt.class));
    }

    @Override
    public Attempt save(Attempt attempt) {
        String sql = "INSERT INTO attempts (uuid, user_id, activity_id, grade) VALUES (?,?,?,?)";
        jtm.update(sql, attempt.getUuid(), attempt.getUser_id(), attempt.getActivity_id(), attempt.getGrade());
        return attempt;
    }
}
