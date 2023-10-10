package com.dx.facade.report.util.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.dx.util.excel.BigDecimalFormatPolicy;
import com.dx.util.excel.BigDecimalOutConvert;
import com.dx.util.excel.CustomCellWriteHandler;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Slf4j
public class EasyExcelUtils {

    public final static Long MAX_EXPORT = 100000L;
    public final static Long START_EXPORT = 1L;

    /**
     * 写入到部署服务器所在目录
     * @param path excel文件存储目录
     * @param excelName excel文件名
     * @param sheetName sheet名称
     * @param data excel数据
     * @param clazz  数据对象
     * @param includeList  需要写入到excel的对象属性集合
     */
    public static <T> void export2File(String path, String excelName, String sheetName,List<T> data,Class<T> clazz,List<String> includeList) {
        String fileName = path.concat(excelName).concat(ExcelTypeEnum.XLSX.getValue());
        EasyExcel.write(fileName, clazz)
                .includeColumnFiledNames(includeList)
                .registerConverter(new BigDecimalOutConvert())
                .registerWriteHandler(new CustomCellWriteHandler())
                .sheet(sheetName)
                .doWrite(data);
    }

    public static <T> void export2File(String path, String excelName, String sheetName,List<T> data,Class<T> clazz) {
        String fileName = path.concat(excelName).concat(ExcelTypeEnum.XLSX.getValue());
        EasyExcel.write(fileName, clazz)
                .registerConverter(new BigDecimalOutConvert())
                .registerWriteHandler(new CustomCellWriteHandler())
                .sheet(sheetName)
                .doWrite(data);
    }

    /**
     * 写入到部署服务器所在目录
     * @param response 输出
     * @param excelName excel文件名
     * @param sheetName sheet名称
     * @param data excel数据
     * @param clazz  数据对象
     */
    public static <T> void export2Web(HttpServletResponse response, String excelName, String sheetName,List<T> data,Class<T> clazz) throws Exception {
        String fileName =  URLEncoder.encode(excelName, StandardCharsets.UTF_8).replaceAll("\\+", "%20");
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName +".xls");
        response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
        EasyExcel.write(response.getOutputStream(), clazz)
                .registerConverter(new BigDecimalOutConvert())
                .registerWriteHandler(new CustomCellWriteHandler())
                .sheet(sheetName)
                .doWrite(data);

    }

    /**
     * bigdecimal不做限制(原本多少位就导出多少位)
     * @param response 输出
     * @param excelName excel文件名
     * @param sheetName sheet名称
     * @param data excel数据
     * @param clazz  数据对象
     */
    public static <T> void exportFull2Web(HttpServletResponse response, String excelName, String sheetName,List<T> data,Class<T> clazz) throws Exception {
        String fileName =  URLEncoder.encode(excelName, StandardCharsets.UTF_8).replaceAll("\\+", "%20");
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName +".xls");
        response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
        EasyExcel.write(response.getOutputStream(), clazz)
                .registerConverter(new BigDecimalOutConvert(BigDecimalFormatPolicy.ROUND_FULL_OUT))
                .registerWriteHandler(new CustomCellWriteHandler())
                .sheet(sheetName)
                .doWrite(data);

    }

    /**
     * 写入到部署服务器所在目录
     * @param response 输出
     * @param excelName excel文件名
     * @param sheetName sheet名称
     * @param data excel数据
     * @param clazz  数据对象
     */
    public static <T> void exportXlsx2Web(HttpServletResponse response, String excelName, String sheetName,List<T> data,Class<T> clazz) throws Exception {
        String fileName =  URLEncoder.encode(excelName, StandardCharsets.UTF_8).replaceAll("\\+", "%20");
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName +".xlsx");
        response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
        EasyExcel.write(response.getOutputStream(), clazz)
                .registerConverter(new BigDecimalOutConvert())
                .registerWriteHandler(new CustomCellWriteHandler())
                .sheet(sheetName)
                .doWrite(data);

    }

    public static void responseSet(HttpServletResponse response,String excelName) throws UnsupportedEncodingException {

        response.setContentType("application/octet-stream;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        excelName = URLEncoder.encode(excelName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + excelName +".xls");
        response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
    }
}
