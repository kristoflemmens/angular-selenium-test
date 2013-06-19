package com.github.kristoflemmens.angular;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Table extends PageObject {
    @FindBy(tagName = "thead")
    private WebElement tableHeadElement;
    @FindBy(tagName = "tbody")
    private WebElement tableBodyElement;

    public Table(WebElement tableElement) {
        super(tableElement);
    }

    public TableGroup tableHead() {
        return new TableGroup(tableHeadElement);
    }

    public TableGroup tableBody() {
        return new TableGroup(tableBodyElement);
    }

}
