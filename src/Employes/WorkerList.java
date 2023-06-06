package Employes;
import java.util.ArrayList;

public class WorkerList {
    private static WorkerList instance;
    private static ArrayList<BaseWorker> list;
    private WorkerList(){
        list = new ArrayList<>();
    }
    public static WorkerList getInstance(){
        if(instance == null) instance = new WorkerList();
        return instance;
    }
    public void addTimeWorker(String name, int age, Sex sex){
        list.add(new TimeWorker(name, age, sex));
    }
    public void addFixWorker(String name,int age, Sex sex){
        list.add(new FixWorker(name, age, sex));
    }
    public void printList(){
        for (BaseWorker b:list) {
            System.out.println(b);
        }
    }
    public void sortBySalary(){
        ArrayList<BaseWorker> sortedList = new ArrayList<>();
        while (!list.isEmpty()){
            double max = list.get(0).getSalary();
            int maxIndex = 0;
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getSalary() > max){
                    max = list.get(i).getSalary();
                    maxIndex = i;
                }
            }
            sortedList.add(list.get(maxIndex));
            list.remove(maxIndex);
        }
        list = sortedList;
    }
}
