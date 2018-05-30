package com.example.demo.restService;


import com.example.demo.Metier.TaskMetier;
import com.example.demo.jsonJava.taskJson;
import com.example.demo.model.Task;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin()
public class TaskRestService {

    @Autowired
    private TaskMetier taskMetier;

    @RequestMapping(value="/task", method = RequestMethod.PUT)
    public List<Task> updateTasks(@RequestBody taskJson taskJson) {
        return taskMetier.updateTasks(taskJson.getTaskList(), taskJson.getIdUser());
    }
}
