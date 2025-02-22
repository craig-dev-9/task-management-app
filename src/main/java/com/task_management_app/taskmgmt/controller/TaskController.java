package com.task_management_app.taskmgmt.controller;

import com.task_management_app.taskmgmt.model.Task;
import com.task_management_app.taskmgmt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired  
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/all")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/create")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }
}
