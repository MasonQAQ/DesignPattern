package com.p06_prototype_pattern.mail_1;

import java.io.Serializable;

/**
 * 附件
 * Created by yangyue on 2017/2/27.
 */
public class Attachment implements Serializable {

    public void download(){
        System.out.println("下载附件");
    }

}
