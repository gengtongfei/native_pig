package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */

@Controller
@RequestMapping(value = "/reg")
public class RegController {

   /* @Resource
    private TbaMemberinfoMapper mempper;
    @Resource
    private HtmlMail htmlMail;
    @RequestMapping(value = "/insert2")
    public String reg2(@ModelAttribute("member") TbaMemberinfo memberinfo,BindingResult bindingResult,@RequestParam("ValidateCode") String checkvalue,Model model,HttpServletRequest request){
        if(bindingResult.hasErrors()){
            return "/reg";
        }
        String regex="^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
        Pattern p = Pattern.compile(regex);
        Matcher m=p.matcher(memberinfo.getEmail());
        boolean result=m.find();
        if(result==false){
            model.addAttribute("error_msg","请输入正确的邮箱");
            return "/reg";
        }
        if((memberinfo.getLname()==null)||(memberinfo.getLname().trim().length()<1)){
            model.addAttribute("error_msg","昵称不能为空!");
            return "/reg";
        }
        if((memberinfo.getPwd()==null)||(memberinfo.getPwd().trim().length()<1)){
            model.addAttribute("error_msg","密码不能为空!");
            return "/reg";
        }
        String realchecknum = (String)request.getSession().getAttribute("rand");
        if(!checkvalue.equals(realchecknum)){
            model.addAttribute("error_msg","验证码输入有误!");
            return "/reg";
        }

        TbaMemberinfoExample cr=new TbaMemberinfoExample();
        TbaMemberinfoExample.Criteria se=cr.createCriteria();
        se.andUsernameEqualTo(memberinfo.getLname());
        List<TbaMemberinfo> memberinfoList1=mempper.selectByExample(cr);
        if(memberinfoList1.size()>0){
            model.addAttribute("error_msg","此昵称已存在");
        }
        String uuid= UUID.randomUUID().toString();
        memberinfo.setUsername(uuid);
        String sessioncode=request.getSession().getId();
        memberinfo.setRemark(sessioncode);
        int i=0;
        try {
             i= mempper.insert(memberinfo);
            String smtpserver = "<请将此地址复制到地址栏里面进行最后的确认>http://10.2.25.40:8080/reg/valid/"+sessioncode+"";
            htmlMail.sendMessage(memberinfo.getEmail(),"用户注册",smtpserver);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(i>0){
            model.addAttribute("error_msg","请到邮箱激活!");
            return "/reg";
        }
        return "/reg";
    }
    @RequestMapping(value = "/insert")
    public String reg(@ModelAttribute("member") TbaMemberinfo memberinfo,BindingResult bindingResult){
        return "/reg";
    }
    @RequestMapping(value = "/valid/{validString}")//用rest的风格激活判断并附加状态
    public String validemail(@ModelAttribute("member") TbaMemberinfo memberinfo,@PathVariable("validString") String validsessioncode,Model model){
        TbaMemberinfoExample hd=new TbaMemberinfoExample();
        TbaMemberinfoExample.Criteria mj=hd.createCriteria();
        mj.andRemarkEqualTo(validsessioncode);
        List<TbaMemberinfo> memlist=mempper.selectByExample(hd);
        String username=null;
        for(TbaMemberinfo mem:memlist){
            username=mem.getUsername();
        }
        if(memlist.size()>0){
            int a=mempper.updateByUserName(username);
            if(a>0){
                return "/login";
            }else {
                model.addAttribute("error_msg","注册失败,请重新填写!");
                return "/reg";
            }
        }

        return "/reg";
    }
    //判断邮箱是否已存在
//    @RequestMapping(value = "/ajaxemail")
//    public String ajaxemail(@RequestParam("email") String emaildata,Model model){
//
//        TbaMemberinfoExample cr=new TbaMemberinfoExample();
//        TbaMemberinfoExample.Criteria se=cr.createCriteria();
//        se.andEmailEqualTo(emaildata);
//        List<TbaMemberinfo> memberinfoList=mempper.selectByExample(cr);
//        if(memberinfoList.size()>0){
//            model.addAttribute("error_msg","邮箱已存在,请重新输入");
//        }
//
//        return "/reg";
//    }

    @RequestMapping(value = "/ajaxemail1")
    public void ajaxemail1(@RequestParam("email") String emaildata,HttpServletResponse response,Model model){
        if((emaildata==null)||(emaildata.trim().length()<1)){
            try {
                response.getWriter().println("邮箱不能为空");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            TbaMemberinfoExample cr=new TbaMemberinfoExample();
            TbaMemberinfoExample.Criteria se=cr.createCriteria();
            se.andEmailEqualTo(emaildata);
            List<TbaMemberinfo> memberinfoList=mempper.selectByExample(cr);
            if(memberinfoList.size()>0){
                try {
                    response.getWriter().println("邮箱已注册过");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    response.getWriter().println("邮箱可以使用");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


//    @RequestMapping("/valicode")//验证码jquery
//    public String validate(@RequestParam("ValidateCode") String checkvalue,Model model,HttpServletRequest request){
//        String realchecknum = (String)request.getSession().getAttribute("rand");
//        if(!checkvalue.equals(realchecknum)){
//            model.addAttribute("error_msg","验证码输入有误!");
//        }
//        return "/reg";
//    }

*/
}
