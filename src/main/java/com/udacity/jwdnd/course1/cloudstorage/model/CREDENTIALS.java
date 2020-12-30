package com.udacity.jwdnd.course1.cloudstorage.model;

public class CREDENTIALS {

    private Integer credentialid;
    private String url;
    private String username;
    private String key;
    private String password;
    private String userid;

    public CREDENTIALS(Integer credentialid, String url, String username, String key, String password, String userid){
        this.credentialid=credentialid;
        this.url=url;
        this.username=username;
        this.key=key;
        this.password=password;
        this.userid=userid;
    }

    public Integer getCredentialid(){
        return credentialid;
    }

    public String getUrl(){
        return url;
    }

    public String getUsername(){
        return username;
    }

    public String getKey(){
        return key;
    }

    public String getPassword(){
        return password;
    }

    public String getUserid(){
        return userid;
    }
}
