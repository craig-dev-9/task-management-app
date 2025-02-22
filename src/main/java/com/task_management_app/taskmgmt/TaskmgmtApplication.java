package com.task_management_app.taskmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "controller",
        "service",
        "repository",
        "model",
        "com.task_management_app.taskmgmt" 
})
public class TaskmgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmgmtApplication.class, args);
	}

}
