# Java_Labs #
***This repo is for storing python labs from LPNU.***
- - - -

## Lab #7: ##
    Creating Java "Drug" class

### Rules: ###
    Створити консольну програму мовою Java і написати клас із вашої лабораторної роботи 1:
    1. Додаткових 5 приватних полів, які найкраще описують даний клас (додатково до полів, вказаних в таблиці)
    2. Методи доступу до цих полів (наприклад для поля name – getName() і setName())
    3. Статичне поле (числового типу)
    4. Для кожного класу слід додати 2 захищених поля (protected)
    5. Поля з пунктів 3 і 4 мають представляти атрибути описуваного класу
    6. Дефолтний конструктор, конструктор з чотирма параметрами (першими чотирма властивостями з п.1) і конструктор з
    усіма полями. При роботі з конструкторами слід переадресовувати виклик в один з конструктор з-за допомогою this та
    уникати копіювання коду
    7. Методи
        * toString - вивести інформацію про об’єкт
        * Статичний метод printStaticField() - виводить інформацію про значення статичного поля (де Field - назва поля)
        * Метод printField()  - виводить інформацію про значення статичного поля
        * resetValues(параметри) - змінює значення всіх полів на передані в параметрах
    8. Розроблений код має бути залито в гіт репозиторій! В репозиторії мать бути README і .gitignore файл.

В main() методі визначіть 3 об’єкти типу із завдання (з-за допомогою різних конструкторів) та виведіть інформацію про
них з-за допомогою методу toString() та виведіть інформацію за допомогою методів printStaticField() і printField()

#### Task: ####
    Ukr:
    Створити клас “Лікарський засіб (англійською - Drug)” котрий містить поля:
    - об'єм діючої речовини
    - (у міліграмах)
    - діюча речовина
    - максимальна кількість доз на день
    
    Eng:
    Create "Drug" class, which has these fields:
    - volume of operative substance
    - (in milligrams)
    - operative substance
    - maximum amount of doses per day
- - - -

## Lab #8: ##
    Creating Java "DishwareItem" class hierarchy from Lab №2

