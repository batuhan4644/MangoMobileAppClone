package com.example.mangomobileappclone;

import java.io.Serializable;

public class Giyim implements Serializable {
    private int giyimId;
    private String giyimAdi;
    private String giyimResimAdi;
    private double giyimFiyat;

    public Giyim() {
    }

    public Giyim(int giyimId, String giyimAdi, String giyimResimAdi,double giyimFiyat) {
        this.giyimId = giyimId;
        this.giyimAdi = giyimAdi;
        this.giyimResimAdi = giyimResimAdi;
        this.giyimFiyat = giyimFiyat;

    }

    public int getGiyimId() {
        return giyimId;
    }

    public void setGiyimId(int giyimId) {
        this.giyimId = giyimId;
    }

    public String getGiyimAdi() {
        return giyimAdi;
    }

    public void setGiyimAdi(String giyimAdi) {
        this.giyimAdi = giyimAdi;
    }

    public String getGiyimResimAdi() {
        return giyimResimAdi;
    }

    public void setGiyimResimAdi(String giyimResimAdi) {
        this.giyimResimAdi = giyimResimAdi;
    }

    public double getGiyimFiyat() {
        return giyimFiyat;
    }

    public void setGiyimFiyat(double giyimFiyat) {
        this.giyimFiyat = giyimFiyat;
    }
}
