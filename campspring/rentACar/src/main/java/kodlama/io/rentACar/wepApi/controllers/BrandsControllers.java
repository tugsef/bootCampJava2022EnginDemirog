package kodlama.io.rentACar.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBransResponse;

@RestController   // annotation -->Bilgilendirme --Erişim Noktası -- isteğin yapıldığı yer--Spring devreye girdi restFull yapılar için controller olduğunu söylememiz gerekli
@RequestMapping("/api/brands")



public class BrandsControllers {

	private BrandService brandService;

	 //Git parametrelerine bak git uygulamayı tara kim bunu implement ediyor onun bana new
	//halini bana ver
	@Autowired
	public BrandsControllers(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll")
	 public List<GetAllBransResponse> getAll(){
		 
		
		
		 return brandService.getAll();
		 
	 }
	
	@PostMapping("/add")
	public void add(@RequestBody CreateBrandRequest createBrandRequest){
		this.brandService.add(createBrandRequest);
	}
	 
}
