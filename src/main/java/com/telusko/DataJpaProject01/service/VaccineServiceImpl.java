package com.telusko.DataJpaProject01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.DataJpaProject01.entity.Vaccine;
import com.telusko.DataJpaProject01.repo.IVaccineRepo;

@Service
public class VaccineServiceImpl implements IVaccineService 
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<Vaccine> fetchByVaccineCost(Double cost) {
		
		return repo.findByVaccineCost(cost);
		
	}

	@Override
	public List<Vaccine> fetchByVaccineName(String vaccineName) {
	
		return repo.findByVaccineName(vaccineName);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompany(String vaccineCompany) {
		
		return repo.findByVaccineCompany(vaccineCompany);
	}

	@Override
	public List<Vaccine> fetchByVaccineCostBetween(Double startingCost, Double endingCost) {
		return repo.findByVaccineCostBetween(startingCost, endingCost);
		
	}

}
