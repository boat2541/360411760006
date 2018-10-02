package lab7;
//properties
//1. name
//2. id
//3. position
//4. salary
//5. email


public class employee {

    public String name;
    public String id;
    public String position;
    public double salary;
    public String email;

    public employee(){}

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }

    public employee(String name, String id, String position, double salary, String email){


        this.name = name;
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.email = email;


    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}//class
