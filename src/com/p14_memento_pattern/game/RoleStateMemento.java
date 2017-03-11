package com.p14_memento_pattern.game;

/**
 * Created by yangyue on 2017/3/9.
 */
public class RoleStateMemento {
    private int vit;
    private int def;
    private int atk;

    public RoleStateMemento(int vit, int def, int atk) {
        this.vit = vit;
        this.def = def;
        this.atk = atk;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
