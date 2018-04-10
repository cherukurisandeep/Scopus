package com.sb.scopus.controller;

import com.sb.scopus.dao.AuthorDao;
import com.sb.scopus.model.Author;
import com.sb.scopus.model.Award;
import com.sb.scopus.service.AuthorService;
import com.sb.scopus.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @Autowired
    AwardService awardService;

    @RequestMapping(value = "/authorProfile", method = RequestMethod.GET)
    public ModelAndView authorProfile(HttpServletRequest servletRequest) {
        int authorId = Integer.parseInt(servletRequest.getParameter("id"));
        Author author = authorService.getAuthor(authorId);
        List<Award> awards= awardService.getAllAwards();
        ModelAndView model = new ModelAndView();
        model.addObject("author",author);
        model.addObject("awards",awards);
        model.setViewName("authorProfile");
        return model;
    }

    @RequestMapping(value = "/saveAuthorAward", method = RequestMethod.POST)
    public ModelAndView saveAuthorAward(HttpServletRequest request){
        int authorId = Integer.parseInt(request.getParameter("authorId"));
        int awardId= Integer.parseInt(request.getParameter("awardId"));
        Award awardObj = awardService.getAward(awardId);
//        Set<Award> award = new HashSet<>();
//        awards.add(awardObj);
        Author author = authorService.getAuthor(authorId);
        author.getAwards().add(awardObj);
        authorService.addAuthor(author);
        return new ModelAndView("redirect:/authorList");
    }

    @RequestMapping(value = "/deleteAuthor", method = RequestMethod.GET)
    public ModelAndView deleteAuthor(HttpServletRequest request){
        int authorId = Integer.parseInt(request.getParameter("id"));
        authorService.deleteAuthor(authorId);
        return new ModelAndView("redirect:/authorList");
    }

    @RequestMapping(value = "/deleteAuthorAward", method = RequestMethod.GET)
    public ModelAndView deleteAuthorAward(HttpServletRequest request){
        int authorId = Integer.parseInt(request.getParameter("authorId"));
        int awardId = Integer.parseInt(request.getParameter("awardId"));
        authorService.deleteAuthorAward(authorId,awardId);
        return new ModelAndView("redirect:/authorProfile?id="+authorId);
    }
}
