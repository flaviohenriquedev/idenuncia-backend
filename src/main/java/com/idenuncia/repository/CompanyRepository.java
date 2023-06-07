package com.idenuncia.repository;

import com.idenuncia.entity.Company;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CompanyRepository implements PanacheMongoRepository<Company> {
}
