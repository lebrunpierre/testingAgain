package com.company;

import lombok.*;
@Data

public class Wall {
    double width ;
    double height;

    public Wall(){
        this.height = 0;
        this.width = 0;

    }

    public void setWidth(double width) {
        if (width < 0){
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <0){
            height = 0;
        }
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
