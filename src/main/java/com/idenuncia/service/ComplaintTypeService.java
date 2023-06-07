package com.idenuncia.service;

import com.idenuncia.entity.ComplaintType;
import com.idenuncia.repository.ComplaintTypeRepository;
import com.mongodb.client.result.InsertOneResult;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ComplaintTypeService {

    @Inject
    ComplaintTypeRepository complaintTypeRepository;

    public List<ComplaintType> findAll() {
        return complaintTypeRepository.findAll().list();
    }

    public InsertOneResult insertOne(ComplaintType complaintType) {
        return complaintTypeRepository.mongoCollection().insertOne(complaintType);
    }
}
