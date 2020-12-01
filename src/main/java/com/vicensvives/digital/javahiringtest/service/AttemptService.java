package com.vicensvives.digital.javahiringtest.service;

import com.vicensvives.digital.javahiringtest.exceptions.InvalidDataValueException;
import com.vicensvives.digital.javahiringtest.model.Attempt;
import com.vicensvives.digital.javahiringtest.repository.IAttemptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AttemptService {

    @Autowired
    private IAttemptRepository attemptRepository;

    public List<Attempt> findAll() {
        return attemptRepository.findAll();
    }

    public Attempt save(Attempt attempt) throws InvalidDataValueException {
        if (attempt.getGrade() > 100 || attempt.getGrade() < 0){
            throw new InvalidDataValueException("Grade have to has value between 0 and 100",400);
        }
        attempt.setUuid(UUID.randomUUID().toString());
        return attemptRepository.save(attempt);
    }
}
