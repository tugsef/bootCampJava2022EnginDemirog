package kodlama.io.softwareLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.softwareLanguages.entity.SubTechnology;

public interface SubTecnologysRepository extends JpaRepository<SubTechnology, Integer> {

}
