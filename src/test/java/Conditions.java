import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {


    @Test

    public void GiftsPage() {
        WebElement gifts = driver.findElement(Locators.Link_Gift);
        if (gifts.getText().contains("GIFTS")) {
            gifts.click();

        } else {
            Assert.fail("not exist");
        }


    }

    @Test

    public void tes2() {
        WebElement gifts = driver.findElement(Locators.Link_Gift);
        String teddy = "Teddy bear";
        if (teddy.contains("bear")) {
            System.out.println("Teddy is here!!!");
        } else {
            Assert.fail("Teddy isn't here");
        }


    }

    @Test

    public void test3() {
        WebElement gifts = driver.findElement(Locators.Link_Gift);
        boolean confirmation = gifts.isDisplayed();
        System.out.println("it's here!!!");
    }

    @Test

    public void test4() {
        int price = 150;
        int withdiscount = 130;
        if (withdiscount == 150 - 20) {
            price = 130;
            System.out.println("you have discount!!!");
        } else {
            price = 150;
            System.out.println("no discount!!!");
        }


    }

    @Test

    public void test5() {
        ArrayList<String> main_page = new ArrayList<String>(Arrays.asList("Gifts", "Blog", "Photos"));
        String page = main_page.get(2);
        System.out.println(page);
    }

    @Test
    public void test6() {
        ArrayList<Integer> gifts = new ArrayList<Integer>(Arrays.asList(10, 5, 20));
        int total = gifts.get(0) + gifts.get(1);
        System.out.println(total);

    }

    @Test

    public void test7(){
        List<WebElement> blog = driver.findElements(Locators.LINK_BLOG);
        System.out.println(blog.size());
        for (int i = 0; i <blog.size() ; i++) {
            String info = blog.get(i).getText();
            System.out.println(info);
            blog.get(i).click();

        }

    }

    @Test

    public void test8(){

    }
}
