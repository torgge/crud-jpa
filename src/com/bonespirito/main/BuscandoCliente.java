package com.bonespirito.main;

import com.bonespirito.modelo.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by George on 27/07/2016.
 */
public class BuscandoCliente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexao-oracle");
        EntityManager em = emf.createEntityManager();

        Cliente c = em.find(Cliente.class,2L);

        if (c != null) {
            System.out.println(c.getCodigo());
            System.out.println(c.getIdade());
            System.out.println(c.getNome());
            System.out.println(c.getProfissao());
            System.out.println(c.getSexo());
        } else {
            System.out.println("Cliente não encontrado.");
        }

        em.close();
    }
}
