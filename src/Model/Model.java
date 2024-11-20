package Model;

public class Model
{

    private int id;
    private String pokemon;
    private String type;

    public Model() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpokemon() {
        return pokemon;
    }

    public void setpokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDuplicado()
    {
        return false;
    }

}