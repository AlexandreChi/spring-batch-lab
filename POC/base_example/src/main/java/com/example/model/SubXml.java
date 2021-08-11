package com.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sub")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubXml {

    private String sub1;
    private String sub2;

    public String getSub1() {
        return sub1;
    }
    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }
    public String getSub2() {
        return sub2;
    }
    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }
}
