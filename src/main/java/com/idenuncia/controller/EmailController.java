package com.idenuncia.controller;

import com.idenuncia.entity.Email;
import com.idenuncia.service.EmailService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("")
public class EmailController {

    @Inject
    EmailService emailService;

    //----------------------------------------------------------------------

    @GET
    public Response initialize() {
        return Response.status(Response.Status.OK).entity("BACK FUNCIONANDO").build();
    }

    @POST
    @Path("/send-email")
    public Response sendingHTML(Email email) {
        return emailService.sendEmail(email);
    }
}
