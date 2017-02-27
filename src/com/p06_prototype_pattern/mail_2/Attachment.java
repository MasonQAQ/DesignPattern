package com.p06_prototype_pattern.mail_2;


/**
 * 附件
 * Created by yangyue on 2017/2/27.
 */
public class Attachment implements Cloneable{

    public void download(){
        System.out.println("下载附件");
    }

    public Attachment clone(){
        Attachment attachmentCopy = null;
        try {
            attachmentCopy = (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return attachmentCopy;
    }
}
