package com.kaisen.book.controller;

import com.kaisen.book.model.Author;
import com.kaisen.book.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddAuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("addAuthors")
    public String authors(@ModelAttribute ("addAuthor") Author author){
        return "addAuthors";
    }


    @PostMapping("addAuthors")
    public String addauthors(@ModelAttribute ("addAuthor") Author author){
        //System.out.println(author.getName());

        authorService.save(author);
        return "redirect:addAuthors";
    }


}
