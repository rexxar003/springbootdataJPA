package programmerzamannow.springdata.jpa;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@SpringBootTest
public class EntityManagerTest {
    
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @org.junit.jupiter.api.Test
    void createTest(){
        Assertions.assertNotNull(entityManagerFactory);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Assertions.assertNotNull(entityManager);
    }
}