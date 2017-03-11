package com.p14_memento_pattern.game;

/**
 * Created by yangyue on 2017/3/9.
 */
public class _Init_ {
    public static void main(String[] args) {

        //新建角色
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.showState();

        //保存状态 roleStateCaretaker以后可能是提供数据库的接口
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        //打BOSS
        gameRole.fightBoss();
        gameRole.showState();

        //恢复存档
        gameRole.recoveryState(roleStateCaretaker.getRoleStateMemento());
        gameRole.showState();
    }
}
