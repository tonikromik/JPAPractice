import entity.Application;
import entity.Client;
import entity.Department;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xxx");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

//        manager.persist(new Client("Roman", "Antonov", "highth", "KC467792", "Lviv", 28));

        List<Client> clients = new ArrayList<Client>();
        clients.add(new Client("Roman", "Antonov", "highth", "KC467792", "Lviv", 28));
        clients.add(new Client("Olga", "Bilyk", "highth", "-", "Lviv", 37));
        clients.add(new Client("Dara", "Ruda", "primary", "-", "Lviv", 10));

        Department department = new Department("Lviv", 25);
        department.setClients(clients);
        manager.persist(department);




        manager.getTransaction().commit();
        manager.close();
        factory.close();

    }
}
