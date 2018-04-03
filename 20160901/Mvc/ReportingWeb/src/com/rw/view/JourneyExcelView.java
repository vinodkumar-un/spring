package com.rw.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.rw.dto.JourneyDto;

public class JourneyExcelView extends AbstractExcelView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workBook, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		List<JourneyDto> journeys = null;
		HSSFSheet sheet = null;

		journeys = (List<JourneyDto>) model.get("journeys");
		sheet = workBook.createSheet("journeys");

		for (int i = 0; i < journeys.size(); i++) {
			JourneyDto journey = journeys.get(i);
			HSSFRow row = sheet.createRow(i);
			
			HSSFCell sourceCell = row.createCell(1);
			sourceCell.setCellValue(journey.getSource());
			
			HSSFCell destCell = row.createCell(2);
			destCell.setCellValue(journey.getDestination());
			
			HSSFCell busNoCell = row.createCell(3);
			busNoCell.setCellValue(journey.getBusNo());
		}

	}

}









