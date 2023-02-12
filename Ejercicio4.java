package com.example.tema4;

public class Ejercicio4 {
    String color;
    String modelo;
    int iD;


    public Ejercicio4(){}

    public Ejercicio4(String color, String modelo, int iD){
        this.color = color;
        this.modelo = modelo;
        this.iD = iD;
    }
    public static class SmartPhone extends Ejercicio4 {
        int camaras;

        public SmartPhone(){}

        public SmartPhone(int camaras, String color, String modelo, int iD){
            super(color, modelo, iD);
            this.camaras = camaras;
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "camaras=" + camaras +
                    ", color='" + color + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", iD=" + iD +
                    '}';
        }
    }

    public static class Smartwatch extends Ejercicio4 {
        boolean modoSport;

        public Smartwatch(){}

        public Smartwatch(boolean modoSport, String color, String modelo, int iD) {
            super(color, modelo, iD);
            this.modoSport = modoSport;
        }

        @Override
        public String toString() {
            return "Smartwatch{" +
                    "modoSport=" + modoSport +
                    ", color='" + color + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", iD=" + iD +
                    '}';
        }
    }

    public static void main(String[] args){
        SmartPhone phone = new SmartPhone(2, "blanco", "iphone 7", 554789);
        Smartwatch watch = new Smartwatch(true, "Negro", "MiFit 6", 2233445);
        System.out.println(phone);
        System.out.println(watch);
    }
}


