import org.openqa.selenium.By;

public class Locators {

    //Blog page
    public static final By LINK_BLOG = By.xpath("//a[@href='https://romanceabroad.com/content/view/blog']");

    //Registration page
    public static final By Button_JoinNow = By.cssSelector("button#show-registration-block");
    public static final By Link_Email = By.cssSelector("input#email");
    public static final By Link_Password = By.cssSelector("input#password");
    public static final By Button_Next = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By Field_Nickname = By.cssSelector("input#nickname");
    public static final By Field_Phone = By.cssSelector("//input[@name='data[phone]']");



    //Search page
    public static final By LINK_SEARCH = By.xpath("//div[@class='menu-top-right-block']//button");

    // Gift page
    public static final By Link_Gift = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");





}
