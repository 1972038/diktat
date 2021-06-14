package sample;
/**
 * @author David (1972038)
 */
public class Snake {
    private String name;
    public Snake(String nama){
        this.name=nama;
    }

    public String getName() {
        return name;
    }

    public void Sparing(Panda panda){
        int temp;
        temp=panda.getEnergy();
        temp+=6;
        panda.setEnergy(temp);
        temp= panda.getStrenght();
        temp+=8;
        panda.setStrenght(temp);
    }
}
