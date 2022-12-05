package com.company;


public class Main {
    public static void main(String[] args) {

        Wall myWall = new Wall();

        myWall.setHeight(8.8);
        myWall.setWidth(4.4);

        System.out.println(myWall.width);
        System.out.println(myWall.height);
        System.out.println(myWall.getArea());;
    }



}

