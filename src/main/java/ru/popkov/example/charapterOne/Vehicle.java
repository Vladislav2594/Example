package ru.popkov.example.charapterOne;

public class Vehicle implements ShowInfo {
    // это наш super класс который имеет общие поля для всех транспортных средств
    // то что эти поля приватные является примером инкапсуляции
    private String model;
    private String color;

    //это конструктор класса, который отвечает за то какие параметры будут обязательными для передачи в момент создания объекта
    //Но в промыщленном коде мы стараемся избегать бойлер плейд кода(повторяющегося) и может заменить явное создание констрруктора
    //аннотациями над классом @AllArgsConstructor(создает конструктор со всеми полями класса) и @NoArgsConstructor (пустой конструктор)
    public Vehicle(String model, String color) {
        this.model = model;
        this.color = color;
    }
    //пустой конструктор для создания объекта без параметров(оставлен тут только в качестве примера)
    public Vehicle() {
    }
    // геттеры и сеттеры (пример Инкапсуляции) позволяет нам получать значения полей объекта или изменять/устанавливать их
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // пример полиморфизма
    // @Override показывает что мы переопределяем метод интерфейса в классе который его наследует
    @Override
    public void showInfo() {
        System.out.println(this.getClass().getSimpleName() + " collor = " + this.getColor()+ " " + this.getClass().getSimpleName() + " model = " + this.getModel());
    }
}
