package com.jvvitor.pessoais.gerenciadordesenhas;

public class SiteFoco {
    String user;
    String Password;
    String email;
    String SiteName;

    public SiteFoco(String site, String user, String email) {
        this.SiteName = site;
        this.user = user;
        this.email = email;
    }
    
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSiteName() {
        return SiteName;
    }
    public void setSiteName(String siteName) {
        SiteName = siteName;
    }
}
