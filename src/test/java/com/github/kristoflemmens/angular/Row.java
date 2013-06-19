package com.github.kristoflemmens.angular;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

class Row extends PageObject {
    @FindBy(tagName = "th")
    private List<WebElement> columnHeaderElements;
    @FindBy(tagName = "td")
    private List<WebElement> columnBodyElements;

    Row(WebElement searchContext) {
        super(searchContext);
    }

    Column column(int index) {
        return isRowFromHeader() ? new Column(columnHeaderElements.get(index)) : new Column(columnBodyElements.get(index));
    }

    private boolean isRowFromHeader() {
        return !columnHeaderElements.isEmpty();
    }
}
