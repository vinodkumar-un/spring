package com.rw.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.rw.dto.JourneyDto;

public class JourneyPdfView extends AbstractPdfView {
	@Override
	protected void buildPdfDocument(Map<String, Object> model,
			Document pdfDocument, PdfWriter pdfWriter, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		List<JourneyDto> journeys = null;

		journeys = (List<JourneyDto>) model.get("journeys");
		Table table = new Table(3);
		for (int i = 0; i < journeys.size(); i++) {
			JourneyDto dto = journeys.get(i);
			
			table.addCell(dto.getSource());
			table.addCell(dto.getDestination());
			table.addCell(String.valueOf(dto.getBusNo()));
		}
		
		pdfDocument.add(table);
	}

}









