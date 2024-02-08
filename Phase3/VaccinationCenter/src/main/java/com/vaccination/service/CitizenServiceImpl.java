package com.vaccination.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;
import com.vaccination.entity.Citizen;
import com.vaccination.entity.VaccineCenter;
import com.vaccination.repository.CitizenRepository; 
@Service
public class CitizenServiceImpl implements CitizenService 
	{ 
	@Autowired
	private CitizenRepository citizenRepository; 
	
	public void addCitizen(Citizen citizen)
	{ 
		citizenRepository.save(citizen);
	}
	
	public void updateCitizen(Citizen citizen) 
	{ 
		citizenRepository.save(citizen);
	}
	
	public void deleteCitizen(Long id)
	{ 
		citizenRepository.deleteById(id);
	}
	
	public Citizen getCitizenById(Long id) 
	{
		return citizenRepository.findById(id).orElseThrow(() -> new NotFoundException("Citizen not found"));
	}
	
	public List<Citizen>getAllCitizens() 
	{ 
		return citizenRepository.findAll();
	}
	
	public List<Citizen>getCitizensByVaccinationCenter(VaccineCenter vaccineCenter) 
	{
		return citizenRepository.findByVaccinationCenter(vaccineCenter);
	}
	public class NotFoundException extends RuntimeException 
	{ 
		public NotFoundException(String message) {
			super(message);
		}
	}
}
