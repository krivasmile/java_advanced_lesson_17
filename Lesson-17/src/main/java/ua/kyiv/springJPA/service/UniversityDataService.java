package ua.kyiv.springJPA.service;

import java.util.List;
import java.util.Optional;

import ua.kyiv.springJPA.domain.University;

public interface UniversityDataService {
	University create(University university);

	University readById(Long id);

	University update(University university);

	void deleteById(Long id);

	List<University> readAll();

	Optional<University> findByAccreditationLevel(int level);

	Optional<University> findByInstitutesCount(int count);

	List<University> findByStudentsCountGreaterThan(int count);

	Optional<University> findByName(String name);
}
