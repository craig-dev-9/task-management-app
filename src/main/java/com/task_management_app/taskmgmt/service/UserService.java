package com.task_management_app.taskmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task_management_app.taskmgmt.model.Task;
import com.task_management_app.taskmgmt.model.User;
import com.task_management_app.taskmgmt.repository.TaskRepository;
import com.task_management_app.taskmgmt.repository.UserRepository;

@Service
public class UserService {
	
	  	@Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private TaskRepository taskRepository;

	    public void addTaskToUser(Long userId, Task task) {
	        User user = userRepository.findById(userId)
	                .orElseThrow(() -> new RuntimeException("User not found"));

	        task.setUser(user);
	        user.getTasks().add(task);
	        taskRepository.save(task);
	        userRepository.save(user);
	    }

	    public void removeTaskFromUser(Long userId, Long taskId) {
	        Task task = taskRepository.findById(taskId)
	                .orElseThrow(() -> new RuntimeException("Task not found"));

	        if (!task.getUser().getId().equals(userId)) {
	            throw new RuntimeException("Task does not belong to this user");
	        }
	        task.setUser(null);
	        taskRepository.delete(task);
	    }

	
	

}
