package com.sb.scopus.controller;

import com.sb.scopus.dao.AuthorDao;
import com.sb.scopus.model.Author;
import com.sb.scopus.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @RequestMapping(value = "/authorProfile", method = RequestMethod.GET)
    public ModelAndView authorProfile(HttpServletRequest servletRequest) {
        int authorId = Integer.parseInt(servletRequest.getParameter("id"));
        Author author = authorService.getAuthor(authorId);
        ModelAndView model = new ModelAndView();
        model.addObject("author",author);
        model.setViewName("authorProfile");
        return model;
    }
}