### Rules: ###
[Lab 2 link](https://github.com/dchelyuk/Python_Labs/blob/master/Lab2/ClassDiagram_Programming_Danylo_Chelyuk_IoT-12.pdf)

    1. Написати код до завдання з лабораторної №2 
    2. При записі програми потрібно використовувати домовленості щодо оформлення коду java code convention
    3. Класи потрібно грамотно розкласти по пакетах
    4. Робота з консоллю або консольне меню повинні бути мінімальними
    5. В коді мають бути присутні лиш ті класи, які містяться на діаграмі класів
    6. Атрибути класів та їх видимість мають співпадати із зазначеними на діаграмі класів. Те саме стосується методів
        класів
    7. Для сортування слід використати вбудовані методи сортування, доступні в мові Java
    8. Сортування слід реалізувати в окремому методі
    9. Код немає містити статичних методів/атрибутів. Дозволено лиш один статичний метод - main
        Код має використовувати перелічувальний тип (Enum)
    10. Код слід залити в окремий репозиторій, попередньо створивши pull request (тобто код слід писати в окремому
        branch  на його основі зробити pull request)
    11. Реалізація порівняння елементів та їх сортування з використанням лямбда-виразів (приклади використання лямбд:
        https://www.mkyong.com/java8/java-8-lambda-comparator-example/)
    12. Замість написання сеттерів і геттерів слід використати аннотації Lombok (@Data)
    13. Перетворити проект таким чином, щоб його збірку можна було виконувати з-за допомогою  maven. Також підключити
        наступні плагіни в pom.xml
            * плагін Jacoco який виконуватиме перевірку коду тестами (в секцію build):
            * плагін FindBugs який здійснює автоматичну перевірку якості коду і пошук потенційних помилок в коді (в
                секцію reporting):
            * плагін PMD (в секцію reporting):
            * плагін Checkstyle - перевіряє дотримання code convention (в секцію reporting):
    
    
    14. Після завершення роботи слід виконати команду mvn site і переглянути результати її виконання в папці
        target/site (відкривши файл index.html)
    15. В коді слід виправити всі помилки, які виявляють плагіни FindBugs, PMD і Checkstyle (окрім помилок, пов'язаних
        з відсутністю коментарів).
    
    Генерація відбувається з-за допомогою команди maven (можна виконувати з консолі) або з використанням
    Intelij IDEA/Eclipse :
        mvn archetype:generate -DgroupId=ua.lviv.iot -DartifactId=work -Dversion=1.0-SNAPSHOT
        -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -DinteractiveMode=false

#### Task: ####
    Ukr:
    Магазин посуду.
    - Реалізувати ієрархію посуду, присутнього в магазині
    - Реалізувати пошук посуду, необхідного для організації святкування на 12 осіб
    - Вивести результат, відсортований за типом посуду
    - Реалізувати можливість сортування знайденого посуду за ще одним типом параметру (на вибір, реалізовано як
        окремий метод)
    - Реалізація сортування має передбачати можливість сортувати як за спаданням, так і за зростанням.

    Eng:
    Dishes shop.
    - Implement hierarchy of dishes presented in the store
    - Implement search of dishes needed for the organization of celebration for 12 guests
    - Display the result sorted by dishes type
    - Implement the ability to sort selected dishes by additional parameter type (optional, implemented as a
        separate method)
    - Implementation of sorting should provide the ability to sort both in descending or ascending order.
- - - -


## Lab #9: ##
    Creating Java REST-service for "DishwareItem" class

#### (TASK REQUIREMENT): ####
#### In order to see Lab №9, check directory "Lab8" in "lab9" branch: #### 

[Lab 9 link](https://github.com/dchelyuk/Java_Labs/tree/lab9/Lab8)

### Rules: ###

[Lab 3 link](https://github.com/dchelyuk/Python_Labs/blob/master/Lab3)

    1. Задачею 9 лабораторної є створити REST сервіс для одного з класів, створених у лабораторній роботі 3 (наприклад
        для класу Aligator з прикладу в лабораторній роботі 8  - AligatorController),  в котрому реалізовані
        CRUD-операції (Get/Post/Put/Delete) над ресурсом (наприклад над ресурсом Aligator) та операція повернення
        всіх об'єктів. 
    2. Операція get має використовувати id в url-запиту: /aligator/20
    3. Операція get без id в url-запиту має повертати список всіх наявних об'єктів
    4. Для реалізації  REST сервісу базовий клас з 8-ї лабораторної слід розширити полем id (типу Integer), та добавити
        set/get методи
    5. Також код слід перевірити з-за допомогою Findbugs/checkstyle/pmd плагінів
    6. Код слід залити окремим пул реквестом відносно коду 8-ї лабораторної (тобто необхідно створити окремий бренч
        в тому самому репозиторії, де є код 8ї роботи, який згодом стане пул реквестом, але сам пул реквест
        не мерджати!!!!)
    7. Код контролера та класу RestApplication слід помістити в окремих пакетах
    8. Збереження об'єктів класу Алігатор слід виконувати в об'єкті типу  Map
    9. Дана лабораторна передбачає зміну існуючого pom.xml файлу шляхом додавання в `нього необхідних залежностей

**_Важливо:_**

    Метод @PutMapping вертає:
        * 404, якщо такого об'єкта (який ви пробуєте модифікувати) - не існує
        * 200, якщо такий об'єкт існує і попереднє значення об'єкта (тобто всі поля до змін)
        * Збереження даних варто зробити в Map, дане поле контролера дозволяється зробити статичним


#### Task: ####
    Ukr:
    Магазин посуду.
    - Реалізувати ієрархію посуду, присутнього в магазині
    - Реалізувати пошук посуду, необхідного для організації святкування на 12 осіб
    - Вивести результат, відсортований за типом посуду
    - Реалізувати можливість сортування знайденого посуду за ще одним типом параметру (на вибір, реалізовано як
        окремий метод)
    - Реалізація сортування має передбачати можливість сортувати як за спаданням, так і за зростанням.

    Eng:
    Dishes shop.
    - Implement hierarchy of dishes presented in the store
    - Implement search of dishes needed for the organization of celebration for 12 guests
    - Display the result sorted by dishes type
    - Implement the ability to sort selected dishes by additional parameter type (optional, implemented as a
        separate method)
    - Implementation of sorting should provide the ability to sort both in descending or ascending order.