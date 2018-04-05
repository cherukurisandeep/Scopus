package com.sb.scopus.controller;

import com.sb.scopus.dao.AwardDao;
import com.sb.scopus.model.Award;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class AwardController {

    @Autowired
    AwardDao awardDao;

    @RequestMapping(value = "/addAward", method = RequestMethod.GET)
    public ModelAndView addAwards(ModelAndView model){
            model.addObject("award",new Award());
            model.setViewName("addAward");
        return model;
    }

    @RequestMapping(value = "/saveAward", method = RequestMethod.POST)
    public ModelAndView saveAward(@ModelAttribute Award award){
    ModelAndView model = new ModelAndView();
    awardDao.addAward(award);
    model.setViewName("Home");
        return  model;
    }
    @RequestMapping(value = "/awardList",method = RequestMethod.GET)
    public ModelAndView awardList(ModelAndView model){
        List<Award> listAward = awardDao.getAllAwards();
        model.addObject("listAward", listAward);
        model.setViewName("awardList");
        return model;
    }

}
