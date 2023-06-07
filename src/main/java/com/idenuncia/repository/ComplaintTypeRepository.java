package com.idenuncia.repository;

import com.idenuncia.entity.ComplaintType;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComplaintTypeRepository implements PanacheMongoRepository<ComplaintType> {
}
