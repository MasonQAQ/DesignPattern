package com.p13_adapter_pattern.nba;

/**
 * Created by yangyue on 2017/3/9.
 */
public class Translator extends Player {

    private ForeignPlayer foreignPlayer;

    public Translator(ForeignPlayer foreignPlayer) {
        this.foreignPlayer = foreignPlayer;
    }

    public Translator() {
    }

    public ForeignPlayer getForeignCenter() {
        return foreignPlayer;
    }

    public void setForeignCenter(ForeignCenter foreignPlayer) {
        this.foreignPlayer = foreignPlayer;
    }

    @Override
    public void attack() {
        foreignPlayer.foreignAttack();
    }

    @Override
    public void defence() {
        foreignPlayer.foreignDefense();
    }
}
