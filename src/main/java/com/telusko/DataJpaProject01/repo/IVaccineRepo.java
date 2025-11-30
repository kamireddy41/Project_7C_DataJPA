package com.telusko.DataJpaProject01.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.DataJpaProject01.entity.Vaccine;



public interface IVaccineRepo extends JpaRepository<Vaccine, Integer>
{
     //findByProperty
	
	public List<Vaccine> findByVaccineCost(Double cost);
	
	public List<Vaccine> findByVaccineName(String vaccineName);
	
	public List<Vaccine> findByVaccineCompany(String vaccineCompany);
	
    //findByPropertyKeywords
    //findByPropertykeywordsProperty
	public List<Vaccine> findByVaccineCostBetween(Double startingCost, Double endingCost);
	


}
