public class Node
{
    private int payload;
    private Node nextNode;

    public Node(int payload)
    {
        this.payload = payload;
        this.nextNode = null;
    }

    public int getPayLoad()
    {
        return this.payload;
    }
    
    public Node getNextNode()
    {
        return this.nextNode;
    }

    public void setNextNode(Node n)
    {
        this.nextNode = n;
    }
}