package com.p06_prototype_pattern.mail_2;

/**
 * Created by yangyue on 2017/2/27.
 */
public class Email implements Cloneable{
    private Attachment attachment;

    public Email() {
        this.attachment = new Attachment();
    }

    private Email(Attachment attachment) {
        this.attachment = attachment.clone();
    }
    public Email clone(){
        return new Email(this.attachment);
    }

    public Attachment getAttachment() {
        return this.attachment;
    }

    public void display() {
        System.out.println("查看邮件");
    }
}
