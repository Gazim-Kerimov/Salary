package Employes;

import java.util.Comparator;

public abstract class BaseWorker implements Comparable<BaseWorker> {
    private String name;
    private int age;
    private Sex sex;
    double salary;
    public abstract void setSalary();

    private BaseWorker(){}
    public BaseWorker(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        setSalary();
    }


    public int compareTo(BaseWorker o) {
        if(this.getSalary() > o.getSalary()) return 1;
        if(this.getSalary() < o.getSalary()) return -1;
        else return 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "BaseWorker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", salary=" + salary +
                '}';
    }
}
