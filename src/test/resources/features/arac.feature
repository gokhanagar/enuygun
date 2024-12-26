@Negative
@Paralel
Feature: Arac kiralanabilmeli

  Background:
    Given kullanici siteye giris yapar

  Scenario: Kullanici arac kiralayabilmeli

    When Kullanici arac kiralama icin alis yeri tarih ve saat bilgilerini girer
    And Kullanici gunluk arac kiralama listesinden bir arac secer
    Then Kullanici arac kiralama ek hizmet ve guvence sayfasina yonlendirilir
    And Kullanici arac kiralama surucu bilgilerini girer














