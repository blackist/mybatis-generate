package com.xzit.ar.common.po.attachment;

public class AttachmentInfo {
    private Integer attachmentId;

    private Integer attaParentId;

    private String infoType;

    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Integer getAttaParentId() {
        return attaParentId;
    }

    public void setAttaParentId(Integer attaParentId) {
        this.attaParentId = attaParentId;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType == null ? null : infoType.trim();
    }
}