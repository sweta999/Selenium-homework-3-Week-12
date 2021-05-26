package electronics;

/** 1.	Create the class ElectronicsTest
Write the following test
1.	Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
        1.1 Mouse Hover on “Electronics” Tab
        1.2 Mouse Hover on “Cell phones” and click
        1.3 Verify the text “Cell phones”
 2.	Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
        2.1 Mouse Hover on “Electronics” Tab
        2.2 Mouse Hover on “Cell phones” and click
        2.3 Verify the text “Cell phones”
        2.4 Click on List View Tab
        2.5 Click on product name “Nokia Lumia 1020” link
        2.6 Verify the text “Nokia Lumia 1020”
        2.7 Verify the price “$349.00”
        2.8 Change quantity to 2
        2.9 Click on “ADD TO CART” tab
        2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        After that close the bar clicking on the cross button.
        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        2.12 Verify the message "Shopping cart"
        2.13 Verify the quantity is 2
        2.14 Verify the Total $698.00
        2.15 click on checkbox “I agree with the terms of service”
        2.16 Click on “CHECKOUT”
        2.17 Verify the Text “Welcome, Please Sign In!”
        2.18 Click on “REGISTER” tab
        2.19 Verify the text “Register”
        2.20 Fill the mandatory fields
        2.21 Click on “REGISTER” Button
        2.22 Verify the message “Your registration completed”
        2.23 Click on “CONTINUE” tab
        2.24 Verify the text “Shopping card”
        2.25 click on checkbox “I agree with the terms of service”
        2.26 Click on “CHECKOUT”
        2.27 Fill the Mandatory fields
        2.28 Click on “CONTINUE”
        2.29 Click on Radio Button “2nd Day Air ($0.00)”
        2.30 Click on “CONTINUE”
        2.31 Select Radio Button “Credit Card”
        2.32 Select “Visa” From Select credit card dropdown
        2.33 Fill all the details
        2.34 Click on “CONTINUE”
        2.35 Verify “Payment Method” is “Credit Card”
        2.36 Verify “Shipping Method” is “2nd Day Air”
        2.37 Verify Total is “$698.00”
        2.38 Click on “CONFIRM”
        2.39 Verify the Text “Thank You”
        2.40 Verify the message “Your order has been successfully processed!”
        2.41 Click on “CONTINUE”
        2.42 Verify the text “Welcome to our store”
        2.43 Click on “Logout” link
        2.44 Verify the URL is “https://demo.nopcommerce.com/”
 */

import browsertesting.BaseTest;
import com.google.common.base.Verify;
import javafx.scene.control.Tab;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;

