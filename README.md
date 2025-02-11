## Projekti info

Java projekt, mis on tehtud kasutades Spring Boot-i. <br>
Samuti on rakendus tehtud kihtideks ja kasutan H2 andmebaasi, kirjutatud mõned <br>
Unit ja Integratsiooni testid. *Front-end* jaoks on kasutusel Thymeleaf. <br>
Rakendus on eesti ja inglise keelne ehk multikeelsuse toega. <br>
**Data.sql** failist laetakse vajalikud andmed kohe andmebaasi.

### Projekti käivitamine

Projekti käivitamiseks kasutada nt IntelliJ IDEA, peamine meetod failis **AddCarsAppApplication.java** <br>
tuleb käivitada ja minna lehele: http://localhost:8080/user

### Andmebaasi seadistus

Näeb välja selline, minna antud aadressile ja vajutada nuppu Connect: http://localhost:8080/h2-console/ <br>
Andmebaasi parooli saab resources kaustas: **application.properties** failist. <br>
Andmebaasi seadistuse pilt: <br>
![h2 setup](https://github.com/user-attachments/assets/e40e0cfe-1d4b-4fcf-95c9-ddaf3821ba0a)

### Autor, ajakulu

Kristjan Tõnismäe, umbes 8h hetkel