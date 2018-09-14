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


public class TesterUpdate {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin(); //Inicia transação
        
        Livro l = em.find(Livro.class,3l);
        l.setAutor("Robson Costa");
        
        tx.commit(); //commit da transação
        em.close();  // fecha o entity manager (conexao)

    }

}
