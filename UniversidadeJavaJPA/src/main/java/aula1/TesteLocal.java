package aula1;

public class TesteLocal {
	public static void main(String[] args) {
		Local l = new Local();
		LocalDAO dao = new LocalDAO();
		
		l.setPredio("Nova Ala");
		l.setCapacidade(200);
		l.setSala("20");
		
		dao.salvar(l);
		
		
	}

}
