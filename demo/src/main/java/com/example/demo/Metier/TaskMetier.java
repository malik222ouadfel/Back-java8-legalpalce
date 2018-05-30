package com.example.demo.Metier;

import com.example.demo.model.Task;

import java.util.List;

public interface TaskMetier {

    public List<Task> updateTasks(List<Task> taskList, Long idUser);
    public Task updateTask(Task task);
}
