package model;

public class Dictionary {
    private String vi;
    private String en;

    public Dictionary() {
    }

    public Dictionary(String vi, String en) {
        this.vi = vi;
        this.en = en;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}
