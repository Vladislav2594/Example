package ru.popkov.example.charapterOne;

// класс Car пример наследования. В нем не указаны явно поля model и color, однако создав объект мы можем присвоить и использовать эти поля у Car.
public class Car extends Vehicle {
    //добавим уникальное поле которые относится только к машинам и сделаем это поле final чтоб никто его не смог изменить.
    // Ведт у всех наших машин по 4 колеса.
    private final Integer wheel = 4;
    //Мы можем использовть метод интерфейса ShowInfo несмотря на то что сам класс кар явно не реализует этот интерфейс,
    // но нам нужно переопределить метод в Car для корретного отображения информации о машине и добавить вывод нашего уникального поля
    // пример Полиморфизма
    @Override
    public void showInfo() {
        System.out.println(this.getClass().getSimpleName() + " collor = " + this.getColor()+ " " + this.getClass().getSimpleName() + " model = " + this.getModel()
        + " Number of wheels = " + wheel);
    }

    //так же согласно свойству полиморфизма мы можем не только переопределять(изменять реализацию), но и перегружать методы.
    public void showInfo(String test) {
        System.out.println("Show test method = " + test);
    }
}