public class ElectronicsTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);  //this method comes from BaseTest
    }

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        /** 1.1 Mouse Hover on “Electronics”Tab
         *  1.2 Mouse Hover on “Cell phones” and click
         */
        Thread.sleep(2000);
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        mouseHoverToElementAndClick(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

        /*Actions actions = new Actions(driver);
        WebElement Electronics = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        WebElement Cellphones = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

        actions.moveToElement(Electronics).moveToElement(Cellphones).click().build().perform();*/

        /** 1.3 Verify the text “Cell phones”*/
        Thread.sleep(2000);
        String expectedtext = "Cell phones";
        String actualtext = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        Assert.assertEquals("Text does not match", expectedtext, actualtext);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        /** 2.1 Mouse Hover on “Electronics” Tab
         * 2.2 Mouse Hover on “Cell phones” and click */

        Thread.sleep(2000);
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        mouseHoverToElementAndClick(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

        /*Actions actions = new Actions(driver);
        WebElement Electronics = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        WebElement Cellphones = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

        actions.moveToElement(Electronics).moveToElement(Cellphones).click().build().perform();*/

        /**  2.3 Verify the text “Cell phones”*/
        Thread.sleep(2000);
        String expectedtext = "Cell phones";
        String actualtext = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        Assert.assertEquals("Text does not match", expectedtext, actualtext);

        /**  2.4 Click on List View Tab*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//a[contains(text(),'List')]"));

        /** 2.5 Click on product name “Nokia Lumia 1020” link */
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]"));

        /** 2.6 Verify the text “Nokia Lumia 1020”*/
        Thread.sleep(3000);
        String expectedtest =  "Nokia Lumia 1020";
        String actualtest = getTextFromElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
        Assert.assertEquals("Text Nokia Lumia 1020 does not match.", expectedtest, actualtest);

        /** 2.7 Verify the price “$349.00”*/
        Thread.sleep(3000);
        String expectedprice =  "$349.00";
        String actualprice = getTextFromElement(By.xpath("//span[@id='price-value-20']"));
        Assert.assertEquals("Price do not match", expectedprice,actualprice);

        /** 2.8 Change quantity to 2*/
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"),"2");

        /** 2.9 Click on “ADD TO CART” tab*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));

        /** 2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
         After that close the bar clicking on the cross button.*/
        Thread.sleep(3000);
        String expectedmessage =  "The product has been added to your shopping cart";
        String actualmessage = getTextFromElement(By.xpath("//div[@id='bar-notification']"));
        Assert.assertEquals("Product added message is not displayed", expectedmessage,actualmessage);

        clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));

        /** 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.*/
        Thread.sleep(3000);
        mouseHoverToElement(By.xpath("//span[text()='Shopping cart']"));
        mouseHoverToElementAndClick(By.xpath("//button[contains(text(),'Go to cart')]"));

        /*Actions action = new Actions(driver);
        WebElement Shoppingcart = driver.findElement(By.xpath("//span[text()='Shopping cart']")); ////span[contains(text(),'Shopping cart')]
        WebElement GOTOCART = driver.findElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        action.moveToElement(Shoppingcart).moveToElement(GOTOCART).click().build().perform();*/

        /** 2.12 Verify the message "Shopping cart"*/
        Thread.sleep(3000);
        String expectedmessage1 = "Shopping cart";
        String actualmessage1 = getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        Assert.assertEquals("Shopping cart is not displayed", expectedmessage1,actualmessage1);

        /** 2.13 Verify the quantity is 2*/
        Thread.sleep(10000);
        String expectedquantity = "(2)";
        String actualquantity = getTextFromElement(By.xpath("//span[contains(text(),'(2)')]"));
        Assert.assertEquals("Quantity display is not correct", expectedquantity,actualquantity);

        /** 2.14 Verify the Total $698.00*/
        Thread.sleep(10000);
        String expectedTotal = "$698.00";
        String actualTotal = getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"));
        Assert.assertEquals("Total display is not correct", expectedTotal,actualTotal);

        /** 2.15 click on checkbox “I agree with the terms of service”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//input[@id='termsofservice']"));
        //driver.findElement(By.xpath("//input[@id='termsofservice']")).click();

        /** 2.16 Click on “CHECKOUT”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//button[@id='checkout']"));

        /** 2.17 Verify the Text “Welcome, Please Sign In!”*/
        Thread.sleep(3000);
        String expectedText = "Welcome, Please Sign In!";
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        Assert.assertEquals("Welcome message is not correctly displayed", expectedText,actualText);

        /** 2.18 Click on “REGISTER” tab*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//button[contains(text(),'Register')]"));

        /** 2.19 Verify the text “Register”*/
        Thread.sleep(3000);
        String expectedText1 = "Register";
        String actualText1 = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));
        Assert.assertEquals("Text REGISTER is not displayed", expectedText1,actualText1);

        /**  2.20 Fill the mandatory fields*/
        sendTextToElement(By.xpath("//input[@id='FirstName']"), "Gopi");
        sendTextToElement(By.xpath("//input[@id='LastName']"),"Nandan");
        sendTextToElement(By.xpath("//input[@id='Email']"),"gop@gmail.com");  //always give new email before running program
        sendTextToElement(By.xpath("//input[@id='Password']"),"S999ugar");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"S999ugar");

        /** 2.21 Click on “REGISTER” Button*/
        clickOnElement(By.xpath("//button[@id='register-button']"));

        /** 2.22 Verify the message “Your registration completed”*/
        Thread.sleep(3000);
        String expectedmessage2 = "Your registration completed";
        String actualmessage2 = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        Assert.assertEquals("Message 'Your registration completed' is not displayed", expectedmessage2,actualmessage2);

        /** 2.23 Click on “CONTINUE” tab*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));

        /** 2.24 Verify the text “Shopping cart”*/
        Thread.sleep(3000);
        String expectedText2 = "Shopping cart";
        String actualText2 = getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        Assert.assertEquals("Text is not displayed", expectedText2,actualText2);

        /**  2.25 click on checkbox “I agree with the terms of service”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//input[@id='termsofservice']"));

        /** 2.26 Click on “CHECKOUT”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//button[@id='checkout']"));

        /**  2.27 Fill the Mandatory fields*/
        Thread.sleep(3000);
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"),"16"); //Malta
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"),"City of Valleta");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"),"Old Bakery Street");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "28767");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "019432789540");

        /** 2.28 Click on “CONTINUE”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));

        /** 2.29 Click on Radio Button “2nd Day Air ($0.00)”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//input[@id='shippingoption_2']"));

        /** 2.30 Click on “CONTINUE”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));

        /** 2.31 Select Radio Button “Credit Card” and continue*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));

        /** 2.32 Select “Visa” From Select credit card dropdown */
        Thread.sleep(3000);
        selectByValueFromDropDown(By.xpath("//select[@id='CreditCardType']"), "visa");

        /* 2.33 Fill all the details*/
        Thread.sleep(3000);
        sendTextToElement(By.xpath("//input[@id='CardholderName']"),"Gopi Nandan");
        sendTextToElement(By.xpath("//input[@id='CardNumber']"),"4485821584127596");
        selectByValueFromDropDown(By.xpath("//select[@id='ExpireMonth']"),"2");
        selectByValueFromDropDown(By.xpath("//select[@id='ExpireYear']"),"2026");
        sendTextToElement(By.xpath("//input[@id='CardCode']"),"451");

        /** 2.34 Click on “CONTINUE”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));

        /** 2.35 Verify “Payment Method” is “Credit Card”*/
        Thread.sleep(3000);
        String expectedMethod = "Payment Method: Credit Card";
        String actualMethod = getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]"));
        Assert.assertEquals("Payment Method is not correct", expectedMethod,actualMethod);

        /** 2.36 Verify “Shipping Method” is “2nd Day Air”*/
        Thread.sleep(3000);
        String expectedMethod1 = "Shipping Method: 2nd Day Air";
        String actualMethod1 = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]"));
        Assert.assertEquals("Shipping Method is not correct", expectedMethod1,actualMethod1);

        /** 2.37 Verify Total is “$698.00”*/
        Thread.sleep(3000);
        String expectedTotal1 = "$698.00";
        String actualTotal1 = getTextFromElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"));
        Assert.assertEquals("Total is not correct", expectedTotal1,actualTotal1);

        /** 2.38 Click on “CONFIRM”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));

        /** 2.39 Verify the Text “Thank You”*/
        Thread.sleep(5000);
        String expectedText3 = "Thank you";
        String actualText3 = getTextFromElement(By.xpath("//h1[contains(text(),'Thank you')]"));
        Assert.assertEquals("Text Thank you is not displayed", expectedText3,actualText3);

        /** 2.40 Verify the message “Your order has been successfully processed!”*/
        Thread.sleep(10000);
        String expectedmessage3 = "Your order has been successfully processed!";
        String actualmessage3 = getTextFromElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
        Assert.assertEquals("Message order successfully processed is not displayed", expectedmessage3,actualmessage3);

        /** 2.41 Click on “CONTINUE”*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));

        /** 2.42 Verify the text “Welcome to our store”*/
        Thread.sleep(3000);
        String expectedText4 = "Welcome to our store";
        String actualText4 = getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        Assert.assertEquals("Text Welcome to our store is not displayed", expectedText4,actualText4);

        /** 2.43 Click on “Logout” link*/
        Thread.sleep(3000);
        clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));

        /**  2.44 Verify the URL is “https://demo.nopcommerce.com/”*//*
        Thread.sleep(3000);
*/
    }

    @After
    public void tearDown(){
        closeBrowser();
    }


}





































