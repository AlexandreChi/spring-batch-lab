package com.example.processor;

import com.edf.switch_.testxmlspringbatch.model.Xml;
import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<Xml, Xml> {

    @Override
    public Xml process(Xml xml) throws Exception {
        System.out.println("In Processor");
        return xml;
    }
}
