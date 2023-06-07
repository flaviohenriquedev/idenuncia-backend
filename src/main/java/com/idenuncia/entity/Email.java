package com.idenuncia.entity;

public class Email {
    private String name;
    private String email;
    private String phone;
    private String typeComplaint;
    private String denounced;
    private String message;
    private Boolean anonymous;

    //------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTypeComplaint() {
        return typeComplaint;
    }

    public void setTypeComplaint(String typeComplaint) {
        this.typeComplaint = typeComplaint;
    }

    public String getDenounced() {
        return denounced;
    }

    public void setDenounced(String denounced) {
        this.denounced = denounced;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }
}
