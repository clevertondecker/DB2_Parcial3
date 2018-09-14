/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conexao.JPAUtil;
import Model.Livro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author ton
 */
public class TesterConsult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        EntityManager em = JPAUtil.getEntityManager();

        EntityTransaction tx = em.getTransaction();
        
        
        String jpaql = "select a from Livro a  where " + "a.autor = :ximbinha";
        Query query = em.createQuery(jpaql, Livro.class);
       
        // Setando o parametro nomeModelo com um valor
        query.setParameter("ximbinha", "Ferrari");
        
        
        
        
        Query q = em.createQuery("select a from Livro a", Livro.class);
        
        
        List<Livro> autos = q.getResultList();
        for (Livro a : autos) {
            System.out.print(a.getAutor());
        }
        
/*
        tx.begin(); //Inicia transação

        //em.persist(auto);
        tx.commit(); //commit da transação
        em.close();  // fecha o entity manager (conexao)
*/
    }

}