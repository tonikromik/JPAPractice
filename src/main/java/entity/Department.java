package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String departmentCity;
    private int countOfWorkers;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "department")
    private List<Client> clients = new ArrayList<Client>();

    public Department() {
    }

    public Department(String departmentCity, int countOfWorkers) {
        departmentCity = departmentCity;
        countOfWorkers = countOfWorkers;
    }

    public Department(String departmentCity, int countOfWorkers, List<Client> clients) {
        this.departmentCity = departmentCity;
        this.countOfWorkers = countOfWorkers;
        this.clients = clients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentCity() {
        return departmentCity;
    }

    public void setDepartmentCity(String departmentCity) {
        this.departmentCity = departmentCity;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentCity='" + departmentCity + '\'' +
                ", countOfWorkers=" + countOfWorkers +
                '}';
    }
}
