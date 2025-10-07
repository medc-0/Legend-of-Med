package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Iron_Axe extends Entity {


    public OBJ_Iron_Axe(GamePanel gp) {
        super(gp);

        type = type_axe;
        typeAxe = 2;
        name = "Iron Axe";
        down1 = setup("/weapons/axe", gp.tileSize, gp.tileSize);
        attackValue = 3;
        description = "[ " + name + " ]\nAn useful Axe Used \nTo Cut Trees.";

        attackArea.width = 34;
        attackArea.height = 34;
    }
}
