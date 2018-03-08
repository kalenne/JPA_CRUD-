package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(null, "Byanquinnha", "Byanquinhamorena@bya.com"); // o id é auto-incrementado;
		Funcionario f2 = new Funcionario(null, "Furado", "Furado@furo.com");
	    Funcionario f3 = new Funcionario(null, "Peixe", "Peixe@peixe.com");
		
		/*System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);*/
	    
	    //Conexao com o Banco de Dados
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	    EntityManager em = emf.createEntityManager();
	    
	    //CURD/CRUD = acronomo para operaçoes no banco de dados;
	    
	    em.getTransaction().begin(); //abrir a sessao
	    
	    em.persist(f1);
	    em.persist(f2);
	    em.persist(f3);
	    
	    em.getTransaction().commit(); //encerra a sessão
	    
	    //BOAS PRATICAS :)
	    em.close();
	    emf.close();
	    
	    

	}

}
