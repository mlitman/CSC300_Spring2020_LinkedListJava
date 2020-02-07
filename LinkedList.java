public class LinkedList
{
    private Node head;
    private int count;

    public LinkedList()
    {
        this.head = null;
        this.count = 0;
    }

    public void addFront(int payload)
    {
        Node n = new Node(payload);
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            n.setNextNode(this.head);
            this.head = n;
        }
        this.count++;
    }

    public void display()
    {
        Node currNode = this.head;
        for(int i = 0; i < this.count; i++)
        {
            System.out.println(currNode.getPayLoad());
            currNode = currNode.getNextNode();
        }
    }
}