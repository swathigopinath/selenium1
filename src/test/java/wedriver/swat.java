package wedriver;//original write


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

public class swat {

FileInputStream FRead;

FileOutputStream FWrite;

XSSFWorkbook wb;

XSSFSheet sh;

@Test

public void f() throws Exception{

FRead=new FileInputStream("C:\\testing\\leea.xlsx");

wb=new XSSFWorkbook(FRead);

sh=wb.getSheetAt(0);

Row row=sh.createRow(1);

Cell cell=row.createCell(1);

cell.setCellValue("leea");

FWrite=new FileOutputStream("C:\\testing\\leea.xlsx");

wb.write(FWrite);

}

}