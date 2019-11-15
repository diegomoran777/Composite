package CompositeDidier;

import java.util.ArrayList;

// Declaro la ensalada de frutas, que básicamente sólo tiene la lista de frutas que contiene.
public class FruitSalad
{
    public void addFruit(IFruit fruit)
    {
        this.m_fruits.add(fruit);
    }

    public String toString()
    {
        // Construir un string más complejo en caso de tener frutas
        if(this.m_fruits.size() > 0)
        {
            // Uso StringBuilder porque es más óptimo para crear strings dinámicamente
            StringBuilder sb = new StringBuilder();
            sb.append("I'm a fruit salad with ");
            for(IFruit fruit : this.m_fruits)
            {
                // Sólo separo con coma cuando no es la primera fruta
                if(!fruit.equals(this.m_fruits.get(0)))
                {
                    sb.append(", ");
                }
                sb.append(fruit.toString());
            }
            return sb.toString();
        }

        return "I'm an empty fruit salad";
    }

    private ArrayList<IFruit> m_fruits = new ArrayList<>();
}
