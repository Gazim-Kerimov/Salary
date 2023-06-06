package Employes;
public class TimeWorker extends BaseWorker{


    public TimeWorker(String name, int age, Sex sex) {
        super(name, age, sex);
        setSalary();
    }

    @Override
    public void setSalary() {
        if(getAge() > 30) {
            this.salary = 20.8 * 8 * 8;
        }
        else this.salary = 20.8 * 8 * 4;
    }
    @Override
    public String toString() {
        return "Time worker: name - " + getName() +
                " | age - " + getAge() +
                " | sex - " + getSex() +
                " | salary - " + getSalary();
    }
}
