package com.xuanpin.controller;

import com.xuanpin.domain.Book;
import com.xuanpin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ReturnFrontendInformation save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new ReturnFrontendInformation(flag ? WebServiceStatusCode.SAVE_OK:WebServiceStatusCode.SAVE_ERR,flag);
    }

    @PutMapping
    public ReturnFrontendInformation update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new ReturnFrontendInformation(flag ? WebServiceStatusCode.UPDATE_OK:WebServiceStatusCode.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public ReturnFrontendInformation delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new ReturnFrontendInformation(flag ? WebServiceStatusCode.DELETE_OK:WebServiceStatusCode.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public ReturnFrontendInformation getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? WebServiceStatusCode.GET_OK:WebServiceStatusCode.GET_ERR;
        String msg = book != null ? "":"数据查询失败，请重试";
        return new ReturnFrontendInformation(code,book,msg);
    }


    @GetMapping
    public ReturnFrontendInformation getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code = bookList != null ? WebServiceStatusCode.GET_OK:WebServiceStatusCode.GET_ERR;
        String msg = bookList != null ? "":"数据查询失败，请重试";
        return new ReturnFrontendInformation(code,bookList,msg);
    }
}
