package ru.popkov.example.charapterOne;


import lombok.Data;

@Data // аннотация которая сгенерирует геттеры и сеттеры, equials and hashCode для нашего поля (@lombok аннотация - для использования необходимо подклчить мавен библиотеку)
// если мы не указали конструктор явно, то конструктор без аргументов создаться автоматичсеки
public class LogicProgramming {
    private int num;

    public int geSum(int x) {
        while (x>1) {
           return x + geSum(x-1);
        }
        return x;
    }
}
