package com.xzit.uscdl.common.po.dict;

public class DictionaryData {
    private Integer dictdataId;

    private String dictdataName;

    private String dictdataValue;

    private String dictValue;

    private String isFixed;

    private String isCancel;

    private String parentId;

    public Integer getDictdataId() {
        return dictdataId;
    }

    public void setDictdataId(Integer dictdataId) {
        this.dictdataId = dictdataId;
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

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public String getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(String isFixed) {
        this.isFixed = isFixed == null ? null : isFixed.trim();
    }

    public String getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(String isCancel) {
        this.isCancel = isCancel == null ? null : isCancel.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }
}