package ua.kyiv.springJPA.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.kyiv.springJPA.domain.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {
	Optional<University> findByAccreditationLevel(int level);

	Optional<University> findByInstitutesCount(int count);

	List<University> findByStudentsCountGreaterThan(int count);

	Optional<University> findByName(String name);
}
