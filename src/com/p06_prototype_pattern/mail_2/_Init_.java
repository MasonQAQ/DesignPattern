package com.p06_prototype_pattern.mail_2;

/**
 * Created by yangyue on 2017/2/27.
 */
public class _Init_ {
    public static void main(String[] args) {
        Email email,copyEmail;

        email = new Email();
        copyEmail = email.clone();

        System.out.println("email==copyEmail?");
        System.out.println(email==copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment?");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());
    }
}
