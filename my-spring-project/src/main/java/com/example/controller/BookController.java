package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.model.Book;
import com.example.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    public void listBooks(Model model) {

    }

    public void showAddBookForm(Model model) {

    }

    public void addBook(@ModelAttribute("book") Book book) {

    }
}