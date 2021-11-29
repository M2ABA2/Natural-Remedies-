package com.makoele.naturalbeautyremediesforafricanskin.remedylist;

public class Remedy {

    private int imageResource;
    private String title;
    private String desc;
    private boolean isShrink = true;

    public Remedy(){ }

    public Remedy(int imageResource, String title, String desc)
    {
        this.imageResource = imageResource;
        this.title = title;
        this.desc = desc;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public boolean isShrink() {
        return isShrink;
    }

    public void setShrink(boolean shrink) {
        isShrink = shrink;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
