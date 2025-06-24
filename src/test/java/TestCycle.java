import base.BaseUrl;
import org.testng.annotations.Test;
import pages.SignInPage;

public class TestCycle extends BaseUrl {


    @Test
    public void Test_ValidSC() {
        SignInPage signInPage = homePage.clickOnSignInButton();

    }
}
