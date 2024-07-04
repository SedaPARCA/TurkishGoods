Feature: FilltheFormviaCategorySection

  Background:
  Given Navigate to Url

  #Category bölümünden başarılı giriş - Case12
  @SmokeTest
  Scenario: Successful registration of the form via Category Section
  Given Click the Show Category Button for Product Group
  When Click the Show Product button for the Selected Product
  Then Click the Get an Offer Now Button
  And  Fill the Form
  Then Click Submit Message Button
  And Verify Success message