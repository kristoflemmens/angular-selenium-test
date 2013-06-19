package com.github.kristoflemmens.angular.resources;

import com.github.kristoflemmens.angular.representation.Task;
import com.github.kristoflemmens.angular.representation.Tasks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
public class TasksResource {

    private final Tasks tasks;

    public TasksResource(Tasks tasks) {
        this.tasks = tasks;
    }

    @GET
    public List<Task> tasks() {
        return tasks.all();
    }

}
