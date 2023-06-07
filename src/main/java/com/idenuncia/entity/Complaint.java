package com.idenuncia.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.Date;

@MongoEntity(collection = "complaint")
public class Complaint extends PanacheMongoEntity {
    private String code;
    private String nameDenunciator;
    private String emailDenunciator;
    private String phoneDenunciator;
    private Company denounced;
    private ComplaintType complaintType;
    private PlaceComplaint placeComplaint;
    private Date dateComplaint;
    private Boolean anony;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameDenunciator() {
        return nameDenunciator;
    }

    public void setNameDenunciator(String nameDenunciator) {
        this.nameDenunciator = nameDenunciator;
    }

    public String getEmailDenunciator() {
        return emailDenunciator;
    }

    public void setEmailDenunciator(String emailDenunciator) {
        this.emailDenunciator = emailDenunciator;
    }

    public String getPhoneDenunciator() {
        return phoneDenunciator;
    }

    public void setPhoneDenunciator(String phoneDenunciator) {
        this.phoneDenunciator = phoneDenunciator;
    }

    public Company getDenounced() {
        return denounced;
    }

    public void setDenounced(Company denounced) {
        this.denounced = denounced;
    }

    public ComplaintType getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(ComplaintType complaintType) {
        this.complaintType = complaintType;
    }

    public PlaceComplaint getPlaceComplaint() {
        return placeComplaint;
    }

    public void setPlaceComplaint(PlaceComplaint placeComplaint) {
        this.placeComplaint = placeComplaint;
    }

    public Date getDateComplaint() {
        return dateComplaint;
    }

    public void setDateComplaint(Date dateComplaint) {
        this.dateComplaint = dateComplaint;
    }

    public Boolean getAnony() {
        return anony;
    }

    public void setAnony(Boolean anony) {
        this.anony = anony;
    }
}
