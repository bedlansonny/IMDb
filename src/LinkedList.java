public class LinkedList
{
    Node head;
    int count;

    public LinkedList()
    {
        head = null;
    }

    public void add(Object data)
    {
        Node newNode = new Node(data);
        newNode.setNextPtr(head);
        head = newNode;
        count++;
    }

    public Object get(int index)
    {
        if(index < 0 || index >= count)
            return null;

        Node current = head;

        for(int i = 0; i < index; i++)
        {
            current = current.next;
        }

        return current.get();
    }

    public int size()
    {
        return count;
    }

}
