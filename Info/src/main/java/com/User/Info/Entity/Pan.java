package com.User.Info.Entity;

import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.Arrays;


@Entity
@Table(name = "pan")
public class Pan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "pan_user_id")
    private Users users;

    @Lob
    @Column(name = "pandata")
    private byte[] panData;

    @Column(name = "filename")
    private String fileName;

    @Column(name = "filetype")
    private String fileType;

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

    public byte[] getPanData() {
        return panData;
    }

    public void setPanData(byte[] panData) {
        this.panData = panData;
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

    public Pan()
    {

    }

    public Pan(byte[] panData, String fileName, String fileType) {
        this.panData = panData;
        this.fileName = fileName;
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "id=" + id +
                ", users=" + users +
                ", panData=" + Arrays.toString(panData) +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                '}';
    }
}
