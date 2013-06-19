package com.github.kristoflemmens.angular.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Task {

    @JsonProperty
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
