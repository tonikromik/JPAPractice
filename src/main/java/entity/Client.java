package entity;

import javax.persistence.*;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String education;
    private String passport;
    private String city;
    private String age;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Department department;

    @OneToOne
    private Application application;

    public Client() {
    }

    public Client(String firstName, String lastName, String education, String passport, String city, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.education = education;
        this.passport = passport;
        this.city = city;
        this.age = age;
    }

    public Client(String firstName, String lastName, String education, String passport, String city, String age, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.education = education;
        this.passport = passport;
        this.city = city;
        this.age = age;
        this.department = department;
    }

    public Client(String firstName, String lastName, String education, String passport, String city, String age, Department department, Application application) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.education = education;
        this.passport = passport;
        this.city = city;
        this.age = age;
        this.department = department;
        this.application = application;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", education='" + education + '\'' +
                ", passport='" + passport + '\'' +
                ", city='" + city + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}



