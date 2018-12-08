public class StackLink<T> implements StackInterface<T> {
    
    private Node topNode;
    
    public StackLink(){
        topNode = null;
    }
    
    public void push(T newEntry){
        Node newNode = new Node(newEntry);
        newNode.next = topNode;
        topNode = newNode;
    }

    public T pop(){
        T top = peek();
        
        if(topNode != null)
        {
          //top = topNode.data;   
            topNode = topNode.next;
        }
        
        top = topNode.data;
        
        return top;
    }
    
    public T peek(){
        T top = null;
        
        if(topNode != null)
        {
          top = topNode.data;   
        }
        
        top = topNode.data;
        
        return top;
    }
    
    public boolean isEmpty(){
        return topNode == null;
    }
    
    public void clear(){
        topNode = null;
    }
    
    public class Node{
        private T data;
        private Node next;
        
        private Node(T data){
            this.data = data;
            this.next = null;
        }
        
        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
