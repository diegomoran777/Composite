package CompositeDidier;

// El Builder para construir ensaladas de fruta!
public class FruitSaladBuilder
{
    public FruitSaladBuilder addOrange()
    {
        this.m_salad.addFruit(new Orange());
        return this;
    }

    public FruitSaladBuilder addApple()
    {
        this.m_salad.addFruit(new Apple());
        return this;
    }

    public FruitSaladBuilder addPear()
    {
        this.m_salad.addFruit(new Pear());
        return this;
    }

    // El método que me devuelve el objeto ya configurado
    public FruitSalad get()
    {
        // Guardo una referencia temporal al objeto configurado
        FruitSalad ret = this.m_salad;
        // Instancio uno nuevo para la siguiente configuración
        this.m_salad = new FruitSalad();
        // Devuelvo el objeto previamente configurado
        return ret;
    }

    private FruitSalad m_salad = new FruitSalad();
}
