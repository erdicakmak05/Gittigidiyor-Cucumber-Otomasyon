<h3>Gittigidiyor Websitesinde Otomasyon Çalışması</h3>

- Otomasyonun hazırlanışında Java, Maven, Selenium4, WebDriverManager, Cucumber, JUnit, Courgette-JVM ve Allure-Cucumber7-JVM gibi teknoloji, kütüphane ve araçlar kullanılmıştır.

- Framework Page Object Model'e göre dizayn edilmiştir.

- Otomasyon Chrome, Firefox, Opera, Safari browserlarda çalışacak şekilde hazırlandı. Hangi browser'da çalıştırmak istediğinize "/src/test/configurations.properties" dosyasında "browser=chrome" olan kısmı "browser=firefox" olarak değiştirerek farklı browserlarda çalıştırılabilir. 
![image](https://user-images.githubusercontent.com/90332095/156772676-6377b309-d0d0-4290-9c53-158b9beb38d4.png)

- Websitesinde bulunan tüm değişkenler "/src/configurations.properties" dosyası altında tanımlanarak bütün değişkenler bu dosyadan kullanılmıştır. Böylece websitesi üzerinde herhangi bir değişiklik olduğunda otomasyon suiteinde düzeltmeler yapmak kolay olacaktır. Sık kullanılan methodlar kodun okunabilirliğini artırmak için ReusableMethods classında tanımlanmıştır.

- Frameworkde pozitif ve nagatif login testleri örnek olarak gerçekleştirilmiştir. Aldığımız raporlarda farkı görmek maksadı ile 1 test case'e hata verdirildi. Framework testlerde hata alındığında ekran görüntüsü alır ve raporlara alınan hata'nın ekran görüntüsü otomatik olarak eklenir. "/stepdefinition/Hooks.java"
![image](https://user-images.githubusercontent.com/90332095/156773726-0626ebb2-7ddc-4272-8044-e7fa4d68baa0.png)


- Cucumber, Behavior Driven Development(BDD) destekleyen bir test yaklaşımıdır. Projede Cucumber ile test senaryoları yazılırken Gherkin dili kullanıldı. Bu dilin en büyük avantajı herkes tarafından yazılan senaryoların anlaşılabilir olmasıdır.
![image](https://user-images.githubusercontent.com/90332095/156788117-d3f6f388-4b0e-4811-b8e6-9eb3e51c121c.png)
Otomatize edilen projede 3 farklı raporlama aracı kullanılmıştır. Testleri çalıştırma şeklinize göre istenilen kütüphane ile rapor alınabilir.

- Courgette-JVM Report - Paralel Test
Courgete Runner'da aynı zamanda Cucumber reports aktif halde, çift rapor alınabilmektedir.
Runner class'daki 
@CourgetteOptions(
        threads = 2, olarak ayarlandı, 2 browser parelel olarak test koşumu yapıcak şekilde kodlandı.
![image](https://user-images.githubusercontent.com/90332095/156782990-2727daea-6944-4dfc-b506-8e0e26b0656c.png)
![image](https://user-images.githubusercontent.com/90332095/156783255-e7a1fe83-8beb-4446-8e65-c9398408a4e8.png)

- Cucumber Report
![image](https://user-images.githubusercontent.com/90332095/156784509-504e3083-83fc-4d84-bb24-10caad4a171d.png)

- Extends Reports
![image](https://user-images.githubusercontent.com/90332095/156784811-096c3f4f-9fc0-4e04-a232-0f203dea19eb.png)

- Allure Reports
- node.js kurulu olmalıdır, proje dizininde allure serve komutu ile raporun birleştirilmiş haline ulaşılabilir.
![image](https://user-images.githubusercontent.com/90332095/156786790-a9eb022d-083b-4830-865e-99f3e2df95c5.png)
![image](https://user-images.githubusercontent.com/90332095/156786970-baaa1d7f-b290-4260-a1ca-0bbca52b0f2d.png)
![image](https://user-images.githubusercontent.com/90332095/156787102-402fee93-7326-4f53-84bd-2295cac74551.png)
![image](https://user-images.githubusercontent.com/90332095/156787201-4308198b-c9e8-4b95-bc06-ef32c9afe8a6.png)









