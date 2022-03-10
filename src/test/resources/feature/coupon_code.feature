@COUPONS
Feature: Coupon functionality
   As a customer,
  ...

  Scenario Outline: User applies coupon code
    Given user open web page "https://shop.acodemy.lv"
    And user clicks on product "<product>"
    Examples:
      | product |
      | Hoodie |
      | Album  |

    # AND, BUT