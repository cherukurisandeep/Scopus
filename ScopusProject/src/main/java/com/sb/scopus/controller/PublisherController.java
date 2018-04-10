package com.sb.scopus.controller;

import com.sb.scopus.model.Publisher;
import com.sb.scopus.service.PublisherService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PublisherController {
    @Autowired
    PublisherService publisherService;

    @RequestMapping(value = "/addPublisher", method = RequestMethod.GET)
    public ModelAndView addPublisher(ModelAndView model){
        model.addObject("publisher",new Publisher());
        model.setViewName("addPublisher");
        return model;
    }

    @RequestMapping(value = "/savePublisher", method = RequestMethod.POST)
    public ModelAndView savePublisher(@ModelAttribute Publisher publisher){
        publisherService.addPublisher(publisher);
        ModelAndView model = new ModelAndView("redirect:/publisherList");
        return model;
    }

    @RequestMapping(value = "/publisherList",method = RequestMethod.GET)
    public ModelAndView publisherList(ModelAndView model){
        List<Publisher> listPublisher = publisherService.getAllPublishers();
        model.setViewName("publisherList");
        model.addObject("listPublisher",listPublisher);
        return model;
    }

    @RequestMapping(value = "/deletePublisher", method = RequestMethod.GET)
    public ModelAndView deletePublisher(HttpServletRequest request){
        int publisherId = Integer.parseInt(request.getParameter("id"));
        publisherService.deletePublisher(publisherId);
        return new ModelAndView("redirect:/publisherList");
    }
}
