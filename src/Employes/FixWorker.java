package Employes;

public class FixWorker extends BaseWorker {

    public FixWorker(String name, int age, Sex sex) {
        super(name, age, sex);
        setSalary();
    }

    @Override
    public void setSalary() {
        if(getAge()>30){
            this.salary = 850;
        }
        else this.salary = 450;

    }
    @Override
    public String toString() {
        return "Fix worker: name - " + getName() +
                " | age - " + getAge() +
                " | sex - " + getSex() +
                " | salary - " + getSalary();
    }

}
