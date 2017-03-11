package com.p14_memento_pattern.game;

/**
 * Created by yangyue on 2017/3/9.
 */
public class GameRole {
    private int vit;//生命值
    private int def;//防御力
    private int atk;//攻击力

    public GameRole() {
    }

    public GameRole(int vit, int def, int atk) {
        this.vit = vit;
        this.def = def;
        this.atk = atk;
    }

    //初始化角色状态
    public void initState(){
        this.vit = 100;
        this.def = 100;
        this.atk = 100;
    }

    //显示当前状态
    public void showState(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "当前游戏角色的状态如下:{" +
                "vit=" + vit +
                ", def=" + def +
                ", atk=" + atk +
                '}';
    }

    //和Boss作战
    public void fightBoss(){
        this.atk = 0;
        this.def = 0;
        this.vit = 0;
    }

    //保存当前游戏状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(this.vit,this.def,this.atk);
    }

    //回复游戏状态
    public void recoveryState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.def = roleStateMemento.getDef();
        this.atk = roleStateMemento.getAtk();
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
