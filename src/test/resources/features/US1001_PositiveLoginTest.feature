@smoke @us01
Feature: US1001 Positive login testi

  Scenario: TC01 Email ile Positive Login Testi
    Given kullanici "URL" sayfasina gider
    And kullanici giris yap linkine tiklar
    Then kullanici mail olarak "ValidEmail" girer
    And kullanici password olarak "ValidPassword" girer
    And kullanici giris yap butonuna tiklar
    Then kullanici basarili giris yaptigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC02 Username ile Positive Login Testi
    Given kullanici "URL" sayfasina gider
    And kullanici giris yap linkine tiklar
    Then kullanici username olarak "ValidUsername" girer
    #And kullanici password olarak "ValidPassword" girer
    And kullanici giris yap butonuna tiklar
    Then kullanici basarili giris yaptigini test eder
    And kullanici sayfayi kapatir