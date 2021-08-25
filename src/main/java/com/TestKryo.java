package com;
import com.kryotest.Author;
import com.kryotest.Book;
import com.esotericsoftware.kryo.kryo5.Kryo;

public class TestKryo {
    public static void main(String[] args) {
        Kryo kryo = new Kryo();
        kryo.register(Author.class);
        kryo.register(Book.class);

        Book book = new Book("Voina i mir", new Author("Lev Tolstoi"));

        Book bookClone = kryo.copy(book);

        System.out.println(bookClone);
    }
}
