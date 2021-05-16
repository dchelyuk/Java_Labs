# Python_Labs
***This repo is for storing python labs from LPNU.***
- - - -

## Lab #7: ##
    Creating Java "Drug" class

### Rules:
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

#### Task:
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