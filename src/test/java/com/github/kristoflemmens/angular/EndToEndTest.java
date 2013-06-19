package com.github.kristoflemmens.angular;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static java.lang.System.setProperty;
import static org.fest.assertions.api.Assertions.assertThat;

public class EndToEndTest {

    private static WebDriver driver;

    @BeforeClass
    public static void startBrowser() throws Exception {
        setProperty("webdriver.chrome.driver", new File("C:\\Users\\kristofle\\Downloads\\chromedriver.exe").getAbsolutePath());
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void stopBrowser() throws Exception {
        driver.quit();
    }

    @Before
    public void openApplication() throws Exception {
        driver.get("http://localhost:8080");
    }

    @Test
    public void simpleTest() throws Exception {
        Table tasks = new HomePage(driver).openTasks().tasks();

        assertThat(tasks.tableHead().row(0).column(0).text()).isEqualTo("Description");
        assertThat(tasks.tableBody().row(0).column(0).text()).isEqualTo("Task 1");
        assertThat(tasks.tableBody().row(1).column(0).text()).isEqualTo("Task 2");
        assertThat(tasks.tableBody().row(2).column(0).text()).isEqualTo("Task 3");
    }

}
