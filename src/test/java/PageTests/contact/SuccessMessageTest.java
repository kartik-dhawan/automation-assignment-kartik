package PageTests.contact;
import automationassignment.pageFunctions.ContactPageImpl;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import Core.BasicActionsIntegration;


@Test
@Epic("Epic 1")
public class SuccessMessageTest extends BasicActionsIntegration{

    ContactPageImpl ContactSuccess;

    @Test
    @Description("Creating ContactPageImpl objects before class")
    public void initImpl(){
        ContactSuccess = new ContactPageImpl(Bot);
    }

    @Test(dependsOnMethods = "initImpl")
    @Description("to add a valid email address and verify the success message")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Feature 1")
    @Story("Story 1")
    @Owner("Kartik Dhawan")
    public void correct_site_success_message_test(){
        stepLogger("Verification of opening of the correct site");
        ContactSuccess.verifySite();

        stepLogger("Clicking 'Contact us'");
        ContactSuccess.clickContactUs();

        stepLogger("Selecting 'Customer Service' from 'Subject heading'");
        ContactSuccess.customerService();

        stepLogger("Enter a valid email address and a message and click send");
        ContactSuccess.enterEmailID("abc@icloud.com");
        ContactSuccess.enterMessage("dhjsjhjdk");
        ContactSuccess.submit();

        stepLogger("Verify success message");
        ContactSuccess.verifySuccessMessage();
    }

}
