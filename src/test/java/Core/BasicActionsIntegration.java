package Core;

import automationassignment.bot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicActionsIntegration {

    protected WebDriver Bot;
    protected static final String URL = "http://automationpractice.com/";

    @BeforeClass
    public void openBrowser(){
        Bot = new bot().getBot();
        Bot.get(URL);
    }

    protected static void stepLogger(String step){
        StepLoggerClass.step(step);
    }

    @AfterClass
    public void close(){
        Bot.quit();
    }

}
