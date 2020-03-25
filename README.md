# epamejc2020 \m/

1. Создать "светофор", который выводит сигнал-цвет.
Вы вводите время от 0-3 минуты - зеленый, 4-5 минуты 
- желтый, 6-10 красный. Вводим цифру 0 до n, получаем
результат. Работу программы сделать непрерывной, выход
можно обработать.

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework1

2. Создать immutable class, создать пару объектов, посмотреть как работает,
поэксперементировать с данными. ЗАПОМНИТЬ!

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework2

3. Arrays 
3.1. Создать массив массивов, задается размерность на основании которое
генерируются случайные символы типа char. Пример:
Input: 4 2
output:
k c 
b p 
b h 
h g 

https://github.com/VLDRospuskov/epamejc2020/blob/YanaOvsyannikova/src/main/java/homework/homework3/arrays/RandomCharTable.java

3.2. Сгенерировать массив массивов указав размерность, заполнить его случайными
символами. Написать 2 стратегии, которые будут формировать строку на основе
данного массива. Стратегия А - работает по принципу *_*_*, а стратегия B 
- работает по принципу _*_*_ . Пример:
input: 5 5
output: 
d a l p j 
v c b z g 
a d l r f 
f d m x h 
k d l h b 
input strategy: A
output: dljalfklb

https://github.com/VLDRospuskov/epamejc2020/blob/YanaOvsyannikova/src/main/java/homework/homework3/arrays/CharMatrix.java

3.3. Написать программу которая будет генерировать пирамидку. Пример:
input: 10
output: 
XXXXXXXXXX
XXXXXXXXX
XXXXXXXX
XXXXXXX
XXXXXX
XXXXX
XXXX
XXX
XX
X

https://github.com/VLDRospuskov/epamejc2020/blob/YanaOvsyannikova/src/main/java/homework/homework3/arrays/RandomPyramidalMatrix.java

4. Strings

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework4

4.1. Написать программу которая генерирует новую строку на основании входных
данных, строка + четные/нечетные, пример:
Input: String        Input: even        output: tig
4.2. Написать программу которая будет генерировать строку по индексам.
Пример:
Input: Hello World,     
input: 0  output: H, 
input: 4  output: Ho, 
input: 6 output: HoW
4.3. Поменять местами символы в строке, на вход приходит строка и 2 индекса 
между, которыми нужно сделать обмен. Пример:
Input: Hello World
Input: 0, 4
output oelloH World
4.4. Написать программу которая переворачивает слова, но при этом оставляет 
их на прежних местах. Пример
Input: Hello World
output: olleH dlroW

5. Recursion

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework5/recursion

5.1. Поиск числа Фиббоначи
5.2. Написать программу которая умеет вовзодить в степени:
input number: 4
input pow: 3
output: 64
5.3.  Посчитать количество чисел:
input: 567
output: 3

6. Аннотации

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework6

Создать свою кастомную аннотацию где будет "имя - string" и "возраст - int",
то есть в аннотации передаем (name = "sdgf", age = "12"). Повесить аннотацию
на конструктор. Цель сделать так чтобы когда у нас будет создаваться объект
по типу Person person = new Person() - конструктор пустой, через рефлексию мы
должны достать данные из аннотации и подсунуть при инициализации объекта name
и age из аннотации. Используйте ломбок.

Покрыть свой код junit 4.12 тестами

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/test/java/homework

7. Работа с файлами

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework7

ДЗ по работе с файлами. Создайте файл, заполните его текстом(много текста), потом считайте его и запишите 
в другой файл. Сделайте 2ой метод такой же  только с buffered. Замерьте время выполнения без buffered и c buffered.

8. ДЗ по java8
8.1. Написать свои функциональные интерфейсы по типу BiFunction и Supplier(Producer).
Создать любой класс с несколькими полями. Создать метод, который будет принимать
функциональные интерфейсы, созданные ранее. Достать 2 поля и обработать полученные значения и вернуть.

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework8/functionalInterfaces

8.2. В classe StreamOperations реализовать предлагаемые стримы

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework8/streamAPI

9.Многопоточность

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/homework9

ДЗ по многопоточности:
У нас есть 1 общий счет(balance), существует несколько банкоматов(ATM) которые работают с этим счетом - типа они
в разных частях города, а счет виртуальный общий. Также существует несколько пользователей. которые будут ходить
в эти банкоматы, пополнять/снимать/возможно еще что-нибудь, например проверять баланс. Соответственно зацикливаем
данный процесс. Добавить фичи, обязательно: в минус не выдавать денег, целочисленный тип тут не подойдет для работы
с деньгами, подумайте какой тип следует использовать, еще у каждого пользователя есть свой баланс(количество денег,
которое у них на руках).
Можно добавить еще одну фичу, но это опционально. Допустим у каждого банкомата есть свой отдельный баланс и если
на нем заканчиваются деньги, то из общего ресурса мы туда добавляем, а если в банкомате слишком много денег, то
обратно отдаем в ресурс. Другими словами добавляем процесс инкассации.

10.Морской бой

https://github.com/VLDRospuskov/epamejc2020/tree/YanaOvsyannikova/src/main/java/homework/seabattle

Написать морской бой, стандартный, поле 10 на 10, количество кораблей и размерность - 
https://ru.wikipedia.org/wiki/%D0%9C%D0%BE%D1%80%D1%81%D0%BA%D0%BE%D0%B9_%D0%B1%D0%BE%D0%B9_(%D0%B8%D0%B3%D1%80%D0%B0) .
 Должен присутствовать отступ между кораблями, если попал то продолжаете стрелять. Написать 2 варианта с возможность
 играть с человек и с компьютером(желательно, придумать алгоритм, а не простой перебор всех клеток подряд, если компьютер
 попал, то должен продолжить уничтожать корабль, а не стрелять в рандом). Если, есть желание то можно сделать 3ех мерный,
 будет +. Вывод игры в консоль, прикручивать какое-то GUI не нужно.