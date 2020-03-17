import org.testng.annotations.Test;


public class Registration extends BaseUI {

    @Test

    public void testSignInPage() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPart();
        mainPage.completeSecondPart();

    }

}
