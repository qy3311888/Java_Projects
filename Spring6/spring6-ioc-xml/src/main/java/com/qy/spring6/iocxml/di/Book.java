package com.qy.spring6.iocxml.di;

public class Book {
    private String bookName;

    private String author;

    public Book() {
        System.out.println("无参构造");
    }

    // 有参构造
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        System.out.println("有参构造");
    }

    // 生成set方法
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // set方法注入
        Book book = new Book();
        book.setAuthor("lifeQ");
        book.setBookName("life");

        // 构造器注入
        Book book1 = new Book("java", "javaQ");
    }
}
