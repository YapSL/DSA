public class P4Q1 {

    public static void main(String[] args) {
        StackInterface<String> s1 = new StackLink<>();
        s1.push("Good");
        s1.push("Morning");
        s1.push("to");
        s1.push("ning");
        
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1.peek());
        
        QueueInterface<String> q1 = new QueueLink<>();
        
        q1.enqueue("Ni");
        q1.enqueue("Hao");
        q1.enqueue("ma");
        
        System.out.println(q1.getFront());
        q1.dequeue();
        System.out.println(q1.getFront());

    }
    
}
