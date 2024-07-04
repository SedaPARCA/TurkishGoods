Feature: FilltheContactForm

  Background:
  Given Navigate to Url

  #Contact Form USA Başarılı Giriş -Case13
  @SmokeTest
  Scenario: Successful registration of the Contact form for USA
  Given Click the Contact Button
  When Click the Submit form button for the county
  Then Fill the contact form
  #Then Submit message for the contact form
  #And Verify Success message

  #Contact Form UK Başarılı Giriş -Case14
  @RegressionTest
  Scenario: Successful registration of the Contact form for UK
  Given Click the Contact Button
  When Click the Submit form button for UK
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message

  #Contact Form CHINA Başarılı Giriş -Case15
  @RegressionTest
  Scenario: Successful registration of the Contact form for CHINA
  Given Click the Contact Button
  When Click the Submit form button for CHINA
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message

  #Contact Form PAKISTAN Başarılı Giriş -Case16
  @RegressionTest
  Scenario: Successful registration of the Contact form for PAKISTAN
  Given Click the Contact Button
  When Click the Submit form button for PAKISTAN
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message

   #Contact Form TAJIKISTAN Başarılı Giriş -Case17
  @RegressionTest
  Scenario: Successful registration of the Contact form for TAJIKISTAN
  Given Click the Contact Button
  When Click the Submit form button for TAJIKISTAN
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message

  #Contact Form AFGHANISTAN Başarılı Giriş-Case18
  @RegressionTest
  Scenario: Successful registration of the Contact form for AFGHANISTAN
  Given Click the Contact Button
  When Click the Submit form button for AFGHANISTAN
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message

  #Contact Form AZERBAIJAN Başarılı Giriş-Case19
  @RegressionTest
  Scenario: Successful registration of the Contact form for AZERBAIJAN
  Given Click the Contact Button
  When Click the Submit form button for AZERBAIJAN
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message


  #Contact Form UZBEKISTAN Başarılı Giriş-Case20
  @RegressionTest
  Scenario: Successful registration of the Contact form for UZBEKISTAN
  Given Click the Contact Button
  When Click the Submit form button for UZBEKISTAN
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message

  #Contact Form ALGERIA Başarılı Giriş-Case21
  @RegressionTest
  Scenario: Successful registration of the Contact form for ALGERIA
  Given Click the Contact Button
  When Click the Submit form button for ALGERIA
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message

  #Contact Form RUSSIA Başarılı Giriş-Case22
  @RegressionTest
  Scenario: Successful registration of the Contact form for RUSSIA
  Given Click the Contact Button
  When Click the Submit form button for RUSSIA
  Then Fill the contact form
  #Then Submit message for the contact form
 # And Verify Success message

  #Contact form da Name kısmını boş bırakma -Case23
  @RegressionTest
  Scenario: Validate correct form with missing name field
  Given Click the Contact Button
  When Click the Submit form button for the county
  Given Leave the name box blank and enter other information in contact form
  And   Click Submit Message Button in contact form
  Then  Verify InvalidName Message

  #Contact form da LastName kısmını boş bırakma-Case24
  @RegressionTest
  Scenario: Validate correct form with missing lastname field
  Given Click the Contact Button
  When Click the Submit form button for the county
  Given Leave the lastname box blank and enter other information in contact form
  And   Click Submit Message Button in contact form
  Then  Verify InvalidLastname Message

  #Contact form da PhoneNumber kısmını boş bırakma-Case25
  @RegressionTest
  Scenario: Validate correct form with missing phoneNumber field
  Given Click the Contact Button
  When Click the Submit form button for the county
  Given Leave the phoneNumber box blank and enter other information in contact form
  And   Click Submit Message Button in contact form
  Then  Verify InvalidPhoneNumber Message

  #Contact form da Subject kısmını boş bırakma-Case26
  @RegressionTest
  Scenario: Validate correct form with missing Subject field
  Given Click the Contact Button
  When Click the Submit form button for the county
  Given Leave the Subject box blank and enter other information in contact form
  And   Click Submit Message Button in contact form
  Then  Verify InvalidSubjectName Message
