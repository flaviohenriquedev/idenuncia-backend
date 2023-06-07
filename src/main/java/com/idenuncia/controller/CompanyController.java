package com.idenuncia.controller;

import com.idenuncia.entity.Company;
import com.idenuncia.service.CompanyService;
import com.mongodb.client.result.InsertOneResult;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/company")
public class CompanyController {

    @Inject
    CompanyService companyService;

    @GET
    @Path("/findall")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @POST
    @Path("/insert-one")
    @Produces(MediaType.APPLICATION_JSON)
    public InsertOneResult save(Company company) {
        return companyService.save(company);
    }
}
