package com.example.hotelqualitifinalproject.model;

public class Guest {

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String telephone;
    private String birthday;
    private String profile;

    public Guest(Long id, String name, String cpf, String email, String telephone, String birthday, String profile) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password =  password;
        this.telephone = telephone;
        this.birthday = birthday;
        this.profile = profile;
    }

    public Guest(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Guest [id=" + id + ", name=" + name + ", cpf=" + cpf + ", email=" + email + ", password=" + password
                + ", telephone=" + telephone + ", birthday=" + birthday + ", profile=" + profile + "]";
    }
}
