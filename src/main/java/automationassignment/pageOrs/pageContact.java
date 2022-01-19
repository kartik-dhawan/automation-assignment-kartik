package automationassignment.pageOrs;
import org.openqa.selenium.By;

public class pageContact {

    public static final By CONTACT_BTN = By.id("contact-link");
    public static final By SELECT_SERVICE = By.xpath("//select[@id='id_contact']/option[@value='2']");
    public static final By EMAIL_ADDRESS = By.id("email");
    public static final By MESSAGE_BOX = By.id("message");
    public static final By SEND_BUTTON = By.id("submitMessage");
    public static final By ERROR_MESSAGE = By.xpath("//li[contains(text(), 'Invalid email address.')]");
    public static final By SUCCESS_MESSAGE = By.xpath("//p[contains(text(), 'Your message has been successfully sent to our team.')]");
    public static final By SUBJECT_HEADING = By.id("id_contact");
}
