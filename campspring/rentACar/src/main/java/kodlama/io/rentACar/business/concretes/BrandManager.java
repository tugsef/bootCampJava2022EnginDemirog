package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBransResponse;
import kodlama.io.rentACar.dataAcsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // Bu sınıf bie business nesnesidir..

public class BrandManager implements BrandService {
	
	
	private BrandRepository brandRepository ; // injekson
	

	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}




	@Override
	public List<GetAllBransResponse> getAll() {
	  // iş kuralları
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBransResponse> brandResponse = new ArrayList<>();
		for (Brand brand : brands) {
			GetAllBransResponse responseItem = new GetAllBransResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandResponse.add(responseItem);
			//getAllBransResponse.add(new GetAllBransResponse(brand.getId(), brand.getName()));
		}
		return brandResponse;
	}




	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand);
		
	}

	
	
	
}
