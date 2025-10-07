package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Axe extends Entity {

    public OBJ_Axe(GamePanel gp) {
        super(gp);

        type = type_axe;
        typeAxe = 1;
        name = "Starter Axe";
        down1 = setup("/weapons/wood_axe", gp.tileSize, gp.tileSize);
        attackValue = 2;
        description = "[ " + name + " ]\nAn Old Axe Used \nTo Cut Trees.";

        attackArea.width = 30;
        attackArea.height = 30;
    }
}
