package com.idenuncia.service;

import com.idenuncia.entity.Company;
import com.idenuncia.repository.CompanyRepository;
import com.mongodb.client.result.InsertOneResult;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CompanyService {

    @Inject
    CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll().list();
    }

    public InsertOneResult save(Company company) {
        return companyRepository.mongoCollection().insertOne(company);
    }
}
