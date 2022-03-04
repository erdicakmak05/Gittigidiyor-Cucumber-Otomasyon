@smoke
  Feature: US1002 Negative Login Test

    Scenario: TC03 Yanlis mail ve yanlis şifre ile giriş yapılmamalı
      Given kullanici "URL" sayfasina gider
      And kullanici giris yap linkine tiklar
      And kullanici mail olarak "InvalidEmail" girer
      And kullanici password olarak "InvalidPassword" girer
      And kullanici giris yap butonuna tiklar
      Then kullanici basarili giris yapılmadigini test eder
      And kullanici sayfayi kapatir

    Scenario: TC04 Yanlış mail ve doğru şifre ile giriş yapılmamalı
      Given kullanici "URL" sayfasina gider
      And kullanici giris yap linkine tiklar
      And kullanici mail olarak "InvalidEmail" girer
      And kullanici password olarak "ValidPassword" girer
      And kullanici giris yap butonuna tiklar
      Then kullanici basarili giris yapılmadigini test eder
      And kullanici sayfayi kapatir

    Scenario: TC05 Doğru mail ve yanlış şifre ile giriş yapılmamalı
      Given kullanici "URL" sayfasina gider
      And kullanici giris yap linkine tiklar
      And kullanici mail olarak "ValidEmail" girer
      And kullanici password olarak "InvalidPassword" girer
      And kullanici giris yap butonuna tiklar
      Then kullanici basarili giris yapılmadigini test eder
      And kullanici sayfayi kapatir
