package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBransResponse;


public interface BrandService {
	
	List<GetAllBransResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
	
}
