# Java_Labs
***This repo is for storing java labs from LPNU.***
- - - -

## Lab #8: ##
    Creating Java "Drug" class

### Rules:
[Lab2 link](https://github.com/dchelyuk/Python_Labs/blob/master/Lab2/ClassDiagram_Programming_Danylo_Chelyuk_IoT-12.pdf)

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
