package Priority_Queue_1;

public class Priority_QueueTest {
    public static void main(String[] args) throws PriorityQueueException {
        Priority_Queue<String> pq = new Priority_Queue<>();
        pq.insert("Saurav Kumar Jha",1);
        pq.insert("Taranvir Singh",11);
        pq.insert("Ramandeep Singh",34);
        pq.insert("Nidhi Singh",10);
        pq.insert("Radhika Sharma",14);
        pq.insert("Salma Khatun",190);

        while(!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }
        Priority_Queue<Integer> Sk = new Priority_Queue<>();
        Sk.insert(786,1);
        Sk.insert(108,11);
        Sk.insert(101,34);
        Sk.insert(51,10);
        Sk.insert(511,14);
        Sk.insert(251,190);

        while(!Sk.isEmpty()){
            System.out.println(Sk.getMin());
            Sk.removeMin();
        }
    }
}

