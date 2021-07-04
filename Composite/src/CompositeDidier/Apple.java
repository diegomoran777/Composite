package CompositeDidier;

// Sólo lo aclaro en esta, pero implemento las frutas concretas
public class Apple extends BaseFruit
{
    @Override
    public String name()
    {
        return "Apple";
    }

    @Override
    public String color()
    {
        return "Red";
    }

    @Override
    public String taste()
    {
        return "Sweet";
    }
}
