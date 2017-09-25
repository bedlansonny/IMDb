public class Actor
{
    String name;
    Actor next;

    public Actor()
    {
        next = null;
    }

    public Actor(String name)
    {
        this.name = name;
        next = null;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Actor getNextPtr()
    {
        return next;
    }

    public void setNextPtr(Actor next)
    {
        this.next = next;
    }

    public String toString()
    {
        return ("Name: " + name + "\n");
    }


}
