package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/25.
 */
@Controller
@RequestMapping(value = "/query")
public class CommonBaseController {

   /* @Resource
    private VehicleMapper vehicleMapper;

    @RequestMapping("test")
    public String query(Model model){
        VehicleExample ve=new VehicleExample();
        VehicleExample.Criteria criteria=ve.createCriteria();
        criteria.andTypeEqualTo("car");
        List<Vehicle> vehicleList=vehicleMapper.selectByExample(ve);
        model.addAttribute("vehicleList",vehicleList);
        return "test";
    }*/

/*
    @Resource
    private TmeStockinfoMapper StockinfoMapper;
    @Resource
    private TmeMerchandisecinfoMapper tmeMapper;
    @Resource
    private TmeMerchandiseinfoMapper MerchandiseinfoMapper;
    @Resource
    private QueryInfosDAO query_dao;
    @RequestMapping(value = "/InfosPlay")
    public String StockInfo(Model model,@RequestParam(value = "merchanid",required = false)String merchanid,@RequestParam(value = "pageid",required = false) Integer pageid,HttpServletRequest request) {
//        TmeStockinfoExample cri = new TmeStockinfoExample();
//        TmeStockinfoExample.Criteria tj = cri.createCriteria();
//        tj.andIdIsNotNull();
//        List<TmeStockinfo> stockinfoList=tmeStockinfo.selectByExample(cri);
        String merchandise= request.getParameter("merchaName");
        if(null!=merchanid){
            List<TmeMerchandiseinfo> mercslist=null;
            TmeMerchandiseinfoExample fi=new TmeMerchandiseinfoExample();
            TmeMerchandiseinfoExample.Criteria se=fi.createCriteria();
            se.andMerchandisecidEqualTo(merchanid);
            mercslist=MerchandiseinfoMapper.selectByExample(fi);
            model.addAttribute("mercinfolist",mercslist);
        }else if(null!=merchandise){
            List<Map<String,Object>> merchaninfo=null;
            merchaninfo=query_dao.serachMer(merchandise);
            model.addAttribute("merchaninfo",merchaninfo);
        }else {
            if(pageid==null){
                pageid=1;
            }
            List<TmeStockinfo> stockinfoList = null;
            int countpage=0;
            TmeStockinfoExample te=new TmeStockinfoExample();
            te.setPageIndex(pageid);
            te.setPageSize(2);
            TmeStockinfoExample te1=new TmeStockinfoExample();
            te1.createCriteria().andIdIsNotNull();

            try{
                stockinfoList=StockinfoMapper.selectPage(te);
                int record_count=StockinfoMapper.countByExample(te1);
                countpage=record_count/2;
                if(record_count%2>0){
                    countpage=countpage+1;
                }
//                stockinfoList = tmeStockinfo.listAll();
            }catch (Exception e){
                e.printStackTrace();
            }
            model.addAttribute("countnum",countpage);
            model.addAttribute("pageid",pageid);
            model.addAttribute("stocklist", stockinfoList);
        }
        TmeMerchandisecinfoExample ex=new TmeMerchandisecinfoExample();
        TmeMerchandisecinfoExample.Criteria cr =ex.createCriteria();
        cr.andIdIsNotNull();
        List<TmeMerchandisecinfo> mercclist=tmeMapper.selectByExample(ex);
        model.addAttribute("merclist",mercclist);
        List<Map<String,Object>> merinfos=query_dao.merbySaleStatus();
        model.addAttribute("mercnames",merinfos);
        return "index";
    }*/

}
