package com.telusko.DataJpaProject01.service;

import java.util.List;

import com.telusko.DataJpaProject01.entity.Vaccine;

public interface IVaccineService 
{
	public List<Vaccine> fetchByVaccineCost(Double cost);
	
	public List<Vaccine> fetchByVaccineName(String vaccineName);
	
	public List<Vaccine> fetchByVaccineCompany(String vaccineCompany);
	
	public List<Vaccine> fetchByVaccineCostBetween(Double startingCost, Double endingCost);

	 
}