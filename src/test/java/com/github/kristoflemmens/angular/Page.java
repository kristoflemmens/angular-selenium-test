package com.github.kristoflemmens.angular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page extends PageObject {
    private WebElement navTasks;

    protected Page(WebDriver driver) {
        super(driver);
    }

    public TasksPage openTasks() {
        navTasks.click();
        return new TasksPage((WebDriver) searchContext);
    }
}
