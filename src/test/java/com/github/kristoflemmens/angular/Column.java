package com.github.kristoflemmens.angular;

import org.openqa.selenium.WebElement;

public class Column extends PageObject {
    private final String text;

    protected Column(WebElement columnElement) {
        super(columnElement);
        this.text = columnElement.getText();
    }

    public String text() {
        return text;
    }
}
