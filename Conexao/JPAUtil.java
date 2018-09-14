/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ton
 */
public class JPAUtil {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD2_Parcial2");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();

    }

}
