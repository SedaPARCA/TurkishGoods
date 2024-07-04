package StepDefinitions;

import Pages.Locators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Steps {

    private Response apiResponse;
    Locators lc = new Locators();
    String Name ="TestAutomation";
    String LastName="Test";
    String Eposta="testautomation@tremglobal.com";
    String phoneNumber="5520000000";
    String message ="Test çalışmasıdır.";

    @Given("Navigate to Url")
    public void navigateToUrl()  {

     GWD.getDriver().get("https://turkishgoods.com/");

     lc.myClick(lc.cookiesAccept);

    }

    @Given("Verification of Access to the Page")
    public void verificationOfAccessToThePage() {

    lc.verifyContainsText(lc.HomeText,"Home");
    }

    @And("Fill the Form")
    public void fillTheForm() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",lc.SendButton);
        Thread.sleep(1000);

        lc.mySendKeys(lc.Ad,Name);
        lc.mySendKeys(lc.Soyad,LastName);
        lc.mySendKeys(lc.TelefonNumarasi,phoneNumber);
        lc.mySendKeys(lc.Eposta,Eposta);
        lc.myJsClick(lc.KategoriSec);
        Select select =new Select(lc.KategoriSec);
        select.selectByIndex(2);
        Thread.sleep(1000);

        lc.myJsClick(lc.UrünSec);
        Select select2 =new Select(lc.UrünSec);
        select.selectByIndex(1);
        lc.mySendKeys(lc.MessageBox,message);

    }

    @Then("Click Submit Message Button")
    public void clickSubmitMessageButton() {

        lc.myJsClick(lc.SendButton);
    }

    @Then("Verify Success message")
    public void verifySuccessMessage() {
     lc.verifyContainsText(lc.TeşekkürlerText,"Thank You");

    }

    @Given("Click the Get Offer Now Button in Home Page")
    public void clickTheGetOfferNowButtonInHomePage() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",lc.GetanOfferNowofApple);
        Thread.sleep(1000);
        lc.myJsClick(lc.GetanOfferNowofApple);
    }

    @When("Click the Get Offer Now Button in Product Page")
    public void clickTheGetOfferNowButtonInProductPage() throws InterruptedException {
        Thread.sleep(1000);
        lc.myClick(lc.GetanOfferNowinProductPage);
    }

    @And("Verification of Access to the Form")
    public void verificationOfAccessToTheForm() throws InterruptedException {
        Thread.sleep(1000);
    lc.verifyContainsText(lc.NeedProductsFromTurkeyPages,"NEED PRODUCTS FROM TURKEY?");
    }

    @Given("Click the Popup")
    public void clickThePopup() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",lc.Ad);
        Thread.sleep(2000);
        lc.myJsClick(lc.HelloContactUsPopUPText);
    }

    @When("Choose the Fill Up the Form")
    public void chooseTheFillUpTheForm() throws InterruptedException {
        Thread.sleep(1000);
      lc.myJsClick(lc.FillUpTheForm);
        Thread.sleep(1000);

    }

    @And("Fill the Pop up Form")
    public void fillThePopUpForm() {
        lc.mySendKeys(lc.PopupName,Name);
        lc.mySendKeys(lc.PopupSurName,LastName);
        lc.mySendKeys(lc.PopupPhoneNumber,phoneNumber);
        lc.mySendKeys(lc.PopupEmail,Eposta);
        lc.myJsClick(lc.PopupCategoryButton);
        Select select =new Select(lc.PopupCategoryButton);
        select.selectByIndex(2);
        lc.myJsClick(lc.PopupProductButton);
        Select select2 =new Select(lc.PopupProductButton);
        select.selectByIndex(2);
        lc.mySendKeys(lc.PopupMessageBox,message);

    }

    @Then("Click Submit Message Button in Pop up Form")
    public void clickSubmitMessageButtonInPopUpForm() {

        lc.myClick(lc.PopupSubmitButton);
    }

    @Given("Get Request Data From Backend")
    public void getRequestDataFromBackend() {

        apiResponse = RestAssured.get("endpoint gelecek.");  // Api ye istek.
    }

    @When("Check the Response Code")
    public void checkTheResponseCode() {

        int statusCode = apiResponse.getStatusCode();
        Assert.assertEquals(200, statusCode);  //yanıt kontrolü

        String responseBody = apiResponse.getBody().asString();
        System.out.println("API Yanıtı: " + responseBody);
        Assert.assertFalse(responseBody.isEmpty(), "Apı yanıtı boş olmamalıdır.");

        JSONObject jsonObject = new JSONObject(responseBody.substring(1, responseBody.length() - 1));
        String message = jsonObject.getString("message");
        String basvuruId = jsonObject.getString("basvuru_id");

        Assert.assertEquals("true", message);
    }

    @Given("Click the Contact Button")
    public void clickTheContactButton() {

        lc.myClick(lc.Contact);

    }

    @When("Click the Submit form button for the county")
    public void clickTheSubmitFormButtonForTheCounty() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",lc.ContactFormButtonUSA);
        lc.myJsClick(lc.ContactFormButtonUSA);
    }

    @Then("Fill the contact form")
    public void fillTheContactForm() throws InterruptedException {

        lc.mySendKeys(lc.ContactFormName,Name);
        lc.mySendKeys(lc.ContactFormSurName,LastName);
        lc.mySendKeys(lc.ContactFormPhoneNumber,phoneNumber);
        lc.mySendKeys(lc.ContactFormEmail,Eposta);
        lc.myJsClick(lc.ContactFormSubjectButton);
        Select select =new Select(lc.ContactFormSubjectButton);
        select.selectByIndex(2);
        lc.mySendKeys(lc.ContactFormMessageBox,message);
    }

    @Then("Submit message for the contact form")
    public void submitMessageForTheContactForm() {

        lc.myClick(lc.ContactFormSubmitButton);

        //Doğrulama mesajı eklenemedi,eklenmeli Ali den bilgi gelince.
    }

    @Given("Click the Show Category Button for Product Group")
    public void clickTheShowCategoryButtonForProductGroup() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",lc.CATEGORIEStext);
        Thread.sleep(2000);
        lc.myClick(lc.ShowCategoryButtonChocolate);
        Thread.sleep(2000);

    }

    @When("Click the Show Product button for the Selected Product")
    public void clickTheShowProductButtonForTheSelectedProduct() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",lc.ShowProductButtonGodiva);

        lc.myJsClick(lc.ShowProductButtonGodiva);
    }

    @Then("Click the Get an Offer Now Button")
    public void clickTheGetAnOfferNowButton() {
        lc.myJsClick(lc.GetanOfferNowButtonGodiva);
    }

    @And("Check the Fields on the Form")
    public void checkTheFieldsOnTheForm() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",lc.Ad);

        Assert.assertTrue(lc.Ad.isDisplayed());
        Assert.assertTrue(lc.Soyad.isDisplayed());
        Assert.assertTrue(lc.TelefonNumarasi.isDisplayed());
        Assert.assertTrue(lc.Eposta.isDisplayed());
        Assert.assertTrue(lc.KategoriSec.isDisplayed());
        Assert.assertTrue(lc.UrünSec.isDisplayed());
        Assert.assertTrue(lc.MessageBox.isDisplayed());


    }

    @Then("Check the Submit Message Button")
    public void checkTheSubmitMessageButton() {
        Assert.assertTrue(lc.SendButton.isDisplayed());

    }

    @Given("Enter {string} in the First Name field")
    public void enterInTheFirstNameField(String Firstname) {
        lc.mySendKeys(lc.Ad,Firstname);
    }

    @And("Enter {string} in the Last Name field")
    public void enterInTheLastNameField(String LastName) {
        lc.mySendKeys(lc.Soyad,LastName);
    }

    @And("Enter {string} in the Email field")
    public void enterInTheEmailField(String Email) {
        lc.mySendKeys(lc.Eposta,Email);
    }


    @And("Enter {string} in the PhoneNumber field")
    public void enterInThePhoneNumberField(String PhoneNumber) {
        lc.mySendKeys(lc.TelefonNumarasi,PhoneNumber);
    }


    @Given("Leave the name box blank and enter other information")
    public void leaveTheNameBoxBlankAndEnterOtherInformation() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",lc.SendButton);
        Thread.sleep(1000);

        lc.mySendKeys(lc.Soyad,LastName);
        lc.mySendKeys(lc.TelefonNumarasi,phoneNumber);
        lc.mySendKeys(lc.Eposta,Eposta);
        lc.myJsClick(lc.KategoriSec);
        Select select =new Select(lc.KategoriSec);
        select.selectByIndex(2);
        lc.myClick(lc.UrünSec);
        Select select2 =new Select(lc.UrünSec);
        select.selectByIndex(1);
        lc.mySendKeys(lc.MessageBox,message);
    }

    @Then("Verify InvalidName Message")
    public void verifyInvalidNameMessage() {
        Assert.assertTrue(lc.InvalidName.isDisplayed());
    }

    @Given("Leave the lastname box blank  and enter other information")
    public void leaveTheLastnameBoxBlankAndEnterOtherInformation() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",lc.SendButton);
        Thread.sleep(1000);

        lc.mySendKeys(lc.Ad,Name);
        lc.mySendKeys(lc.TelefonNumarasi,phoneNumber);
        lc.mySendKeys(lc.Eposta,Eposta);
        lc.myJsClick(lc.KategoriSec);
        Select select =new Select(lc.KategoriSec);
        select.selectByIndex(2);
        lc.myClick(lc.UrünSec);
        Select select2 =new Select(lc.UrünSec);
        select.selectByIndex(1);
        lc.mySendKeys(lc.MessageBox,message);
    }

    @Then("Verify InvalidLastname Message")
    public void verifyInvalidLastnameMessage() {
        Assert.assertTrue(lc.InvalidLastName.isDisplayed());
    }

    @Given("Leave the phonenumber box blank or enter invalid number  and enter other information")
    public void leaveThePhonenumberBoxBlankOrEnterInvalidNumberAndEnterOtherInformation() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",lc.SendButton);
        Thread.sleep(1000);

        lc.mySendKeys(lc.Ad,Name);
        lc.mySendKeys(lc.Soyad,LastName);
        lc.mySendKeys(lc.Eposta,Eposta);
        lc.myJsClick(lc.KategoriSec);
        Select select =new Select(lc.KategoriSec);
        select.selectByIndex(2);
        lc.myClick(lc.UrünSec);
        Select select2 =new Select(lc.UrünSec);
        select.selectByIndex(1);
        lc.mySendKeys(lc.MessageBox,message);
    }

    @Then("Verify InvalidPhoneNumber Message")
    public void verifyInvalidPhoneNumberMessage() {
        Assert.assertTrue(lc.InvalidPhoneNumber.isDisplayed());
    }

    @Given("Leave the category field")
    public void leaveTheCategoryField() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);",lc.SendButton);
        Thread.sleep(1000);

        lc.mySendKeys(lc.Ad,Name);
        lc.mySendKeys(lc.Soyad,LastName);
        lc.mySendKeys(lc.TelefonNumarasi,phoneNumber);
        lc.mySendKeys(lc.Eposta,Eposta);
        lc.mySendKeys(lc.MessageBox,message);


    }

    @Then("Verify InvalidCategoryName Message")
    public void verifyInvalidCategoryNameMessage() {

        Assert.assertTrue(lc.InvalidCategoryName.isDisplayed());
    }

    @Given("Click the Get Offer Now Button for Strawbeery in Home Page")
    public void clickTheGetOfferNowButtonForStrawbeeryInHomePage() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",lc.GetanOfferNowofApple);
        Thread.sleep(1000);

        lc.myJsClick(lc.GetanOfferButtonStrawberry);

    }

    @Given("Click the Get Offer Now Button for Melon in Home Page")
    public void clickTheGetOfferNowButtonForMelonInHomePage() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",lc.GetanOfferNowofApple);
        Thread.sleep(1000);

        lc.myJsClick(lc.GetanOfferButtonMelon);

    }

    @Given("Click the Get Offer Now Button for Green Coffee Beans in Home Page")
    public void clickTheGetOfferNowButtonForGreenCoffeeBeansInHomePage() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",lc.GetanOfferNowofApple);
        Thread.sleep(1000);

        lc.myJsClick(lc.GetanOfferButtonGreenCoffeeBeans);
    }


    @When("Click the Submit form button for UK")
    public void clickTheSubmitFormButtonForUK() throws InterruptedException {

        lc.myJsClick(lc.ContactFormButtonUK);
    }

    @When("Click the Submit form button for CHINA")
    public void clickTheSubmitFormButtonForCHINA() {
        lc.myJsClick(lc.ContactFormButtonChina);
    }

    @When("Click the Submit form button for PAKISTAN")
    public void clickTheSubmitFormButtonForPAKISTAN() {
        lc.myJsClick(lc.ContactFormButtonPakistan);
    }

    @When("Click the Submit form button for TAJIKISTAN")
    public void clickTheSubmitFormButtonForTAJIKISTAN() {
        lc.myJsClick(lc.ContactFormButtonTajıkıstan);
    }

    @When("Click the Submit form button for AFGHANISTAN")
    public void clickTheSubmitFormButtonForAFGHANISTAN() {

        lc.myJsClick(lc.ContactFormButtonAfghanistan);
    }

    @When("Click the Submit form button for AZERBAIJAN")
    public void clickTheSubmitFormButtonForAZERBAIJAN() {

        lc.myJsClick(lc.ContactFormButtonAzerbaıjan);
    }

    @When("Click the Submit form button for UZBEKISTAN")
    public void clickTheSubmitFormButtonForUZBEKISTAN() {

        lc.myJsClick(lc.ContactFormButtonUzbekistan);
    }

    @When("Click the Submit form button for ALGERIA")
    public void clickTheSubmitFormButtonForALGERIA() {
        lc.myJsClick(lc.ContactFormButtonAlgeria);
    }

    @When("Click the Submit form button for RUSSIA")
    public void clickTheSubmitFormButtonForRUSSIA() {

        lc.myJsClick(lc.ContactFormButtonRussia);
    }

    @Given("Leave the name box blank and enter other information in contact form")
    public void leaveTheNameBoxBlankAndEnterOtherInformationInContactForm() {

        lc.mySendKeys(lc.ContactFormSurName,LastName);
        lc.mySendKeys(lc.ContactFormPhoneNumber,phoneNumber);
        lc.mySendKeys(lc.ContactFormEmail,Eposta);
        lc.myJsClick(lc.ContactFormSubjectButton);
        Select select =new Select(lc.ContactFormSubjectButton);
        select.selectByIndex(2);
        lc.mySendKeys(lc.ContactFormMessageBox,message);

    }

    @And("Click Submit Message Button in contact form")
    public void clickSubmitMessageButtonInContactForm() {
        lc.myJsClick(lc.ContactFormSubmitButton);
    }

    @Given("Leave the lastname box blank and enter other information in contact form")
    public void leaveTheLastnameBoxBlankAndEnterOtherInformationInContactForm() {

        lc.mySendKeys(lc.ContactFormName,Name);
        lc.mySendKeys(lc.ContactFormPhoneNumber,phoneNumber);
        lc.mySendKeys(lc.ContactFormEmail,Eposta);
        lc.myJsClick(lc.ContactFormSubjectButton);
        Select select =new Select(lc.ContactFormSubjectButton);
        select.selectByIndex(2);
        lc.mySendKeys(lc.ContactFormMessageBox,message);
    }

    @Given("Leave the phoneNumber box blank and enter other information in contact form")
    public void leaveThePhoneNumberBoxBlankAndEnterOtherInformationInContactForm() {

        lc.mySendKeys(lc.ContactFormName,Name);
        lc.mySendKeys(lc.ContactFormSurName,LastName);
        lc.mySendKeys(lc.ContactFormEmail,Eposta);
        lc.myJsClick(lc.ContactFormSubjectButton);
        Select select =new Select(lc.ContactFormSubjectButton);
        select.selectByIndex(2);
        lc.mySendKeys(lc.ContactFormMessageBox,message);

    }

    @Given("Leave the Subject box blank and enter other information in contact form")
    public void leaveTheSubjectBoxBlankAndEnterOtherInformationInContactForm() {

        lc.mySendKeys(lc.ContactFormName,Name);
        lc.mySendKeys(lc.ContactFormSurName,LastName);
        lc.mySendKeys(lc.ContactFormPhoneNumber,phoneNumber);
        lc.mySendKeys(lc.ContactFormEmail,Eposta);
        lc.mySendKeys(lc.ContactFormMessageBox,message);

    }

    @Then("Verify InvalidSubjectName Message")
    public void verifyInvalidSubjectNameMessage() {

        Assert.assertTrue(lc.InvalidSubjectName.isDisplayed());

    }
}
