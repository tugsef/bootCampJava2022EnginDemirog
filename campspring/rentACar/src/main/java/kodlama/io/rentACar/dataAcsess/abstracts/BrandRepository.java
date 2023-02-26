package kodlama.io.rentACar.dataAcsess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

// JpaRepository <Brand , integer> integer ifadesi tabloda Primary id denk gelir...

public interface BrandRepository extends JpaRepository<Brand, Integer>{
  
//	List<Brand> getAll();   // getAll çağıran birisi markaları listeler.
	// sildik çünkü  JpaRepository bize findAll() ,Id ye göre getirme gibi özellikler sağlıyor
	//tabloya karşılık gelen nesne oluşturmaktı amacımıx mech etmek
	
	// Neden Brand concerents neden yok Jpa güzellik jenerik bir yapıda çalışıyor ve bizim
	// için ilgili nesne için bellekte sanki onu implement etmiş gibi  bir class üretiyor.
	// onuda belleğe koyar. Jpa bizim için bellekte hazırlamış oluyor.
}
