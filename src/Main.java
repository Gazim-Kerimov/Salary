import Employes.*;

public class Main {
    public static void main(String[] args) {
        WorkerList workerList = WorkerList.getInstance();
        workerList.addTimeWorker("John", 28, Sex.MALE);
        workerList.addTimeWorker("Ann", 32, Sex.FEMALE);
        workerList.addFixWorker("Greg", 29, Sex.MALE);
        workerList.addFixWorker("Kate", 42, Sex.FEMALE);
        workerList.printList();
        System.out.println("Сортировка");
        workerList.sortBySalary();
        workerList.printList();

    }
}
