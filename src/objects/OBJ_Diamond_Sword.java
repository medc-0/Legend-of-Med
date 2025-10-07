package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Diamond_Sword extends Entity {

    public OBJ_Diamond_Sword(GamePanel gp) {
        super(gp);

        type = type_sword;
        typeSword = 3;
        name = "Diamond Sword";
        down1 = setup("/weapons/diamond_sword", gp.tileSize, gp.tileSize);
        attackValue = 4;
        description = "[ " + name + " ]\nVery Sharp! \nOnly For Advanced.";
        attackArea.width = 42;
        attackArea.height = 42;
    }
}
