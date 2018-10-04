package lab1_16;

public class List<D>{
    private Node<D> head = null, end = null;
    private int listSize = 0;

    private static class Node<D>{
        private D data;
        private Node<D> next;

        public Node(D d, Node<D> n){
            data = d;
            next = n;
        }
    }

    public List(){}

    public int getListSize(){
        return listSize;
    }

    public boolean isEmpty(){
        return listSize == 0;
    }

    public void addNode(D d){
        Node<D> current = new Node<D>(d, null);

        if(isEmpty()){
            head = current;
            end = current;
        }else{
            end.next = current;
            end = current;
        }
        listSize++;
    }

    public void addNode(D d,int i){
        Node<D> add = new Node<D>(d, null),current = head;
        int t = 0;

        if(isEmpty()){
            head = add;
            end = add;
        }else{
            if(i == 0){
                add.next = head;
                head = add;
            }else{
                while (t < listSize-1 && t < i-1){
                    current = current.next;
                    t++;
                }
                add.next = current.next;
                current.next = add;
            }
            if(add.next == null){
                end = add;
            }
        }
        listSize++;
    }

    public void delNode(int i){
        int t = 0;
        Node<D> current = head;

        if(!isEmpty()){
            if(i == 0){
                head = head.next;
                current.data = null;
                current.next = null;
                current = head;
            }else{
                while (t < listSize-1 && t < i-1){
                    current = current.next;
                    t++;
                }
                current.next.data = null;
                current.next = current.next.next;
            }
            if(current.next == null){
                end = head;
            }
            listSize--;
        }else{
            System.out.println("List already empty");
        }
    }

    public void printData(){
        Node<D> current = head;
        if(!isEmpty()){
            while (current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }else {
            System.out.println("Лист пуст");
        }
    }

    public D viewData(int i){
        Node<D> current = head;
        int t = 0;
        if(!isEmpty()){
            while (t < listSize-1 && t < i-1){
                current = current.next;
                t++;
            }
            return current.data;
        }else {
            System.out.println("No data here");
            return null;
        }
    }
}