package exercicio_1;

import javax.persistence.EntityManager;

public class LivroTeste {
	public static void main(String[] args) {
		LivroDAO dao = new LivroDAO();
		EntityManager conecta = dao.conectaBanco();
		//cria livros
		/*Livro livro = new Livro();
		livro.setAutor("Diogo");
		livro.setIsbn("2255664477");
		livro.setTitulo("Senior T.I");
		
		Livro livro2 = new Livro();
		livro2.setAutor("Roberto");
		livro2.setIsbn("002525");
		livro2.setTitulo("Programacao WEB");		
		
		dao.salvaLivro(livro);
		dao.salvaLivro(livro2);
		Livro l = dao.consultarId(6);	*/			
		dao.excluirLivro(6);
		
	}
}
