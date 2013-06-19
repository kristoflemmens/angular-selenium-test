package com.github.kristoflemmens.angular;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

class TableGroup extends PageObject {
    @FindBy(tagName = "tr")
    List<WebElement> rowElements;

    public TableGroup(WebElement tableGroupElement) {
        super(tableGroupElement);
    }

    Row row(int index) {
        return new Row(rowElements.get(index));
    }
}
