Feature: FilltheFormInHomePageProduct

  Background:
  Given Navigate to Url

  # Homee Pagedeki Apple ürünü için Get an Offer Now Üzerinden başarılı Giriş -Case8
  @SmokeTest @RegressionTest
  Scenario: Successful registration of the form from Apple Get an Offer Now Button
  Given Click the Get Offer Now Button in Home Page
  When Click the Get Offer Now Button in Product Page
  And  Verification of Access to the Form
  And Fill the Form
  Then Click Submit Message Button
  Then Verify Success message

  # Home Pagedeki Strawberry ürünü için Get an Offer Now Üzerinden başarılı Giriş-Case9
  @RegressionTest
  Scenario: Successful registration of the form from Strawberry Get an Offer Now Button
  Given Click the Get Offer Now Button for Strawbeery in Home Page
  When Click the Get Offer Now Button in Product Page
  And  Verification of Access to the Form
  And Fill the Form
  Then Click Submit Message Button
  Then Verify Success message

  # Home Pagedeki Melon ürünü için Get an Offer Now Üzerinden başarılı Giriş -Case10
  @RegressionTest
  Scenario: Successful registration of the form from Melon Get an Offer Now Button
  Given Click the Get Offer Now Button for Melon in Home Page
  When Click the Get Offer Now Button in Product Page
  And  Verification of Access to the Form
  And Fill the Form
  Then Click Submit Message Button
  Then Verify Success message

  # Home Pagedeki Green Coffee Beans ürünü için Get an Offer Now Üzerinden başarılı Giriş-Case11
  @RegressionTest
  Scenario: Successful registration of the form from Green Coffee Beans Get an Offer Now Button
  Given Click the Get Offer Now Button for Green Coffee Beans in Home Page
  When Click the Get Offer Now Button in Product Page
  And  Verification of Access to the Form
  And Fill the Form
  Then Click Submit Message Button
  Then Verify Success message
