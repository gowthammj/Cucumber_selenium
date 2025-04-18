Feature: To Automate the Luma Website Successfully

  Scenario: To create an Account for Luma Website
    Given user should Launch the browser.
    And Maximize the browser window.
    Then Navigate to the URL "https://magento.softwaretestingboard.com"
    Then Verify the page title and currentURL.
    When its verified Click the Create an Account button.
    Then Verify the visibility of the Create New Customer Account text.
    And Enter personal information of FirstName,LastName,Email,Password,and ConfirmPassword.
    And Click the Create an Account button.
    Then Verify the current URL and the visibility of Contact Information text.
    When its verified Click the cart icon and verify The cart is empty message.
    Then cart is empty Capture a screenshot
 
  Scenario: To Add a Product one into cart
    Given user should Navigate into the homepage.
    And Hover over the Women menu.
    When Click on Shorts under Bottoms.
    And Select the product MimiAll-PurposeShort.
    And Choose size and color options.
    And Update the quantity.
    Then Clickthe Add to Cart button.
    And Capture a screenshot.
    Then Navigate back and verify the previous page URL.
  
  Scenario: To Add a Product one into cart
    Given user should Hover over the Gear menu.
    And Click on Bags.
    Then Select the product Rival Field Messenger.
    And Update the quantity bag.
    Then Click the Add to Cart button.
    Then Capture a screenshot

  Scenario: To verify the cart
    Given the user should Click on the cart icon.
    And Click View and Edit Cart.
    Then Retrieve and print the subtotal for each product and grandtotal then Verify if the sum of sub total smatches the grand total
    Then Capture a screenshot of view cart

  Scenario: To CheckOut the Process
    Given the user should  Click the Proceed to Checkout button.
    And Enter the email,firstname,lastname,andaddressdetails.
    Then Select State,PostalCode,Country,and Phonenumber.
    And Choose a shipping method.
    Then Click the Next button.
    And Select the billing address checkbox.
    And Click the PlaceOrder button.
    Then Capture and print the order number.
    Then Capture a screenshot of orderedpage.
