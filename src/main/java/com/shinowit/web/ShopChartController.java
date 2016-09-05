package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value = "/shop")
public class ShopChartController {

    /*    @ModelAttribute("student11")
        public List<Student> newStudent(){
            List<Student> studentList=new ArrayList<Student>();
            Student result=new Student();
            result.setName("tongfei");
            result.setId(1);
            studentList.add(result);
            result.setId(2);
            result.setName("fengqiang");
            studentList.add(result);
            return studentList;
        }
        @RequestMapping("/test")
        public View testRequestHeader(Model model){
            //redirectAttributes.addAttribute()
            List<Student> studentList=new ArrayList<Student>();
            Student result=new Student();
            result.setName("tongfei");
            result.setId(1);
            studentList.add(result);
            result.setId(2);
            result.setName("fengqiang");
            studentList.add(result);
            model.addAttribute("sex_type_list",studentList);
            SexTypeExcelView view=new SexTypeExcelView();
            return view;
        }*/
    @RequestMapping("/agent")
    @ResponseBody
    public String testRequestHeader(@RequestHeader(value = "User-Agent", required = false) String userAgent) {
        //redirectAttributes.addAttribute()

        return userAgent;
    }

    /*@Resource
    private ChartcarMapper chartMapper;
    @Resource
    private ProvinceMapper provinceMapper;
    @Resource
    private TbaMembeaddrinfoMapper membeaddrinfoMapper;
    //商品加入购物车
    @RequestMapping(value = "/chart")
    public void chart(HttpServletRequest request, HttpServletResponse response) {
        TbaMemberinfo memberinfo = null;
        BigDecimal price = null;
        BigDecimal totalMoney = null;
        int num = 0;
        int i = 0;
        String picUrl = request.getParameter("picture");
        num = Integer.parseInt(request.getParameter("num"));
        price = new BigDecimal(request.getParameter("price"));
        String merchanname = request.getParameter("merchanname");
        totalMoney = new BigDecimal((price.doubleValue() * num));
        memberinfo = (TbaMemberinfo) request.getSession(true).getAttribute("current_user");
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String nowtime = dateFormat.format(now);
        Chartcar chartcar = new Chartcar();
        chartcar.setUsername(memberinfo.getUsername());
        chartcar.setCommodityName(merchanname);
        chartcar.setCommodityUrl(picUrl);
        chartcar.setNum(num);

        chartcar.setAddTime(nowtime);
        chartcar.setUnitPrice(price);
        chartcar.setCountPrice(totalMoney);
        String uuid = UUID.randomUUID().toString();
        chartcar.setId(uuid);
        try {
            i = chartMapper.insert(chartcar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i > 0) {
            try {
                response.getWriter().println("加入购物车成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                response.getWriter().println("加入购物车失败!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //查看自己购物车的商品
    @RequestMapping(value = "/chartcarinfo")
    public String queryinfo(HttpServletRequest request, Model model) {
        TbaMemberinfo memberinfo = null;
        List<Chartcar> chartcarList = new ArrayList<Chartcar>();
        int countnum = 0;
       BigDecimal totalMoney2 = null;
        BigDecimal totalMoney3=new BigDecimal(0.00);
        memberinfo = (TbaMemberinfo) request.getSession(true).getAttribute("current_user");
        ChartcarExample fi = new ChartcarExample();
        ChartcarExample.Criteria se = fi.createCriteria();
        se.andUsernameEqualTo(memberinfo.getUsername());
        chartcarList = chartMapper.selectByExample(fi);

        model.addAttribute("shopinfo", chartcarList);
        for (Chartcar shop : chartcarList) {
            countnum += shop.getNum();
            totalMoney2= shop.getCountPrice();
           totalMoney3=totalMoney3.add(totalMoney2);

        }
        model.addAttribute("shopnum",countnum);
        model.addAttribute("totalmoney3",totalMoney3);
        return "/chart";
    }

    //删除购物车里面的单挑商品记录
    @RequestMapping(value = "/deleteshop")
    public String deleteshop(@RequestParam(value = "shopid", required = false) String shopid, Model model) {
        int a = 0;
        try {
            a = chartMapper.deleteByPrimaryKey(shopid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (a > 0) {
            model.addAttribute("infomation", "删除成功!");
        } else {
            model.addAttribute("infomation", "删除失败!");
        }
        return "forward:/shop/chartcarinfo";
    }

    //清空购物车的所有商品
    @RequestMapping(value = "/dump")
    public String dempshop(@RequestParam(value = "userid", required = false) String userid, Model model) {
        int a = 0;
        ChartcarExample fi = new ChartcarExample();
        ChartcarExample.Criteria se = fi.createCriteria();
        se.andUsernameEqualTo(userid);
        try {
            a = chartMapper.deleteByExample(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (a > 0) {
            model.addAttribute("infomation", "购物车清除成功!");
        } else {
            model.addAttribute("infomation", "购物车清除失败!");
        }
        return "forward:/shop/chartcarinfo";
    }
    //根据当前用户统计购物车物品信息

    //    @RequestMapping(value = "count")
//    public String shopinfos(){
//
//    }
    @RequestMapping(value = "/01chart")
    public String chart1(@ModelAttribute("eaddrinfo") TbaMembeaddrinfo membeaddrinfo1,HttpServletRequest request,Model model) {
        TbaMemberinfo memberinfo2=null;
        List<TbaMembeaddrinfo> membeaddrinfo=null;
        memberinfo2=(TbaMemberinfo)request.getSession(true).getAttribute("current_user");
        TbaMembeaddrinfoExample fi=new TbaMembeaddrinfoExample();
        TbaMembeaddrinfoExample.Criteria se=fi.createCriteria();
        se.andUsernameEqualTo(memberinfo2.getUsername());
        membeaddrinfo=membeaddrinfoMapper.selectByExample(fi);
        model.addAttribute("memberaddlist",membeaddrinfo);
//        for(TbaMembeaddrinfo memaddr:membeaddrinfo){
//            model.addAttribute("memaddrinfo",memaddr);
//        }

        List<Province> provinceList=null;
        ProvinceExample one=new ProvinceExample();
        ProvinceExample.Criteria two=one.createCriteria();
        se.andIdIsNotNull();
        provinceList=provinceMapper.selectByExample(one);
        model.addAttribute("provinceList",provinceList);
        return "/chart01";
    }
    //删除会员收货地址
    @RequestMapping(value = "/delememaddr")
    public void deleteaddr(HttpServletRequest request,HttpServletResponse response,@RequestParam("id") String id){
        int i=0;
        i=membeaddrinfoMapper.deleteByPrimaryKey(id);
        if (i > 0) {
            try {
                response.getWriter().println("删除成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                response.getWriter().println("删除失败!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //修改会员收货地址
    @RequestMapping(value = "/updateaddr")
    public String update(@ModelAttribute("eaddrinfo") TbaMembeaddrinfo membeaddrinfo1,Model model,HttpServletRequest request){
        TbaMemberinfo memberinfo3=null;
        memberinfo3=(TbaMemberinfo)request.getSession(true).getAttribute("current_user");
        membeaddrinfo1.setUsername(memberinfo3.getUsername());
        int i=membeaddrinfoMapper.updateByPrimaryKey(membeaddrinfo1);
        if(i>0){
        }else {
            model.addAttribute("messageinfo","修改地址失败!");
        }
        return "forward:/shop/01chart";
    }
    //新增会员收货地址
    @RequestMapping(value = "/insertaddr")
    public String insert(@ModelAttribute("eaddrinfo") TbaMembeaddrinfo membeaddrinfo,Model model){
        String uuid=UUID.randomUUID().toString();
        membeaddrinfo.setId(uuid);
        int i=membeaddrinfoMapper.insert(membeaddrinfo);
        if(i>0){
            model.addAttribute("memaddrinfo",membeaddrinfo);
        }
        return "forward:/shop/02chart";
    }

    @RequestMapping(value = "/02chart")
    public String chart2() {
//        TbaMemberinfo memberinfo2=null;
//        List<TbaMembeaddrinfo> membeaddrinfo=null;


//        memberinfo2=(TbaMemberinfo)request.getSession(true).getAttribute("current_user");
//        TbaMembeaddrinfoExample fi=new TbaMembeaddrinfoExample();
//        TbaMembeaddrinfoExample.Criteria se=fi.createCriteria();
//        se.andUsernameEqualTo(memberinfo2.getUsername());
//        membeaddrinfo=membeaddrinfoMapper.selectByExample(fi);
//        for(TbaMembeaddrinfo memaddr:membeaddrinfo){
//            model.addAttribute("memaddrinfo",memaddr);
//        }
    return "chart02";
    }

    @RequestMapping(value = "/03chart")
    public String chart3() {

        return "/chart03";
    }

    @RequestMapping(value = "/04chart")
    public String chart4() {

        return "/chart04";
    }
//将选中的地址添加到session当中
    @RequestMapping(value = "/addrsession")
    public void addrsession(HttpServletRequest request,@RequestParam("meraddid") String meraddid,HttpServletResponse response){
        TbaMembeaddrinfo membeaddrinfo1=null;
        membeaddrinfo1=membeaddrinfoMapper.selectByPrimaryKey(meraddid);
        if(membeaddrinfo1!=null){
            request.getSession().setAttribute("memaddrinfo",membeaddrinfo1);
            try {
                response.getWriter().println("添加成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                response.getWriter().println("添加失败");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
}
