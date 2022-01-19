package automationassignment.pageFunctions;
import automationassignment.pageOrs.pageContact;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static automationassignment.pageOrs.pageContact.ERROR_MESSAGE;
import static java.lang.Thread.sleep;

public class ContactPageImpl extends BasicActions{

    public ContactPageImpl(WebDriver bot){
        super(bot);
    }

    @Step("Verify the correct site is opened")
    public void verifySite(){
        waitForVisibility(pageContact.CONTACT_BTN);
        Assert.assertEquals(pageTitle(), "My Store");
    }

    @Step("Clicking on contact us button")
    public void clickContactUs(){
        click(pageContact.CONTACT_BTN);
    }

    @Step("Selecting customer service")
    public void customerService(){
        sleep(3);
        click(pageContact.SUBJECT_HEADING);
        click(pageContact.SELECT_SERVICE);
    }

    @Step("Entering email address")
    public void enterEmailID(String email){
        enterText(pageContact.EMAIL_ADDRESS, email);
    }

    @Step("Enter some message")
    public void enterMessage(String message){
        enterText(pageContact.MESSAGE_BOX, message);
    }

    @Step("clicking on submit button")
    public void submit(){
        click(pageContact.SEND_BUTTON);
    }

    @Step("Verifying success message")
    public void verifySuccessMessage(){
        sleep(2);
        Assert.assertTrue(checkElement(pageContact.SUCCESS_MESSAGE));
    }

    @Step("Verifying error message")
    public void verifyErrorMessage(){
        sleep(2);
        Assert.assertTrue(checkElement(ERROR_MESSAGE));
    }



}
