package kodlama.io.languageProgramming.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.languageProgramming.entities.concretes.Technology;
@Repository
public interface TechnologyRepository  extends JpaRepository<Technology, Integer>{

 
}
