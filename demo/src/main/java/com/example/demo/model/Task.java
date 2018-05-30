package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "task")
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_task")
    private Long idTask;
    @Column(name = "description")
    private String desc;
    @Column(name = "titre")
    private String titre;
    @Column(name = "deadline")
    private LocalDate deadLine;
    @Column(name = "ordre")
    private Integer order;
    @Column(name = "done")
    private Boolean done;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

    public Task() {
    }

    public Task(String desc, String titre, LocalDate deadLine, Integer order) {
        this.desc = desc;
        this.titre = titre;
        this.deadLine = deadLine;
        this.order = order;
    }

    public Long getIdTask() {
        return idTask;
    }

    public void setIdTask(Long idTask) {
        this.idTask = idTask;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
