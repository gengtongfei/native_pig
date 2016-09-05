package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping(value = "/queryByTypes")
public class QueryByTypeController {

    @RequestMapping(value = "/merchanse")
    public String query() {

        return "index";
    }
}
