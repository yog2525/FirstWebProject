import org.example.*;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    SearchNike searchNike = new SearchNike();
    NewOnlinePage newOnlinePage = new NewOnlinePage();
    ComputerPage computerPage = new ComputerPage();
    SoftwareClick softwareClick = new SoftwareClick();

    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully(RegisterResultPage registerResultPage){
            //click on register button
        homePage.clickOnRegisterButton();
            // enter user registration details
        registerPage.userEntersRegistrationDetails();
           //verify register success message
            registerResultPage.verifyRegisterSuccessMessage();
    }
    @Test
    public void userShouldBrAbleToChangeTheCurrency()
    {
        homePage.clickOnCurrencyField();
           }
    @Test
     public void userShouldBeAbleToSearchProductSuccessfully()
    {
        homePage.typeInSearchField();
        searchNike.searchNikeName();
    }

    @Test
    public void addToCartButtonShouldBePresentInAllProduct() {
        homePage.addToCartButtonShouldBePresent();
        computerPage.clickOnSoftware();
        softwareClick.clickOnSoftwareButton();
    }

    @Test
    public void commentMessageAddedSuccessfully() {
        homePage.commentAddedWithTitleAndComment();
        newOnlinePage.typeComment();
        registerResultPage.verifyCommentAddedSuccessfully();
        registerResultPage.verifyCommentPresentInComments();
    }

       }