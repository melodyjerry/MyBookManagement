package com.liuwen.repository;

import com.liuwen.entity.Book;

import java.util.List;

public interface BookRepository {
    public List<Book> findAll(int index,int limit);
    public int count();

}
