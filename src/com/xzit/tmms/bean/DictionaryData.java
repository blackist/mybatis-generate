package com.xzit.tmms.bean;

public class DictionaryData {
    private Integer id;

    private String dictValue;

    private String dictdataName;

    private String dictdataValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public String getDictdataName() {
        return dictdataName;
    }

    public void setDictdataName(String dictdataName) {
        this.dictdataName = dictdataName == null ? null : dictdataName.trim();
    }

    public String getDictdataValue() {
        return dictdataValue;
    }

    public void setDictdataValue(String dictdataValue) {
        this.dictdataValue = dictdataValue == null ? null : dictdataValue.trim();
    }
}