package com.senacor.service;

import com.senacor.model.NaturalPerson;
import com.senacor.repository.NaturalPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by saba on 09.01.17.
 */
@Service
public class NaturalPersonService {

    NaturalPersonRepository naturalPersonRepository;

    @Autowired
    public NaturalPersonService(NaturalPersonRepository naturalPersonRepository) {
        this.naturalPersonRepository = naturalPersonRepository;
    }

    public NaturalPerson getNaturalPerson(String userId) {
        return naturalPersonRepository.findByUserId(userId);
    }
}
