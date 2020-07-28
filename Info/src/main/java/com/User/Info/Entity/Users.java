package com.User.Info.Entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstName;


    @Column(name = "lastname")
    private String lastName;

    @Column(name = "panno")
    private long PanNo;

    @Column(name = "adhaarno")
    private long adhaarNo;

    @Column(name = "phoneno")
    private long phoneNo;

    @OneToOne(mappedBy="users", cascade={CascadeType.ALL})
    private Adhaar adhaar;

    @OneToOne(mappedBy="users", cascade={CascadeType.ALL})
    private Pan pan;


    public Users()
    {

    }

    public Users(String firstName, String lastName, long panNo, long adhaarNo, long phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        PanNo = panNo;
        this.adhaarNo = adhaarNo;
        this.phoneNo = phoneNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPanNo() {
        return PanNo;
    }

    public void setPanNo(long panNo) {
        PanNo = panNo;
    }

    public long getAdhaarNo() {
        return adhaarNo;
    }

    public void setAdhaarNo(long adhaarNo) {
        this.adhaarNo = adhaarNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PanNo=" + PanNo +
                ", adhaarNo=" + adhaarNo +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
