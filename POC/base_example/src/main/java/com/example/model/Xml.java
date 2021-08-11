package com.example.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class Xml {

    private String base1;
    private String base2;
    @XmlElementWrapper(name="subs")
    @XmlElements({
            @XmlElement(name="sub",     type=SubXml.class),
    })
    private List<SubXml> subXml =  new ArrayList<SubXml>();

    public String getBase1() {
        return base1;
    }
    public void setBase1(String base1) {
        this.base1 = base1;
    }
    public String getBase2() {
        return base2;
    }
    public void setBase2(String base2) {
        this.base2 = base2;
    }
    public List<SubXml> getSubXml() {
        return subXml;
    }
    public void setSubXml(List<SubXml> subXml) {
        this.subXml = subXml;
    }
}
