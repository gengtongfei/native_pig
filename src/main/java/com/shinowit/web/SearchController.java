package com.shinowit.web;

import com.github.pagehelper.PageHelper;
import com.shinowit.dao.mapper.AddressMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value = "/fuzzy")
public class SearchController {
    @Resource
    private AddressMapper addressMapper;


    @RequestMapping(value = "/query")
    public String query(Model model, HttpServletRequest request) {

        PageHelper.startPage(1, 2);
        return "/index";
    }
}
