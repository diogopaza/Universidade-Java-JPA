package exercicio_1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Livro {
	@Id
	@GeneratedValue
	private int id;
	
	//@Column(length=200, nullable=true)
	private String titulo;
	private String autor;
	private String isbn;
	

}
