@Positive
@Paralel
Feature: Ucak bileti rezervasyonu yapilabilmeli

  Background:
    Given kullanici siteye giris yapar

  Scenario: Kullanici gecerli havayolu sirketlerinde ucak rezervasyonu yapabilmeli
    When Kullanici ucak bileti icin nereden nereye saat yon ve yolcu sayisi bilgilerini girer
    And Kullanici ucak listesinden bir ucus secer
    And Kullanici ucus seferi icin rezervasyon yapar
    Then Kullanicinin yapmis oldugu rezervasyon dogrulanir









