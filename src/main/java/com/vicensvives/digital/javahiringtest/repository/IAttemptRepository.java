package com.vicensvives.digital.javahiringtest.repository;

import com.vicensvives.digital.javahiringtest.model.Attempt;

import java.util.List;

public interface IAttemptRepository {
    List<Attempt> findAll();
    Attempt save(Attempt attempt);
}
