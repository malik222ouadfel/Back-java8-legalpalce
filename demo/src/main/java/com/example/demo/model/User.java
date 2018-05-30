package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "utilisteur")
public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "nom")
    private String LastName;
    @Column(name = "prenom")
    private String firstName;
    @Column(name = "mail")
    private String mail;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @OrderBy("order ASC")
    private List<Task> taskList;


    public User() {
    }

    public User(String lastName, String firstName, String mail) {
        LastName = lastName;
        this.firstName = firstName;
        this.mail = mail;
    }


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
