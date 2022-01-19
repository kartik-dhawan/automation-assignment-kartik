package PageTests.contact;
import automationassignment.pageFunctions.ContactPageImpl;
import org.testng.annotations.Test;
import Core.BasicActionsIntegration;
import io.qameta.allure.*;

@Test
@Epic("EPIC 1")

public class ErrorMessageTest extends BasicActionsIntegration{

    ContactPageImpl ContactError;

    @Test
    @Description("Creating ContactPageImpl objects before class")
    public void initImpl(){
        ContactError = new ContactPageImpl(Bot);
    }

    @Test(dependsOnMethods = "initImpl")
    @Description("to add a valid email address and verify the error message")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 1")
    @Story("Story 2")
    @Owner("Kartik Dhawan")
    public void correct_site_error_message_test(){
        stepLogger("Verification of opening of the correct site");
        ContactError.verifySite();

        stepLogger("Clicking 'Contact us'");
        ContactError.clickContactUs();

        stepLogger("Selecting 'Customer Service' from 'Subject heading'");
        ContactError.customerService();

        stepLogger("Enter a valid email address and a message and click send");
        ContactError.enterEmailID("abcicloud.com");
        ContactError.enterMessage("Good");
        ContactError.submit();

        stepLogger("Verify error message");
        ContactError.verifyErrorMessage();
    }


}
