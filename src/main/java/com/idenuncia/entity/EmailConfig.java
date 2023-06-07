package com.idenuncia.entity;

public class EmailConfig {
    private String name;
    private String email;
    private String phone;
    private String typeComplaint;
    private String denounced;
    private String message;
    private String body;


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

    public String getBody() {
        body =
        "<body>\n" +
        "       <div>\n" +
        "           <hr/>\n" +
        "           <h3>\n" +
        "               <label>Tipo da denúncia: " + getTypeComplaint() +  "</label>\n" +
        "           </h3>\n" +
        "           <h3>\n" +
        "               <label>Denunciante: " + getName() + "</label>\n" +
        "               <br />\n" +
        "               <label>Email: " + getEmail() +"</label>\n" +
        "               <br />\n" +
        "               <label>Contato: " + getPhone() + "</label>\n" +
        "               <br />\n" +
        "               <label>Data: </label>\n" +
        "           </h3>\n" +
        "           <hr/>\n" +
        "           <h4>Mensagem</h4>\n" +
        "           <br />\n" +
        "           <p> " + getMessage() + " </p>\n" +
        "       </div>\n" +
        "    </body> ";

        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
