package com.idenuncia.service;

import com.idenuncia.entity.Email;
import com.idenuncia.entity.EmailConfig;
import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class EmailService {

    @Inject
    Mailer mailer;

    public Response sendEmail(Email email) {

        EmailConfig config = new EmailConfig();

        config.setName(email.getAnonymous() ? "DENÚNCIA ANÔNIMA" : email.getName());
        config.setEmail(email.getAnonymous() ? "DENÚNCIA ANÔNIMA" : email.getEmail());
        config.setPhone(email.getAnonymous() ? "DENÚNCIA ANÔNIMA" : email.getPhone());
        config.setTypeComplaint(email.getTypeComplaint());
        config.setDenounced(email.getDenounced());
        config.setMessage(email.getMessage());

        mailer.send(Mail.withHtml("flavio.henrique.dev@gmail.com", "Denúncia contra " + config.getDenounced().toUpperCase(), config.getBody()));

        return Response.status(Response.Status.CREATED).build();
    }
}
