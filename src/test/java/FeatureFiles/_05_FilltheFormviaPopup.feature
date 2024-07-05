Feature: FilltheFormviaPopup

  Background:
  Given Navigate to Url


#Popup üzerinden başarılı giriş -Case27
@SmokeTest @RegressionTest
Scenario: Successful registration of the form from Contact us Pop up
Given Click the Popup
When Choose the Fill Up the Form
And Fill the Pop up Form
Then Click Submit Message Button in Pop up Form
Then Verify Success message