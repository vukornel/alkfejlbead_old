# alkfejlbead

Leltár program:
  A program egy raktár müködését elősegítő adatbázist fog szimulálni, melyben lehetőség nyílik a termékek nyilvántartására, az adatok egyszerű felvitelére, módositására, elolvasására. Az adatbázisban többféle felhasználói típus jelenik majd meg, más más szerepkörrel.

Funkcionális és nem funkcionális követelmények:
  - Leltár lekérdezése, módosítása, változások felvitele, adatok törlése
  - Felhasználói feladatkörök kezelése
  - Mögöttes adatbázis müködtetése
  - Lehetőség legyen regisztrálni felhasználókat
  - Az adatok védelme illetéktelen hozzáféréstől
 
  - Backend: Spring Boot keretrendszer 
  - Frontend: Angular
  
Szemantikus URL-k.
Végpontok:
  - GET /: főoldal
  - GET /drink/beers: sörök listázása
  - GET /drink/wines: borok listázása
  - GET /storage/storages: összes tárolt adat
  - GET /drink/delete/{drink}: A paramétereknek megfelelő italt törli az adatbázisból, ha létezik.
  - GET /drink/find/{drink}: A paramétereknek megfelelő italt megkeresi és kilistázza az adatait, ha létezi.
  - POST /drink/{drink}/edit: A paramétereknek megfelelő ital megadott adatait módosítja, ha létezik.
  - POST /drink/create/{drink}: A paramétereknek megfelelő italt létrehozza és eltárolja az adatbázisban.
  
![alt text](https://github.com/vukornel/alkfejlbead/blob/master/src/main/resources/kep1.png)

Szerepkörök:
  - A mind a frontendet mind a backendet közösen kis részekre osztva fpgjuk megoldani
