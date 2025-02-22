package com.task_management_app.taskmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task_management_app.taskmgmt.model.Task;
import com.task_management_app.taskmgmt.repository.TaskRepository;


@Service
public class TaskService {
	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> getAllTasks(){
		return taskRepository.findAll();
	}
	
	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}

}
