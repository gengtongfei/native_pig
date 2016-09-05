package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value = "/inner")
public class QueryInnerController {
   /* @Resource
    private TmeStockinfoMapper tmeStockinfo;
    @Resource
    private TmeMerchandisecinfoMapper tmeMapper;
    @Resource
    private TmeMerchandiseinfoMapper MerchandiseinfoMapper;
    @Resource
    private QueryInfosDAO query_dao;

    @RequestMapping(value = "/query")
    public String StockInfo(Model model,@RequestParam(value = "merchanid",required = false)String merchanid) {
//        TmeStockinfoExample cri = new TmeStockinfoExample();
//        TmeStockinfoExample.Criteria tj = cri.createCriteria();
//        tj.andIdIsNotNull();
//        List<TmeStockinfo> stockinfoList=tmeStockinfo.selectByExample(cri);

         //商品分类的查询
        TmeMerchandisecinfoExample ex=new TmeMerchandisecinfoExample();
        TmeMerchandisecinfoExample.Criteria cr =ex.createCriteria();
        cr.andIdIsNotNull();
        List<TmeMerchandisecinfo> mercclist=tmeMapper.selectByExample(ex);
        model.addAttribute("merclist",mercclist);

        //查询搞活动的商品
        List<Map<String,Object>> merinfos=query_dao.merbySaleStatus();
        model.addAttribute("mercnames",merinfos);

        //单个商品信息查询
        if(null!=merchanid){
            List<TmeMerchandiseinfo> mercslist=null;
            List<TmeStockinfo> stocklist=null;
            TmeStockinfoExample qi=new TmeStockinfoExample();
            TmeStockinfoExample.Criteria see=qi.createCriteria();
            see.andMerchandiseidEqualTo(merchanid);
//            TmeMerchandiseinfoExample fi=new TmeMerchandiseinfoExample();
//            TmeMerchandiseinfoExample.Criteria se=fi.createCriteria();
//            se.andMerchandiseidEqualTo(merchanid);
//             mercslist=MerchandiseinfoMapper.selectByExample(fi);
            stocklist=tmeStockinfo.selectByExample(qi);
            for(TmeStockinfo ss:stocklist){
                model.addAttribute("mercinfo",ss);
            }
//            for(TmeMerchandiseinfo ss:mercslist){
//                model.addAttribute("mercinfo",ss);
//            }
        }
        return "inner-page";

    }*/
}
