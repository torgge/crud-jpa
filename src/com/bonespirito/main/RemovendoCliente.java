package com.bonespirito.main;

import com.bonespirito.modelo.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by George on 27/07/2016.
 */
public class RemovendoCliente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexao-oracle");
        EntityManager em = emf.createEntityManager();
        Cliente c = new Cliente();

        c = em.find(Cliente.class,3L);

        if (c != null) {
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().rollback(); //em.getTransaction().commit();
            System.out.printf("Cliente: %s removido.%n", c.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }

        em.close();
    }
}
