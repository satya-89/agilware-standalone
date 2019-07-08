package com.agileware.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.json.simple.JSONObject;

public class DateUtil {

	public static String ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	public static final DateFormat format = new SimpleDateFormat(ISO_FORMAT);
	private static final SimpleDateFormat isoFormatter = new SimpleDateFormat(ISO_FORMAT);

	public static JSONObject[] dateEventForSystem(JSONObject[] viewData) {

		for (JSONObject obj : viewData) {
			ArrayList fd = (ArrayList) obj.get("formData");
			for(Object formData:fd) {
				if(formData instanceof ArrayList) {
					
					for(Object formData1:(ArrayList)formData) {

						String dataType = ((LinkedHashMap)formData1) .get("type").toString();

						if (dataType.equalsIgnoreCase("date")) {
							try {
							Long milisecond = anyDateToUtc(
									((LinkedHashMap)formData1).get("value").toString());
							((LinkedHashMap)formData1).put("value", milisecond);
							}catch(Exception e) {
								((LinkedHashMap)formData) .put("value", "");
							}
						}
					}
				}else {

					String dataType = ((LinkedHashMap)formData) .get("type").toString();

					if (dataType.equalsIgnoreCase("date")) {
						try {
						Long milisecond = anyDateToUtc(
								((LinkedHashMap)formData) .get("value").toString());
						
								((LinkedHashMap)formData) .put("value", milisecond);
						}catch(Exception e) {
							((LinkedHashMap)formData) .put("value", "");
						}
					}
				}
			}
			
				
//			ArrayList listFormData = (ArrayList) ((ArrayList) obj.get("formData")).get(0);
			
	 		

		}
		return viewData;
	}

	public static long anyDateToUtc(String dt) throws Exception{
		try {
			try {
				Long l1 = Long.parseLong(dt);
				Date d1 = new Date(l1);
				d1.setHours(0);
				d1.setMinutes(0);
				d1.setSeconds(0);
				return d1.getTime();
				
			}catch(Exception e) {
				
			}
			Date dateString = format.parse(dt);
			dateString.setHours(0);
			dateString.setMinutes(0);
			dateString.setSeconds(0);
			return dateString.getTime();
		} catch (Exception e) {
			throw e;
		}

	}
 
}
