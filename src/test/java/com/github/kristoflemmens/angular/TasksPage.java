package com.github.kristoflemmens.angular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class TasksPage extends Page {
    private WebElement tasks;

    public TasksPage(WebDriver driver) {
        super(driver);
    }

    public Table tasks() {
        return new Table(tasks);
    }
}
