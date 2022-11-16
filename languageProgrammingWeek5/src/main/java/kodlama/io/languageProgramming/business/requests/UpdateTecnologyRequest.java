package kodlama.io.languageProgramming.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTecnologyRequest {

private int  tecnologyId;
private String tecnologyName;

}
