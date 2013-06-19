package com.github.kristoflemmens.angular;

import com.github.kristoflemmens.angular.representation.Task;
import com.github.kristoflemmens.angular.representation.Tasks;
import com.github.kristoflemmens.angular.resources.TasksResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class TaskService extends Service<TaskConfiguration> {

    public static void main(String[] args) throws Exception {
        new TaskService().run(args);
    }

    @Override
    public void initialize(Bootstrap<TaskConfiguration> bootstrap) {
        bootstrap.setName("Angular Selenium Test Server");
        bootstrap.addBundle(new AssetsBundle("/META-INF/resources/webjars", "/lib"));
        bootstrap.addBundle(new AssetsBundle("/assets/", "/", "index.html"));
    }

    @Override
    public void run(TaskConfiguration configuration, Environment environment) throws Exception {
        environment.addResource(new TasksResource(tasks()));
    }

    private Tasks tasks() {
        return new Tasks() {
            @Override
            public List<Task> all() {
                return newArrayList(new Task("Task 1"), new Task("Task 2"), new Task("Task 3"));
            }
        };
    }
}
