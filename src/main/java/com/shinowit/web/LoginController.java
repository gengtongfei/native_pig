package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping(value = "/validation")
public class LoginController {

    @RequestMapping(value = "/login")
    public String validlogin(Model model) {

        return "login";
    }
   /* @Resource
    private TbaMemberinfoMapper mer_dao;


    @RequestMapping(value = "/login2")
    public String validlogin2(@ModelAttribute("member")TbaMemberinfo memberinfo,BindingResult bindingResult,Model model,HttpServletRequest request){
        if(bindingResult.hasErrors()){
            return "/login";
        }
        String regex="^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
        Pattern p = Pattern.compile(regex);
        Matcher m=p.matcher(memberinfo.getEmail());
        boolean result=m.find();
        if(false==result){
            model.addAttribute("message","请您输入正确的邮箱");
            return "/login";
        }
        if((memberinfo.getPwd()==null)||memberinfo.getPwd().trim().length()<1){
            model.addAttribute("message","登录密码不能为空!");
            return "/login";
        }
        TbaMemberinfoExample fi=new TbaMemberinfoExample();
        TbaMemberinfoExample.Criteria se=fi.createCriteria();
        se.andEmailEqualTo(memberinfo.getEmail());
        List<TbaMemberinfo> merlist=mer_dao.selectByExample(fi);
        String pass=null;
        for(TbaMemberinfo mem:merlist){
            pass=mem.getPwd();
            if(!pass.equals(memberinfo.getPwd())){
                model.addAttribute("message","密码不正确!");
            }else{
                request.getSession(true).setAttribute("current_user",mem);
                request.getSession(true).setAttribute("login_ok",true);
                return "forward:/query/InfosPlay";
            }
        }

        return "/login";

    }
    //用于注销账号退出的页面跳转
    @RequestMapping(value = "/layout")
    public String layout(){

        return "layout";
    }*/
}
