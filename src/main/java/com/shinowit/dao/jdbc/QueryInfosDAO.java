package com.shinowit.dao.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/12/29.
 */
@Repository
public class QueryInfosDAO {
    @Resource
    private JdbcTemplate jt;

    //促销商品查询
    public List<Map<String, Object>> merbySaleStatus() {
        List<Map<String, Object>> result = null;
        String sql = "select top 15 b.*  from TMe_StockInfo a inner join TMe_MerchandiseInfo b on a.MerchandiseID=b.MerchandiseID inner join TMe_ProStatusInfo c on b.ProStatusID=c.ProStatusID \n" +
                "where c.ProStatusName='临时促销' or c.ProStatusName='限时促销'";
        result = jt.queryForList(sql);
        return result;
    }

    //模糊查询商品
    public List<Map<String, Object>> serachMer(String mername) {
        List<Map<String, Object>> result = null;
        String sql = "select  top 8 b.* from TMe_StockInfo a inner join TMe_MerchandiseInfo b on a.MerchandiseID=b.MerchandiseID " +
                "where b.MerchandiseName like ?";
        result = jt.queryForList(sql, new Object[]{"%" + mername + "%"}, new int[]{Types.VARCHAR});
        return result;
    }

    //按销量查询商品
    public List<Map<String, Object>> salesvolume() {
        List<Map<String, Object>> result = null;
        String sql = "select  top 20 d.*  from TMe_OutStockInfo a inner join TMe_OutStockDetailsInfo b on a.OutBillCode=b.OutBillCode inner join TMe_MerchandiseInfo c on  b.MerchandiseID=c.MerchandiseID inner join TMe_StockInfo d on c.MerchandiseID=d.MerchandiseID\n" +
                "ORDER BY b.Num desc";
        result = jt.queryForList(sql);
        return result;
    }
}
