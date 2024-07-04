package Pages;

import StepDefinitions.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Events {
    public Locators() {
        PageFactory.initElements(GWD.getDriver(), this); // Kullanacağım zaman driver üzerinden bulur ve getirir.
    }
    @FindBy(xpath = "//*[text()='Home']")
    public WebElement HomeText;

    @FindBy(xpath = "//*[@id=\"Name\"]")
    public WebElement Ad;

    @FindBy(xpath = "//*[@placeholder='LAST NAME*']")
    public WebElement Soyad;

    @FindBy(xpath = "//*[@placeholder='Phone Number']")
    public WebElement TelefonNumarasi;

    @FindBy(xpath = "//*[@placeholder='EMAIL']")
    public WebElement Eposta;

    @FindBy(xpath = "//*[@name='Category' and @class='jsx-3361794147 ProductGeneral_input__gq4Hp  form-select-lg ']")
    public WebElement KategoriSec;

    @FindBy(xpath = "//*[@name='Product' and @class='jsx-3361794147 ProductGeneral_input__gq4Hp form-select form-select-lg']")
    public WebElement UrünSec;

    @FindBy(xpath = "//*[@id=\"Message\"]")
    public WebElement MessageBox;

    @FindBy(xpath = "//*[@class='jsx-3361794147 formButton']")
    public WebElement SendButton;

    @FindBy(xpath = "//h4[text()='Thank You']")
    public WebElement TeşekkürlerText;

    @FindBy(xpath = "//*[text()='Allow All ']")
    public WebElement cookiesAccept;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/div[2]/div[1]/div/div[1]/a/button")
    public WebElement GetanOfferNowofApple;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div[1]/div[1]/div[5]/a/button")
    public WebElement GetanOfferNowinProductPage;

    @FindBy(xpath = "//*[@id=\"contactForm\"]/div/div/div/div/span")
    public WebElement NeedProductsFromTurkeyPages;

    @FindBy(xpath = "//*[text()='Hello, Contact Us']")
    public WebElement HelloContactUsPopUPText;

    @FindBy(xpath = "//*[text()='Fill up the Form']")
    public WebElement FillUpTheForm;

    @FindBy(xpath = "(//*[@class='jsx-160844830 ProductGeneral_input__gq4Hp form-control form-control-lg '])[1]")
    public WebElement PopupName;

    @FindBy(xpath = "(//*[@class='jsx-160844830 ProductGeneral_input__gq4Hp form-control form-control-lg '])[2]")
    public WebElement PopupSurName;

    @FindBy(xpath = "(//*[@class='form-control phone '])[1]")
    public WebElement PopupPhoneNumber;

    @FindBy(xpath = "//*[@class='jsx-160844830  ProductGeneral_input__gq4Hp form-control form-control-lg email ']")
    public WebElement PopupEmail;

    @FindBy(xpath = "//*[@name='Category' and @class='jsx-160844830 ProductGeneral_input__gq4Hp  form-select-lg ']")
    public WebElement PopupCategoryButton;

    @FindBy(xpath = "//*[@name='Product' and @class='jsx-160844830 ProductGeneral_input__gq4Hp form-select form-select-lg']")
    public WebElement PopupProductButton;

    @FindBy(xpath = "//*[@class='jsx-160844830 ProductGeneral_textArea__FxcLk form-control form-control-lg']")
    public WebElement PopupMessageBox;

    @FindBy(xpath = "//*[@class='jsx-160844830 buttonModal__text']")
    public WebElement PopupSubmitButton;

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement Contact;

    @FindBy(xpath = "(//*[text()='Submit Form'])[1]")
    public WebElement ContactFormButtonUSA;

    @FindBy(xpath = "(//*[@class='jsx-ce9515fafbbcbfeb Modal_input__lw0yQ form-control form-control-lg '])[1]")
    public WebElement ContactFormName;

    @FindBy(xpath = "(//*[@class='jsx-ce9515fafbbcbfeb Modal_input__lw0yQ form-control form-control-lg '])[2]")
    public WebElement ContactFormSurName;

    @FindBy(xpath = "(//input[@placeholder='Phone Number'])[1]")
    public WebElement ContactFormPhoneNumber;

    @FindBy(xpath = "//*[@class='jsx-ce9515fafbbcbfeb  Modal_input__lw0yQ form-control form-control-lg email ']")
    public WebElement ContactFormEmail;

    @FindBy(xpath = "//*[@name='Subject']")
    public WebElement ContactFormSubjectButton;

    @FindBy(xpath = "//*[@class='jsx-ce9515fafbbcbfeb Modal_textArea__kyp6J form-control form-control-lg']")
    public WebElement ContactFormMessageBox;

    @FindBy(xpath = "//*[@class='jsx-ce9515fafbbcbfeb button__text' and text()='SUBMIT MESSAGE']")
    public WebElement ContactFormSubmitButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[1]/div/div/div[2]/div/div[1]/div/div[2]/a/button")
    public WebElement ShowCategoryButtonChocolate;

    @FindBy(xpath = "//h3[text()='Godiva']")
    public WebElement ShowProductButtonGodiva;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/section[1]/div[2]/div[2]/div/div[2]/div[4]/a/button")
    public WebElement GetanOfferNowButtonGodiva;

    @FindBy(xpath = "//h2[text()='CATEGORIES']")
    public WebElement CATEGORIEStext;

    @FindBy(xpath = "//*[text()='Invalid Name']")
    public WebElement InvalidName;

    @FindBy(xpath = "//*[text()='Invalid Last name']")
    public WebElement InvalidLastName;

    @FindBy(xpath = "//*[text()='Invalid Phone Number']")
    public WebElement InvalidPhoneNumber;

    @FindBy(xpath = "//*[text()='Invalid Category Name']")
    public WebElement InvalidCategoryName;

    @FindBy(xpath = "(//*[text()='get an offer now'])[2]")
    public WebElement GetanOfferButtonStrawberry;

    @FindBy(xpath = "(//*[text()='get an offer now'])[3]")
    public WebElement GetanOfferButtonMelon;

    @FindBy(xpath = "(//*[text()='get an offer now'])[4]")
    public WebElement GetanOfferButtonGreenCoffeeBeans;

    @FindBy(xpath = "(//*[text()='Submit Form'])[2]")
    public WebElement ContactFormButtonUK;

    @FindBy(xpath = "(//*[text()='Submit Form'])[3]")
    public WebElement ContactFormButtonChina;

    @FindBy(xpath = "(//*[text()='Submit Form'])[4]")
    public WebElement ContactFormButtonPakistan;

    @FindBy(xpath = "(//*[text()='Submit Form'])[5]")
    public WebElement ContactFormButtonTajıkıstan;

    @FindBy(xpath = "(//*[text()='Submit Form'])[6]")
    public WebElement ContactFormButtonAfghanistan;

    @FindBy(xpath = "(//*[text()='Submit Form'])[7]")
    public WebElement ContactFormButtonAzerbaıjan;

    @FindBy(xpath = "(//*[text()='Submit Form'])[8]")
    public WebElement ContactFormButtonUzbekistan;

    @FindBy(xpath = "(//*[text()='Submit Form'])[9]")
    public WebElement ContactFormButtonAlgeria;

    @FindBy(xpath = "(//*[text()='Submit Form'])[10]")
    public WebElement ContactFormButtonRussia;

    @FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/form/div/div[7]/div")
    public WebElement InvalidSubjectName;







































































}