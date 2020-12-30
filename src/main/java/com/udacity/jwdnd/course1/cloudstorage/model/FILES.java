package com.udacity.jwdnd.course1.cloudstorage.model;

public class FILES {

    private Integer fileId;
    private String filename;
    private String contenttype;
    private String filesize;
    private Integer userid;
    private BLOB filedata;

    public FILES(Integer fileId, String filename, String contenttype, String filesize, Integer userid, BLOB filedata){
        this.fileId=fileId;
        this.filename=filename;
        this.contenttype=contenttype;
        this.filesize=filesize;
        this.userid=userid;
        this.filedata=filedata;
    }

    public Integer getFileId(){
        return fileId;
    }

    public String getFilename(){
        return filename;
    }

    public String getContenttype(){
        return contenttype;
    }

    public String getFilesize(){
        return filesize;
    }

    public Integer getUserid(){
        return userid;
    }

    public BLOB getFiledata(){
        return filedata;
    }
}
