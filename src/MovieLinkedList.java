public class MovieLinkedList extends LinkedList
{
    public void sortRecent()
    {
        for(int i = 0; i < count; i++)
        {
            Node current = getNode(i);
            Node oldest = current;
            while(current.getNextPtr() != null)
            {
                current = current.getNextPtr();
                if(((Movie)oldest.get()).getDate() > ((Movie)current.get()).getDate())
                {
                    oldest = current;
                }
            }
            remove(oldest);
            add(oldest);
        }
    }
}
