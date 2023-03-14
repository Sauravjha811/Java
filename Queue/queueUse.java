package Queue_Java;

public class queueUse {
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
       /* queuUsingArray p1 = new queuUsingArray();
        p1.enqueue(20);
        p1.enqueue(30);
        p1.enqueue(40);
        p1.enqueue(50);
        System.out.println(p1.front());
        System.out.println(p1.size());
        System.out.println(p1.isEmpty());
        while(!p1.isEmpty()){
            System.out.println(p1.dequeue());
        }
        System.out.println(p1.isEmpty());*/
        //dynamicallyQueue p1 = new dynamicallyQueue();
       // int arr1[]={1,2,3,4,5,6};
       // for(int elem:arr1){
        //    p1.enqeue(elem);
        //}
       // while(!p1.isEmpty()){
        //    System.out.print(p1.dequeue()+" ");
        //}
       // queueUsingLL p2 = new queueUsingLL();
       // int arr2[] = {1,2,3,4,5,6};
       // for(int i=0;i<arr2.length;i++){
       //     p2.enqueue(arr2[i]);
       // }
       // while(!p2.isEmpty()){
       //     System.out.print(p2.dequeue()+" ");
       // }
       queueUsing2Stack p3 = new queueUsing2Stack();
       int arr1[]={10,9,8,7,6,5,4,3,2,1,0};
      /*  for(int elem:arr1){
         p3.enqueue(elem);
       }
       System.out.println(p3.size());
       System.out.println(p3.isEmpty());
       while(!p3.isEmpty()){
        System.out.print(p3.dequeue()+" ");
       }
       System.out.println(p3.isEmpty());*/
       stackUsing2Queue s1 = new stackUsing2Queue();
       for(int elem:arr1){
          s1.push(elem);
       }
       System.out.println();
       while(!s1.isEmpty()){
        System.out.print(s1.pop()+" ");
       }
    }
}
