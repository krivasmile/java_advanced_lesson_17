package ua.kyiv.springJPA.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.kyiv.springJPA.dao.UniversityRepository;
import ua.kyiv.springJPA.domain.University;
import ua.kyiv.springJPA.service.UniversityDataService;

@Service
public class UniversityDataServiceImpl implements UniversityDataService {
	
	@Autowired
	private UniversityRepository universityCrudRepository;

	@Override
	public University create(University university) {
		return universityCrudRepository.saveAndFlush(university);
	}

	@Override
	public University readById(Long id) {
		return universityCrudRepository.getOne(id);
	}

	@Override
	public University update(University university) {
		return universityCrudRepository.save(university);
	}

	@Override
	public void deleteById(Long id) {
		universityCrudRepository.deleteById(id);		
	}

	@Override
	public List<University> readAll() {
		return universityCrudRepository.findAll();
	}

	@Override
	public Optional<University> findByAccreditationLevel(int level) {
		return universityCrudRepository.findByAccreditationLevel(level);
	}

	@Override
	public Optional<University> findByInstitutesCount(int count) {
		return universityCrudRepository.findByInstitutesCount(count);
	}

	@Override
	public List<University> findByStudentsCountGreaterThan(int count) {
		return universityCrudRepository.findByStudentsCountGreaterThan(count);
	}

	@Override
	public Optional<University> findByName(String name) {
		return universityCrudRepository.findByName(name);
	}
	
	

}
