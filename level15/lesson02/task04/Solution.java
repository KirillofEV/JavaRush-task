package com.javarush.test.level15.lesson02.task04;

/* ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain]. Параметр конструктора - имя книги.
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook расширьте тип возвращаемого результата.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.
*/

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public static class MarkTwainBook extends Book{

        public String avtor;

        public MarkTwainBook(String avtor) {
            super("Mark Twain");
            this.avtor = avtor;
        }



        public MarkTwainBook getBook(){
            return (MarkTwainBook) this;

        }
        public String getName(){return this.avtor;}
    }
    public static class AgathaChristieBook extends  Book{
        public String avtor;

        public AgathaChristieBook(String avtor) {
            super("Agatha Christie");
            this.avtor = avtor;
        }



        public AgathaChristieBook getBook(){
            return (AgathaChristieBook) this;

        }
        public String getName(){return this.avtor;}
    }


    public abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
            String markTwainOutput = getBook().getName() + " book was written by " + author;

            String output = "output";
            if (this instanceof AgathaChristieBook) output = agathaChristieOutput;
            else if (this instanceof MarkTwainBook) output = markTwainOutput;

            //Add your code here

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
