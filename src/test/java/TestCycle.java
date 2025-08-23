import base.BaseUrl;
import org.testng.annotations.Test;
import pages.AllVideoGamesPage;
import pages.CategoriesPage;
import pages.SignInPage;

public class TestCycle extends BaseUrl {


/* <<<<<<<<<<<<<<  ✨ Windsurf Command ⭐ >>>>>>>>>>>>>>>> */
    /**
     * Test case for valid scenario:
     * 1. Clicks on Sign In button
     * 2. Sets phone number field
     * 3. Clicks on Continue button
     * 4. Sets password field
     * 5. Clicks on Sign In Submit button
     * 6. Clicks on Open All Categories Menu button
     * 7. Clicks on All Categories Menu
     * 8. Clicks on Video Game Menu
     * 9. Clicks on All Video Games
     * 10. Clicks on Free Shipping
     * 11. Clicks on Filter By New
     * 12. Clicks on Sort By button
     * 13. Clicks on Sort By High To Low button
     */
/* <<<<<<<<<<  0176a09f-c514-4c5b-8533-570386b8e9c8  >>>>>>>>>>> */
    @Test
    public void Test_ValidSC() {
        SignInPage signInPage = homePage.clickOnSignInButton();

        signInPage.setPhoneNumberField("1558348474");

        signInPage.clickOnContinueButton();

        signInPage.setPasswordField("A@557971645h");

        signInPage.clickOnSignInSubmitButton();

        CategoriesPage categoriesPage = homePage.clickOnOpenAllCategoriesMenu();

        categoriesPage.clickOnAllCategoriesMenu();

        categoriesPage.clickOnVideoGameMenu();

        AllVideoGamesPage allVideoGamesPage = categoriesPage.clickOnAllVideoGames();

        allVideoGamesPage.clickOnFreeShipping();

        allVideoGamesPage.clickOnFilterByNew();

        allVideoGamesPage.clickOnSortByButton();

        allVideoGamesPage.clickOnSortByHighToLowButton();

    }
}
