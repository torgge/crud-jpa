package com.bonespirito.main;

import com.bonespirito.modelo.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by George on 27/07/2016.
 */
public class ConsultaCliente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexao-oracle");
        EntityManager em = emf.createEntityManager();
        List<Cliente> clientes = em.createQuery("from Cliente where sexo = 'M'",Cliente.class).getResultList();
        clientes.forEach(cliente -> System.out.println(cliente.getNome()));

        em.close();
    }
}
