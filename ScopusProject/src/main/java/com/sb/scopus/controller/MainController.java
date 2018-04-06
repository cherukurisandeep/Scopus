package com.sb.scopus.controller;

import com.sb.scopus.model.Author;
import com.sb.scopus.model.Book;
import com.sb.scopus.model.Publisher;
import com.sb.scopus.service.AuthorService;
import com.sb.scopus.service.BookService;
import com.sb.scopus.service.PublisherService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private PublisherService publisherService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private BookService bookService;
     @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String index(Model model){
        return "Home";
    }

    /*@RequestMapping(value = "/addPublisher", method = RequestMethod.POST)
    public ModelAndView addPublisher(@ModelAttribute Publisher publisher) {
        System.out.println("Home123");
        System.out.println(publisher.getPublisherName());
        publisherService.addPublisher(publisher);
        List<Publisher> listPublisher = publisherService.getAllPublishers();
        System.out.println(listPublisher.size()+"---------------------_>");
        ModelAndView model = new ModelAndView("publisherList");
        model.addObject("listPublisher",listPublisher);
        return model;
    }*/

    @RequestMapping(value="/addAuthor", method = RequestMethod.GET)
    public ModelAndView addAuthor(Model model){
        model.addAttribute("author",new Author());
        return new ModelAndView("addAuthor");

    }

    @RequestMapping(value="/saveAuthor", method = RequestMethod.POST)
    public ModelAndView saveAuthor(@ModelAttribute Author author){
        authorService.addAuthor(author);
        return new ModelAndView("redirect:/authorList");
    }

    @RequestMapping(value = "/authorList", method = RequestMethod.GET)
    public ModelAndView authorList(ModelAndView model){
        List<Author> listAuthor = authorService.getAllAuthor();
        model.setViewName("authorList");
        model.addObject("listAuthor",listAuthor);
        return model;
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public ModelAndView addBook(ModelAndView model){
        List<Author> authors = authorService.getAllAuthor();
        List<Publisher> publishers = publisherService.getAllPublishers();
        model.addObject("publishers",publishers);
        model.addObject("authors",authors);
        model.addObject("book",new Book());
        model.setViewName("addBook");
        return model;
    }

    @RequestMapping(value = "/saveBook", method = RequestMethod.POST)
    public ModelAndView saveBook(@ModelAttribute Book book){
        bookService.addBook(book);
        return new ModelAndView("Home");
    }

    @RequestMapping(value = "/bookList", method = RequestMethod.GET)
    public ModelAndView bookList(ModelAndView model){
        List<Book> listBook = bookService.getAllBooks();
        model.setViewName("bookList");
        model.addObject("listBook",listBook);
        return model;
    }

}
