package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/1/14.
 */
@Controller
@RequestMapping(value = "/getpwd")
public class GetPwdController {

   /* @Resource
    private TbaMemberinfoMapper mempper;
    @Resource
    private HtmlMail htmlMail;
    @RequestMapping(value = "/end1")
    public String updatepwd(){

        return "/GetPwd1";
    }
    @RequestMapping(value = "/valid")
    public void test(@RequestParam("oldEmail") String email,HttpServletResponse response){
        List<TbaMemberinfo> memberList=null;
        String regex="^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
        Pattern p = Pattern.compile(regex);
        Matcher m=p.matcher(email);
        boolean result=m.find();
        if(result==false){
            try {
                response.getWriter().println("邮箱格式输入不正确!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            TbaMemberinfoExample fi=new TbaMemberinfoExample();
            TbaMemberinfoExample.Criteria se=fi.createCriteria();
            se.andEmailEqualTo(email);
            memberList=mempper.selectByExample(fi);
            if(memberList.size()==0){
                try {
                    response.getWriter().print("此邮箱未被注册过!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @RequestMapping(value = "/end2")
    public String updatepwd2(String oldEmail,Model model ) {
        if ((null == oldEmail) || (oldEmail.trim().length() < 1)) {
            model.addAttribute("no_msg","邮箱不能为空");
            return "/GetPwd1";
        }
        String str = "";
        String pwd = "";
        str += (int) (Math.random() * 9 + 1);
        for (int i = 0; i < 5; i++) {
            str += (int) (Math.random() * 10);
        }
        pwd = str.toString();
        System.out.print(pwd);
        try {
            htmlMail.sendMessage(oldEmail, "请您牢记您的新密码", pwd);
            TbaMemberinfo mer = new TbaMemberinfo();
            mer.setEmail(oldEmail);
            mer.setPwd(pwd);
            int i = mempper.updateByEmail(mer);
            if (i > 0) {
                model.addAttribute("email_msg", "新密码请到邮箱查看!");
            }
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/GetPwd2";
    }*/
}
