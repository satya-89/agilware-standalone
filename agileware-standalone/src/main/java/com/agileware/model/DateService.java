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
	
	@Autowired
	SubjectDataRepo subjectDataRepo;
	

	public void convertCollectionDates() {
		System.out.println("Convertibng collection dates");

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
		System.out.println("Convertibng collection date done");

	}


	public void convertSubjectDates() {
		System.out.println("Convertibng subject dates");

		List<SubjectData> collectionDatas = (ArrayList<SubjectData>) subjectDataRepo.findAll();
		for (SubjectData cData : collectionDatas) {
			try {
				JSONObject[] objs = cData.getViewData();
				objs = DateUtil.dateEventForSystem(objs);
				cData.setViewData(objs);
				subjectDataRepo.save(cData);
			} catch (Exception e) {
				System.out.println("Not successful " + cData.getId() + " Exception:" + e);
			}

		}
		System.out.println("Convertibng subject date done");

	}
}
