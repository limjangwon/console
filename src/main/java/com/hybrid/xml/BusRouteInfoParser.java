package com.hybrid.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class BusRouteInfoParser {
	
	static Log log = LogFactory.getLog(BusRouteInfoParser.class);
	DocumentBuilderFactory dFactory;
	DocumentBuilder builder;
	
	TransformerFactory tFactory;
	XPathFactory xFactory;
	
	public BusRouteInfoParser() throws ParserConfigurationException {
		dFactory = DocumentBuilderFactory.newInstance();
		builder = dFactory.newDocumentBuilder();
		
		xFactory = XPathFactory.newInstance();
		
		tFactory = TransformerFactory.newInstance();
	}
	
	public static void main(String[] args) {
		try {
			BusRouteInfoParser parser = new BusRouteInfoParser();
			String xml = parser.getBusRouteList("6628");
			log.info(xml);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("Program end...");
	}
	
	public String getBusRouteList(String strSrch) {
		log.info("getBusRouteList = " +strSrch);
		String url = "";
		
	try {
		DocumentBuilder document = (DocumentBuilder) builder.parse(url);
		
		Transformer transformer = tFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "true");
		
	} catch (Exception e) {
		
	}	
		
		
		return null;
	}
}