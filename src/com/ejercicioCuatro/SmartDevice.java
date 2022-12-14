package com.ejercicioCuatro;

public class SmartDevice {

    private Boolean seCarga;
    private Boolean bareria;
    private Boolean seEnciende;

    public SmartDevice(){

    }

    public Boolean getSeCarga() {
        return seCarga;
    }

    public void setSeCarga(Boolean seCarga) {
        this.seCarga = seCarga;
    }

    public Boolean getBareria() {
        return bareria;
    }

    public void setBareria(Boolean bareria) {
        this.bareria = bareria;
    }

    public Boolean getSeEnciende() {
        return seEnciende;
    }

    public void setSeEnciende(Boolean seEnciende) {
        this.seEnciende = seEnciende;
    }
}
