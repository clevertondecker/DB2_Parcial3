/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conexao.JPAUtil;
import Model.Livro;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author ton
 */
public class TesterInsert {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        EntityTransaction tx = em.getTransaction();

      
        Livro l = new Livro();
         
        l.setAutor(" George R. R. Martin");
        l.setAvaliacao(5);
        l.setEditora("HarperCollins");
        l.setPreco(55.40);
        l.setTitulo("A Fúria dos Reis");
  

        tx.begin(); //Inicia transação        
        em.persist(l);
        tx.commit(); //commit da transação
        em.close();  // fecha o entity manager (conexao)

    }

}
