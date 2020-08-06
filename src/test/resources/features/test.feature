Feature: Lending a book

  Background:
    Given Jon is a member of the library

  Scenario: Borrower is lent a book that's in stock
    Given there is 1 copy of "Harry Potter" in stock
    When Jon borrows the book "Harry Potter" from the library
    Then stock count for "Harry Potter" should be 0
    And the book "Harry Potter" should be loaned to Jon

  Scenario: Returning a book late - incurring a fine (after cuttoff)
    Given Jon borrowed the book "Harry Potter" on 17th of March
    When Jon returns the book "Harry Potter" on the 21st of March at 00:00
    Then Jon should be charged a £5 fine