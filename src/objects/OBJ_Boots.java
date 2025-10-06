package objects;

import entity.Entity;
import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Boots extends Entity {

    public OBJ_Boots(GamePanel gp){
        super(gp);

        name = "Boots";
        down1 = setup("/objects/boots",gp.tileSize,gp.tileSize);

        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 48;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
}
