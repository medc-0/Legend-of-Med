package main;

import entity.NPC_OldMan;
import monster.MON_GreenSlime;
import objects.*;

public class AssetSetter {

    GamePanel gp;
    public boolean changer = false;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        int i = 0;

        gp.obj[i] = new OBJ_Axe(gp);
        gp.obj[i].worldX = gp.tileSize * 44;
        gp.obj[i].worldY = gp.tileSize * 62;
        i++;
        gp.obj[i] = new OBJ_Boots(gp);
        gp.obj[i].worldX = gp.tileSize * 42;
        gp.obj[i].worldY = gp.tileSize * 63;
        i++;
        gp.obj[i] = new OBJ_HealPotion(gp);
        gp.obj[i].worldX = gp.tileSize * 46;
        gp.obj[i].worldY = gp.tileSize * 63;
        i++;
        gp.obj[i] = new OBJ_Diamond_Sword(gp);
        gp.obj[i].worldX = gp.tileSize * 42;
        gp.obj[i].worldY = gp.tileSize * 66;
    }

    public void setNPC() {

        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = gp.tileSize * 59;
        gp.npc[0].worldY = gp.tileSize * 47;

    }

    public void setMonster() {

        int i = 0;

        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 26;
        gp.monster[i].worldY = gp.tileSize * 62;
        i++;
        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 26;
        gp.monster[i].worldY = gp.tileSize * 63;
        i++;
        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 26;
        gp.monster[i].worldY = gp.tileSize * 64;
        i++;
        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 26;
        gp.monster[i].worldY = gp.tileSize * 65;
        i++;
        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 26;
        gp.monster[i].worldY = gp.tileSize * 66;
    }

}
