package kodlama.io.languageProgramming.business.abstracts;

import java.util.List;

import kodlama.io.languageProgramming.business.requests.CreateTecnologyRequest;
import kodlama.io.languageProgramming.business.requests.DeleteTecnologyRequest;
import kodlama.io.languageProgramming.business.requests.UpdateTecnologyRequest;
import kodlama.io.languageProgramming.business.responses.GetAllTechnologyResponse;

public interface TechnologyService {
List<GetAllTechnologyResponse> getAll();
void add(CreateTecnologyRequest createTecnologyRequest);
void delete(DeleteTecnologyRequest deleteTecnologyRequest);
void update(UpdateTecnologyRequest updateTecnologyRequest, int technology);
}
