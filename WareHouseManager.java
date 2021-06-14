package sample;
/**
 * @author David (1972038)
 */
public class WareHouseManager extends WareHouse{
    private WareHouse wareHouse;


    public WareHouseManager(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public void addItemWareHouse(Item item){
        wareHouse.addItemToList(item);
    }

    public void viewItemInWareHouse(){
        wareHouse.showAllItemData();
    }
}
