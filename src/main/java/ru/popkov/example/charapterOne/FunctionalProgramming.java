package ru.popkov.example.charapterOne;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgramming {
    //как говорилось в статье функциональное программирование - это работы с данными осуществляется по средствам выполнения различный функцийю
    //Допустим у нас есть набор каких-то данных(за пример возьмем коллекцию, если не знаете что это не переживайте, познакомимся позже)
    private List<Integer> myTestList;

    // добавим геттеры и сеттеры для взаимодействия с нашим объектом
    public FunctionalProgramming(List<Integer> myTestList) {
        this.myTestList = myTestList;
    }

    public List<Integer> getMyTestList() {
        return myTestList;
    }

    public void setMyTestList(List<Integer> myTestList) {
        this.myTestList = myTestList;
    }
}
