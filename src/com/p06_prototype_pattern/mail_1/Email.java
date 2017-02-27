package com.p06_prototype_pattern.mail_1;

import java.io.*;

/**
 * Created by yangyue on 2017/2/27.
 */
public class Email implements Serializable{
    private Attachment attachment;

    public Email() {
        this.attachment = new Attachment();
    }
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中: 序列化
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oss = new ObjectOutputStream(bao);
        oss.writeObject(this);

        //将对象从流中取出: 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return(ois.readObject());
    }
    public Attachment getAttachment() {
        return this.attachment;
    }

    public void display() {
        System.out.println("查看邮件");
    }
}
