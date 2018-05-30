package com.example.demo.Metier;

import com.example.demo.dao.TaskRepository;
import com.example.demo.model.Task;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskMetierImpl implements TaskMetier {
    @Autowired
    private TaskRepository taskRepository;


    @Override
    @Transactional
    public List<Task> updateTasks(List<Task> taskList, Long idUser) {
        if(taskList == null || taskList.isEmpty()) return null;
        User user = new User();
        user.setIdUser(idUser);
        for(Task task : taskList) {
            task.setUser(user);
            taskRepository.save(task);
        }
        return taskList;
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
}
