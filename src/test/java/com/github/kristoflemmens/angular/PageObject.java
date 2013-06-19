package com.github.kristoflemmens.angular;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class PageObject {
    protected final SearchContext searchContext;

    protected PageObject(SearchContext searchContext) {
        this.searchContext = searchContext;
        initElements(new AjaxElementLocatorFactory(searchContext, 5), this);
    }
}
