package com.agileware.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

import org.json.simple.JSONObject;

public class DateUtil {

	public static String ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	public static final DateFormat format = new SimpleDateFormat(ISO_FORMAT);
	private static final SimpleDateFormat isoFormatter = new SimpleDateFormat(ISO_FORMAT);

	public static JSONObject[] dateEventForSystem(JSONObject[] viewData) {

		for (JSONObject obj : viewData) {

			String dataType = ((LinkedHashMap) ((ArrayList) obj.get("formData")).get(0)).get("type").toString();

			if (dataType.equalsIgnoreCase("date")) {
				Long milisecond = anyDateToUtc(
						((LinkedHashMap) ((ArrayList) obj.get("formData")).get(0)).get("value").toString());
				((LinkedHashMap) ((ArrayList) obj.get("formData")).get(0)).put("value", milisecond);
			}
		}
		return viewData;
	}

	public static long anyDateToUtc(String dt) {
		try {
			try {
				Long l1 = Long.parseLong(dt);
				return l1;
				
			}catch(Exception e) {
				
			}
			Date dateString = format.parse(dt);
			dateString.setHours(0);
			dateString.setMinutes(0);
			dateString.setSeconds(0);
			return dateString.getTime();
		} catch (Exception e) {
			return 0;
		}

	}
 
}
