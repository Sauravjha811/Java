package Priority_Queue_1;

public class PriorityQueue_MaxTest {
    public static void main(String[] args) throws PriorityQueueException {
        PriorityQueue_Max<String> pq = new PriorityQueue_Max<>();
        pq.insert("Saurav Kumar Jha",1);
        pq.insert("Taranvir Singh",11);
        pq.insert("Ramandeep Singh",34);
        pq.insert("Nidhi Singh",10);
        pq.insert("Radhika Sharma",14);
        pq.insert("Salma Khatun",190);

        while(!pq.isEmpty()){
            System.out.println(pq.getMax());
            pq.removeMin();
        }
        PriorityQueue_Max<Integer> Sk = new PriorityQueue_Max<>();
        Sk.insert(786,1);
        Sk.insert(108,11);
        Sk.insert(101,34);
        Sk.insert(51,10);
        Sk.insert(511,14);
        Sk.insert(251,190);

        while(!Sk.isEmpty()){
            System.out.println(Sk.getMax());
            Sk.removeMin();
        }
    }
}
