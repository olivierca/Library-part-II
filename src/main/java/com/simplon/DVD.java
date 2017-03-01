package com.simplon;


public class DVD {

    private Movie   kind;
    private String  title="";
    private int     time=0;
    private boolean f3D=false;
    private int     shippingDay=2;

    public DVD(String title,int time,Movie kind,boolean f3D ,int shippingDay){
        this.title = title;
        this.time = time;
        this.kind = kind;
        this.f3D = f3D;
        this.shippingDay = shippingDay;
    }

    public boolean equals(DVD obj) {
        if(this.title != obj.title) return false;
        if(this.kind != obj.kind) return false;
        if(this.time != obj.time) return false;
        if(this.f3D != obj.f3D) return false;
        return true;
    }
}
