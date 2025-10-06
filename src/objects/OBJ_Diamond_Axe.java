package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Diamond_Axe extends Entity {

    public OBJ_Diamond_Axe(GamePanel gp) {
        super(gp);

        type = type_axe;
        typeAxe = 3;
        name = "Diamond Axe";
        down1 = setup("/objects/diamond_axe", gp.tileSize,gp.tileSize);
        attackValue = 4;
        description = "[ " + name + " ]\nAn useful Axe Used \nTo Cut Trees.";

        attackArea.width = 36;
        attackArea.height = 36;
    }
}
