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
public class TesterDelete {

   
    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        EntityTransaction tx = em.getTransaction();

        Livro l = new  Livro();

         l.setId(2l); // Delete by ID
 
        
        

        tx.begin(); //Inicia transação
        em.remove(em.merge(l)); // remove o objeto após traze-lo no contexto gerenciado
      
        tx.commit(); //commit da transação
        em.close();  // fecha o entity manager (conexao)

    }

}
