package control;

public class client {
    private String  name;
    private String prename ;
    private String password;
    private String confige_password;
    
    public client(String name, String prename, String password, String confige_password) {
        this.name = name;
        this.prename = prename;
        this.password = password;
        this.confige_password = confige_password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrename() {
        return prename;
    }
    public void setPrename(String prename) {
        this.prename = prename;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getConfige_password() {
        return confige_password;
    }
    public void setConfige_password(String confige_password) {
        this.confige_password = confige_password;
    }
    

}
