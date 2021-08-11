package com.example.mapper;

import com.edf.switch_.testxmlspringbatch.model.SubXml;
import com.edf.switch_.testxmlspringbatch.model.Xml;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import java.util.ArrayList;

public class CsvXmlMapper implements FieldSetMapper<Xml> {
    @Override
    public Xml mapFieldSet(FieldSet fieldSet)  {
        Xml result = new Xml();
        result.setBase1(fieldSet.readString(0));
        result.setBase2(fieldSet.readString(1));
        ArrayList<SubXml> subResult = new ArrayList<>();
        SubXml subXml = new SubXml();
        subXml.setSub1(fieldSet.readString(2));
        subResult.add(subXml);
        result.setSubXml(subResult);
        return result;
    }
}
