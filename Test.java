package com.dev9;

import com.github.javafaker.Faker;
import com.teaminternational.coe.pages.LoginPage;
import com.teaminternational.coe.tests.BaseCustomTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class Test extends BaseCustomTest {

//    private WebDriver driver;
//    private Wait<WebDriver> wait;


    public static void suspend(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @AfterTest
//    public void teardown() {
//        if (driver != null) {
//            driver.quit();
//
//        }
//    }

    @BeforeTest
    public void setupTest() {
    }

    @org.testng.annotations.Test
    public void SauceDemoTest() {
        Faker faker = new Faker();
        String firstName = faker.gameOfThrones().character();
        String lastName = "of " + faker.gameOfThrones().city();
        String postalCode = faker.address().zipCode();

        open("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage();
        loginPage.username.setValue("standard_user");
        loginPage.password.setValue("secret_sauce");
        loginPage.loginBtn.click();


//        SwagLabs swagLabs = new SwagLabs();
//        swagLabs.productLabel.shouldHave(text("Products"));
//        swagLabs.addToCartByIndex(4);

//        swagLabs.productSort.selectOptionContainingText("Price (low to high)");
//        ElementsCollection elementsCollection = swagLabs.allProducts;

//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.shoppingCartButton.click();
//        shoppingCart.subheaderLabel.shouldHave(text("Your Cart"));


//        LayersCounter layersCounter = new LayersCounter;
//        layersCounter.layersCounterCart.shouldHave(text("1"));

//        Collections.sort(elementsCollection, new Comparator<SelenideElement>() {
//            public int compare(SelenideElement s1, SelenideElement s2) {
//                Float s1Value = Float.valueOf(s1.find(By.className(("inventory_item_price"))).getText().replace("$", ""));
//                Float s2Value = Float.valueOf(s2.find(By.className(("inventory_item_price"))).getText().replace("$", ""));
//                if (s1Value > s2Value) {
//                    return s1Value.compareTo(s2Value);
//                } else {
//                    return s2Value.compareTo(s1Value);
//                }
//            }
//        });


//        Assert.assertEquals(untilElementVisible(By.className("product_label")).getText(), "Products",
//                "Page label is incorrect");
//        Assert.assertEquals(wait.until(ExpectedConditions.
//                        visibilityOfAllElementsLocatedBy(By.className("inventory_item"))).size(), 6,
//                "Number of items is incorrect");
//
//        List<WebElement> elements = wait.until(ExpectedConditions.
//                visibilityOfAllElementsLocatedBy(By.className("inventory_item_price")));
//        elements.sort(Comparator.comparing(a -> Float.valueOf(a.getText().replace("$", ""))));
//
//        elements.get(0).findElement(By.xpath("following-sibling::button")).click();
//        Assert.assertEquals(untilElementVisible(By.className("fa-layers-counter")).getText(),
//                "1", "Number of selected items is incorrect");
//
//        untilElementClickable(By.className("fa-shopping-cart")).click();
//        Assert.assertEquals(untilElementVisible(By.className("subheader_label")).getText(),
//                "Your Cart", "Cart label is incorrect");
//        Assert.assertEquals(untilElementVisible(By.className("fa-layers-counter")).getText(),
//                "1", "Number of selected items is incorrect");
//
//        Assert.assertEquals(untilElementVisible(By.className("inventory_item_name")).getText(),
//                "Sauce Labs Onesie", "Name is incorrect");
//        Assert.assertEquals(untilElementVisible(By.className("inventory_item_desc")).getText(),
//                "Rib snap infant onesie for the junior automation engineer in development. " +
//                        "Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
//                "Desc is incorrect");
//        Assert.assertEquals(untilElementVisible(By.className("inventory_item_price")).getText(),
//                "7.99", "Price is incorrect");
//
//        untilElementClickable(By.className("cart_checkout_link")).click();
//
//        Assert.assertEquals(untilElementVisible(By.className("subheader_label")).getText(),
//                "Checkout: Your Information", "Cart label is incorrect");
//        untilElementVisible(By.cssSelector("[data-test='firstName']")).sendKeys(firstName);
//        untilElementVisible(By.cssSelector("[data-test='lastName']")).sendKeys(lastName);
//        untilElementVisible(By.cssSelector("[data-test='postalCode']")).sendKeys(postalCode);
//        untilElementClickable(By.className("cart_checkout_link")).click();
//
//        Assert.assertEquals(untilElementVisible(By.className("subheader_label")).getText(),
//                "Checkout: Overview", "Cart label is incorrect");
//        Assert.assertEquals(untilElementVisible(By.className("fa-layers-counter")).getText(),
//                "1", "Number of selected items is incorrect");
//
//        Assert.assertEquals(untilElementVisible(By.className("inventory_item_name")).getText(),
//                "Sauce Labs Onesie", "Name is incorrect");
//        Assert.assertEquals(untilElementVisible(By.className("inventory_item_desc")).getText(),
//                "Rib snap infant onesie for the junior automation engineer in development. " +
//                        "Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
//                "Desc is incorrect");
//        Assert.assertEquals(untilElementVisible(By.className("inventory_item_price")).getText(),
//                "$7.99", "Price is incorrect");
//
//        Assert.assertEquals(untilElementVisible(By.xpath("//div[@class='summary_info_label']" +
//                "[contains(text(),'Payment Information')]/following-sibling::div[1]")).getText(), "SauceCard #31337");
//        Assert.assertEquals(untilElementVisible(By.xpath("//div[@class='summary_info_label']" +
//                "[contains(text(),'Shipping Information')]/following-sibling::div[1]")).getText(), "FREE PONY EXPRESS DELIVERY!");
//
//        Assert.assertEquals(untilElementVisible(By.className("summary_subtotal_label")).getText(), "Item total: $7.99", "Item subotal is incorrect");
//        Assert.assertEquals(untilElementVisible(By.className("summary_tax_label")).getText(), "Tax: $0.64", "Tax is incorrect");
//        Assert.assertEquals(untilElementVisible(By.className("summary_total_label")).getText(), "Total: $8.63", "Item Total is incorrect");
//
//        untilElementClickable(By.className("cart_checkout_link")).click();
//
//        Assert.assertEquals(untilElementVisible(By.className("subheader_label")).getText(),
//                "Checkout: Complete!", "Checkout label is incorrect");
//        Assert.assertTrue(untilElementNotVisible(By.className("fa-layers-counter")), "Counter is still visible");
//        Assert.assertEquals(untilElementVisible(By.className("complete-header")).getText(), "THANK YOU FOR YOUR ORDER", "Thank you not displayed");
//        Assert.assertEquals(untilElementVisible(By.className("complete-text")).getText(), "Your order has been dispatched, and will arrive just as fast as the pony can get there!", "Dispatch message is not displayed");
//        Assert.assertTrue(untilElementVisible(By.tagName("img")).isDisplayed(), "Image not displayed");
    }


}
