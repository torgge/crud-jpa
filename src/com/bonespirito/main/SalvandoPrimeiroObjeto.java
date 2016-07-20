package com.bonespirito.main;

import com.bonespirito.modelo.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by George on 19/07/2016.
 */
public class SalvandoPrimeiroObjeto {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexao-oracle");
        EntityManager em = emf.createEntityManager();
        Cliente cliente = new Cliente();

        cliente.setNome("João Luiz");
        cliente.setIdade(34);
        cliente.setProfissao("Empresário");
        cliente.setSexo("M");

        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();

        em.close();
    }
}
