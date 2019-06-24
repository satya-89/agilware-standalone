package com.agileware.model;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateService {
	@Autowired
	CollectionDataRepo collectionDataRepo;

	public void convertCollectionDates() {
		System.out.println("Convertibng dates");

		List<CollectionData> collectionDatas = (ArrayList<CollectionData>) collectionDataRepo.findAll();
		for (CollectionData cData : collectionDatas) {
			try {
				JSONObject[] objs = cData.getViewData();
				objs = DateUtil.dateEventForSystem(objs);
				cData.setViewData(objs);
				collectionDataRepo.save(cData);
			} catch (Exception e) {
				System.out.println("Not successful " + cData.getId() + " Exception:" + e);
			}

		}
		System.out.println("Convertibng date done");

	}

}
