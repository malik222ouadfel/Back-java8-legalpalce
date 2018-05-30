package com.example.demo.jsonJava;

import com.example.demo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class taskJson {
    private Long idUser;
    private List<Task> taskList = new ArrayList<>();

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
