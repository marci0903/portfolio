# Portfolio Tracker API

Ez a RestAPI arra szolgál, hogy kapcsolatot létesítsen a MySql és a front-end között és kezelje a feladatokat.



## MySQL Beállítása

Első sorban az api használatához, szükséges egy MySql szerver és egy adatbázis. (Maga az adatbázis bármilyen néven létre jöhet, viszont táblát nem kell bele létre hozni, a program autómatikusan megcsinálja és beállítja)

Ezután az [application.properties](TaskManagerApi/src/main/resources/application.properties)-nevű fájlt kell megnyitni és az alábbi sorokat módosítani:

```
#configuration
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/fullstack
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```

Ha a MySql sikeresen beállításra került, az API-nak innentől kezdve működnie kellene és nincs további tehendő!

## Lekérdezések

Az API minden esetben application/json fájl formátumban válaszol!

### Külső programok ( Pl.: Postman )

Jelenleg az api 2 különböző dolgot kezel (GET, POST).

Ezekhez az elérési utak az alábbiak:

```
localhost:8080/stock_entity/getAll          ( GET )    - Lekérdezi az adatbázisban található összes adatot!
localhost:8080/stock_entity/add          ( POST )   - Új adatott ad az adatbázishoz.
```
