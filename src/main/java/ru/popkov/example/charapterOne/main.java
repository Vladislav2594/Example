package ru.popkov.example.charapterOne;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.List;

public class main {
    public static void main(String[] args) {
        //main точка входа в программу
        // создание экземляров(объектов) класса и демонстрация наследования и переопрежеления методов

        // создаем объект суппер класса и передаем значения полей
        Vehicle vehicle = new Vehicle("testModel", "testCollor");
        // вместо получения поля по 1-му, мы можем воспользоваться методом интерфейса showInfo();
        vehicle.showInfo();

        // как видите наш класс Car не имеет полей model and collor,
        // но так как объект наследуется от Vehicle мы можем установить значения этих полей
        Car car = new Car();
        car.setModel("carModel");
        car.setColor("carColor");
        //и использовать метод интерфейса который реализуется в супер класса(для вывода дополнительного поля "колеса" мы переопределяем метод в классе Car
        car.showInfo();
        //если же мы вызовем переопределенный метод showInfo у Car и передодим туда строку, то мы увидем вывод ее в консоль как и указали в перегруженном методе.
        car.showInfo("тест перегрузки метода");



        // пример функционального программирования в java
        FunctionalProgramming functionalProgramming =
                new FunctionalProgramming(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //выше мы создали объект класса FunctionalProgramming и добавли ему коллекцию занчений
        // далее продемустрием использованием Stream API который является примером функционального программирования в java

        functionalProgramming.getMyTestList()
                .stream() //stream запускаает поток для работы с данными
                .distinct()// дальме мы вызываем функцию которая уберет дубликаты из нашего набора данных
                .map(num -> num*2)// умножаем каждый эллемент на два
                .forEach(System.out::println); // и выводим в консоль
        // вот пример функционального программирования. Мы не использывали ни классы, ни объекты. Только набор данных и функции которые мы применяем к нему.

        //Далее покажем пример структурного программирования в java и таким примером являютс циклы!

        //Integer myTestInteger переменная типа Integer в цикле For
        int count = 0; // подсчитаем сумму всех чисел в коллекции functionalProgramming.getMyTestList()
        for (Integer myTestInteger : functionalProgramming.getMyTestList()) {
            count += myTestInteger;
        }
        System.out.println("summ all number = " + count);

        // примером логического программирования в java служит рекурсия
        // рекурсия - процесс когда метод вызывает сам себя, пока не будет достигнуто какое-то условие
        // Пример: мы хотим сделать метод который принимает число и возвращает сумму всех чисел которые ему предществуют + само число.
        LogicProgramming logicProgramming = new LogicProgramming();
        // пример рекурсивного метода
        System.out.println("Результат рекурсивного вызова метода = " + logicProgramming.geSum(5));
    }
}
