package com.udacity.jwdnd.course1.cloudstorage.model;

public class USERS {

    private Integer userid;
    private String username;
    private String salt;
    private String password;
    private String firstname;
    private String lastname;

    public USERS (Integer userid, String username, String salt, String password, String firstname, String lastname){
        this.userid = userid;
        this.username = username;
        this.salt = salt;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getUserId(){
        return userid;
    }

    public String getUsername(){
        return username;
    }

    public String getSalt(){
        return salt;
    }

    public String getPassword(){
        return password;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

}
