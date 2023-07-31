package com.xuanpin.service;

import com.xuanpin.domain.Book;

import java.util.List;

public interface BookService{

    List<Book> getAll();
    Book getById(Integer id);
    boolean delete(Integer id);

    boolean update(Book book);
    boolean save(Book book);
}

