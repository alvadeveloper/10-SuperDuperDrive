package com.udacity.jwdnd.course1.cloudstorage.model;

public class NOTES {

    private Integer noteid;
    private String notetitle;
    private String notedescription;
    private int userid;

    public NOTES(Integer noteid, String notetitle, String notedescription, Integer userid){
        this.noteid = noteid;
        this.notetitle = notetitle;
        this.notedescription = notedescription;
        this.userid=userid;
    }

    public Integer getNoteid(){
        return noteid;
    }

    public String getNotetitle(){
        return notetitle;
    }

    public String getNotedescription(){
        return notedescription;
    }

    public Integer getUserid(){
        return userid;
    }
}
