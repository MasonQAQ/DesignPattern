package com.p06_prototype_pattern.mail_1;

/**
 * 通过流实现了深克隆，把对象中的值类型和引用类型都克隆了。
 * 这种方式比较复杂一点，可以根据实际情况来选择使用。
 * Created by yangyue on 2017/2/27.
 */
public class _Init_ {
    public static void main(String[] args) {
        Email email,copyEmail=null;

        email=new Email();

        try{
            copyEmail=(Email)email.deepClone();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        System.out.println("email==copyEmail?");
        System.out.println(email==copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment?");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());
    }
}
