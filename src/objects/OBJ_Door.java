package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Door extends Entity {

    GamePanel gp;

    public OBJ_Door(GamePanel gp){
        super(gp);
        this.gp = gp;

        type = type_obstacle;
        name = "Door";
        down1 = setup("/objects/Door",gp.tileSize,gp.tileSize);
        collision = true;

        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 48;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
/*
    public void interact() {

        gp.gameState = gp.dialogState;
        gp.ui.currentDialogue = "I need a key to open this.";
    }
 */
}
