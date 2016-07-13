package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String filename = null;

    public void initialize(String Имя)
    {
        this.filename = Имя;
    }
    public void initialize(String Имя, int вес, int возраст)
    {
        this.filename = Имя + вес + возраст;
    }
    public void initialize(String Имя, int возраст)
    {
        this.filename = Имя + возраст;
    }
    public void initialize(int вес, String цвет)
    {
        this.filename = вес + цвет;
    }
    public void initialize(int вес, String  цвет, String адрес)
    {
        this.filename = вес + цвет + адрес;
    }
    //напишите тут ваш код

}
