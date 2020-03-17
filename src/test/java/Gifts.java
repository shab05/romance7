import org.testng.Assert;
import org.testng.annotations.Test;

public class Gifts extends BaseUI {
    String currentUrlGifts;

    @Test
    public void GiftPage(){
        driver.findElement(Locators.Link_Gift).click();
        currentUrlGifts = driver.getCurrentUrl();
        System.out.println(currentUrlGifts);
        Assert.assertEquals(currentUrlGifts,Data.expectedUrlGifts);


    }
}
