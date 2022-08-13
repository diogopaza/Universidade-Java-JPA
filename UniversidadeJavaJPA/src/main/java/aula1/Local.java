package aula1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Local {
	@Id	
	@GeneratedValue
	private Long id;
	private String predio;
	private String sala;
	private int capacidade;
	
	
}
