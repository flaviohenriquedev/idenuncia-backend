package com.idenuncia.controller;

import com.idenuncia.entity.PlaceComplaint;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/place-complaint")
public class PlaceComplaintController {

    @GET
    @Path("/findall")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public PlaceComplaint findAll() {
        return new PlaceComplaint();
    }
}
