Feature: FilltheFormInHomePage

  Background:
  Given Navigate to Url


  #Formdaki alanların görünürlüğü-Case2
  @RegressionTest
  Scenario: The visibility of the form fields
    And Check the Fields on the Form
    Then Check the Submit Message Button

  #İsim Alanını Boş Bırakma -Case3
  @RegressionTest
  Scenario: Validate form with missing name field
    Given Leave the name box blank and enter other information
    And   Click Submit Message Button
    Then  Verify InvalidName Message

  #Soyisim Alanını Boş Bırakma -Case4
  @RegressionTest
  Scenario: Validate form with missing lastname field
    Given Leave the lastname box blank  and enter other information
    And   Click Submit Message Button
    Then  Verify InvalidLastname Message

  #Telefon numarasını boş bırakma ya da geçersiz numara girme -Case5 --
  @RegressionTest
  Scenario: Validate form with missing phonenumber field
    Given Leave the phonenumber box blank or enter invalid number  and enter other information
    And   Click Submit Message Button
    Then  Verify InvalidPhoneNumber Message

  #Herhangi bir kategori seçmeme -Case6
  @RegressionTest
  Scenario: Validate form with missing category field
    Given Leave the category field
    And   Click Submit Message Button
    Then  Verify InvalidCategoryName Message

  # Home pagedeki form un başarılı girişi-Case7
  @SmokeTest @RegressionTest
  Scenario: Successful registration of the form in Home Page
    And Fill the Form
    Then Click Submit Message Button
    Then Verify Success message

  #Api Kontrolü
 # Scenario: Response Code Control in Api
 #   Given Get Request Data From Backend
 #   When  Check the Response Code





















