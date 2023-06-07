package com.idenuncia.controller;

import com.idenuncia.entity.ComplaintType;
import com.idenuncia.service.ComplaintTypeService;
import com.mongodb.client.result.InsertOneResult;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/complaint-type")
public class ComplaintTypeController {

    @Inject
    ComplaintTypeService complaintTypeService;

    @GET
    @Path("/findall")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<ComplaintType> findAll() {
        return complaintTypeService.findAll();
    }

    @POST
    @Path("/insert-one")
    @Produces(MediaType.APPLICATION_JSON)
    public InsertOneResult insertOne(ComplaintType complaintType) {
        return complaintTypeService.insertOne(complaintType);
    }
}
