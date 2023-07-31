package com.xuanpin;

import com.xuanpin.dao.BookDao;
import com.xuanpin.domain.Book;
import com.xuanpin.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestOneApplicationTests {

    @Autowired
    BookDao bookDao;
    @Autowired
    BookService bookService;
    @Test
    void contextLoads() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void serviceTest(){
        System.out.println(bookService.getAll());
    }

    @Test
    void serviceDeleteTest(){
        System.out.println(bookService.delete(1935437825));
        System.out.println(bookService.getAll());
    }

    @Test
    void serviceByIdTest(){
        System.out.println(bookService.getById(1));
    }

    @Test
    void serviceUpdateByIdTest(){
        Book book = new Book();
        book.setId(1);
        book.setName("测试更新");
        System.out.println(bookService.update(book));
        System.out.println(bookService.getById(1));
    }

    @Test
    void serviceInsertTest(){
        Book book = new Book();
        book.setType("计算机理论");
        book.setName("测试更新");
        book.setDescription("kskfamiwovesiivv");
        System.out.println(bookService.save(book));
        System.out.println(bookService.getAll());
    }
}
