import base.BaseUrl;
import org.testng.annotations.Test;
import pages.SignInPage;

public class TestCycle extends BaseUrl {


    @Test
    public void Test_ValidSC() {
        SignInPage signInPage = homePage.clickOnSignInButton();

        signInPage.setPhoneNumberField("1558348474");

        signInPage.clickOnContinueButton();

        signInPage.setPasswordField("A@557971645h");
    }
}
