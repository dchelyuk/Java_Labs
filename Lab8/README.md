# Java_Labs
***This repo is for storing java labs from LPNU.***
- - - -

## Lab #9: ##
    Creating Java REST-service for "DishwareItem" class

### Rules:
[Lab3 link](https://github.com/dchelyuk/Python_Labs/blob/master/Lab3)

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


#### Task:
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
