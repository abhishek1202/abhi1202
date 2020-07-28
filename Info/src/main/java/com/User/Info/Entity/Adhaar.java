package com.User.Info.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "adhaar")
public class Adhaar{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adhaar_user_id")
    private Users users;

    @Lob
    @Column(name = "adhaardata")
    private byte[] adhaarData;

    @Column(name = "filename")
    private String fileName;

    @Column(name = "filetype")
    private String fileType;

    public Adhaar(byte[] adhaarData, String fileName, String fileType) {
        this.adhaarData = adhaarData;
        this.fileName = fileName;
        this.fileType = fileType;
    }

    public Adhaar(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public byte[] getAdhaarData() {
        return adhaarData;
    }

    public void setAdhaarData(byte[] adhaarData) {
        this.adhaarData = adhaarData;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "Adhaar{" +
                "id=" + id +
                ", users=" + users +
                ", adhaarData=" + Arrays.toString(adhaarData) +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                '}';
    }
}