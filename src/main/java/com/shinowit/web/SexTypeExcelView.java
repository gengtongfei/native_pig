package com.shinowit.web;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by gengtongfei on 2016/8/23.
 */
public class SexTypeExcelView extends AbstractExcelView {
    @Override
    protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook hssfWorkbook, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

    }

    /*private final Logger LOGGER = Logger.getLogger(getClass());
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

    @Override
    @SuppressWarnings({"unchecked"})
    protected void buildExcelDocument(
            Map<String, Object> model,        // MVC中的M就在这里了
            HSSFWorkbook workbook,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        List<Student> recordList = (List<Student>) model.get("sex_type_list");

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("待输出的记录条数: " + recordList.size());
        }

        HSSFSheet sheet = workbook.createSheet("sheet1");

        setColumnsWidth(sheet);
        fillTableHeader(workbook, sheet);
        fillTableBody(workbook, sheet, recordList);
        String filename = "测试.xls";//设置下载时客户端Excel的名称
        filename = encodeFilename(filename, request);//处理中文文件名
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-disposition", "attachment;filename=" + filename);
        OutputStream ouputStream = response.getOutputStream();
        workbook.write(ouputStream);
        ouputStream.flush();
        ouputStream.close();

    }

    private void setColumnsWidth(HSSFSheet sheet) {
        final int[] warr = new int[]{
                500,  // <空>
                4500, // 性别分类编码
                4500 // 性别分类名称
        };
        for (int i = 0; i < warr.length; i++) {
            sheet.setColumnWidth(i, warr[i]);
        }
    }

    // 填充表格头
    private void fillTableHeader(HSSFWorkbook workbook, HSSFSheet sheet) {
        final String[] contents = new String[]{
                "编码",
                "分类"
        };

        int r = 1;
        int c = 1;

        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());        // 填充黄色
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);            // 填充方式

        // 设置border
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setBorderBottom(CellStyle.BORDER_THIN);

        for (int i = 0; i < contents.length; i++) {
            Cell cell = getCell(sheet, r, c + i);
            cell.setCellValue(contents[i]);
            cell.setCellStyle(style);
        }
    }

    private void fillTableBody(HSSFWorkbook workbook, HSSFSheet sheet, List<Student> records) {
        // 通用style
        CellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.WHITE.getIndex());        // 填充白色
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);                    // 填充方式
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setBorderBottom(CellStyle.BORDER_THIN);

        // 日期style
        CellStyle dateStyle = workbook.createCellStyle();
        dateStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());        // 填充白色
        dateStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);                    // 填充方式
        dateStyle.setBorderLeft(CellStyle.BORDER_THIN);
        dateStyle.setBorderRight(CellStyle.BORDER_THIN);
        dateStyle.setBorderTop(CellStyle.BORDER_THIN);
        dateStyle.setBorderBottom(CellStyle.BORDER_THIN);
        dateStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));

        int r = 2;
        int c = 1;
        Cell cell = null;

        for (int i = 0; i < records.size(); i++) {
            Student rr = records.get(i);

            // 编码
            cell = getCell(sheet, r, c + 0);
            if (rr.getId() != null)
                cell.setCellValue(rr.getId());
            cell.setCellStyle(dateStyle);

            // 分类名称
            cell = getCell(sheet, r, c + 1);
            if (rr.getName() != null)
                cell.setCellValue(rr.getName());
            cell.setCellStyle(style);

            r++;
        }
    }

    *//**
     * 设置下载文件中文件的名称
     *
     * @param filename
     * @param request
     * @return
     *//*
    public static String encodeFilename(String filename, HttpServletRequest request) {
        *//**
     * 获取客户端浏览器和操作系统信息
     * 在IE浏览器中得到的是：User-Agent=Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; Maxthon; Alexa Toolbar)
     * 在Firefox中得到的是：User-Agent=Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.7.10) Gecko/20050717 Firefox/1.0.6
     *//*
        String agent = request.getHeader("USER-AGENT");
        try {
            if ((agent != null) && (-1 != agent.indexOf("MSIE"))) {
                String newFileName = URLEncoder.encode(filename, "UTF-8");
                newFileName = StringUtils.replace(newFileName, "+", "%20");
                if (newFileName.length() > 150) {
                    newFileName = new String(filename.getBytes("GB2312"), "ISO8859-1");
                    newFileName = StringUtils.replace(newFileName, " ", "%20");
                }
                return newFileName;
            }
            if ((agent != null) && (-1 != agent.indexOf("Mozilla")))
                return MimeUtility.encodeText(filename, "UTF-8", "B");

            return filename;
        } catch (Exception ex) {
            return filename;
        }
    }
*/
}