package CompositeDidier;

// Defino una clase base, común y abstracta para las frutas conteniendo las implementaciones comunes para todas;
// en este caso, la forma en que se interpretan como string.
public abstract class BaseFruit implements IFruit
{
    @Override
    public String toString()
    {
        return this.name() + " (" + this.color() + ", " + this.taste() + ")";
    }
}
