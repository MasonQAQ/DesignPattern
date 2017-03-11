package com.p14_memento_pattern.game;

/**
 * Created by yangyue on 2017/3/9.
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateCaretaker() {
    }

    public RoleStateCaretaker(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
