package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/1/6.
 */

@Controller
@RequestMapping("/district")
public class DistrictController {

    /*@Resource
    private CityMapper cityMapper;
    @Resource
    private DistrictMapper districtMapper;
    @RequestMapping(value = "/city")
    @ResponseBody
    public List<City> query01 (@RequestParam("provinceID") String provinceId ){
        List<City> cityList=null;
        CityExample fi=new CityExample();
        CityExample.Criteria se=fi.createCriteria();
        se.andProvinceidEqualTo(provinceId);
        cityList=cityMapper.selectByExample(fi);
        return cityList;
    }

    @RequestMapping(value = "/area")
    @ResponseBody
    public List<District> query02(@RequestParam("cityID") String cityId){
        List<District> districtList=null;
        DistrictExample fi=new DistrictExample();
        DistrictExample.Criteria se=fi.createCriteria();
        se.andCityidEqualTo(cityId);
        districtList=districtMapper.selectByExample(fi);
        return  districtList;
    }*/
}
