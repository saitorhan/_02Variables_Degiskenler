package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {

    public static void main(String[] args) {

        byte _byteDegisken;
        short _shortDegisken;
        int _intDegisken;
        long _longDegisken;
        float _floatDegisken;
        double _doubleDegisken;
        char _charDegisken;
        boolean _booleanDegisken;
        String temp;

        // Değişkenlerin tutabileceği max ve min değerler

        System.out.println("byte En Küçük Değeri: " + Byte.MIN_VALUE + ", byte En Büyük Değeri: " + Byte.MAX_VALUE + ", byte Hafıza Üzerinde Kapladığı Alan (bit cinsinden): " + Byte.SIZE);
        System.out.println("short En Küçük Değeri: " + Short.MIN_VALUE + ", short En Büyük Değeri: " + Short.MAX_VALUE + ", short Hafıza Üzerinde Kapladığı Alan (bit cinsinden): " + Short.SIZE);
        System.out.println("int En Küçük Değeri: " + Integer.MIN_VALUE + ", int En Büyük Değeri: " + Integer.MAX_VALUE + ", int Hafıza Üzerinde Kapladığı Alan (bit cinsinden): " + Integer.SIZE);
        System.out.println("long En Küçük Değeri: " + Long.MIN_VALUE + ", long En Büyük Değeri: " + Long.MAX_VALUE + ", long Hafıza Üzerinde Kapladığı Alan (bit cinsinden): " + Long.SIZE);
        System.out.println("float En Küçük Değeri: " + Float.MIN_VALUE + ", float En Büyük Değeri: " + Float.MAX_VALUE + ", float Hafıza Üzerinde Kapladığı Alan (bit cinsinden): " + Float.SIZE);
        System.out.println("double En Küçük Değeri: " + Double.MIN_VALUE + ", double En Büyük Değeri: " + Double.MAX_VALUE + ", double Hafıza Üzerinde Kapladığı Alan (bit cinsinden): " + Double.SIZE);

        System.out.println("\n\n");
        // stringden inte çevirme
        temp = "21";
        _intDegisken = Integer.valueOf(temp);
        System.out.println("_intDegisken çeviri sonrası: " + _intDegisken);
        _intDegisken = Integer.parseInt(temp);
        System.out.println("_intDegisken parse çeviri sonrası: " + _intDegisken);
        System.out.println("\n\n");


        // stringden double çevirme
        temp = "21.34324";
        _doubleDegisken = Double.valueOf(temp);
        System.out.println("_doubleDegisken çeviri sonrası: " + _doubleDegisken);
        _doubleDegisken = Double.parseDouble(temp);
        System.out.println("_doubleDegisken parse çeviri sonrası: " + _doubleDegisken);
        System.out.println("\n\n");


        // stringden longa çevirme
        temp = "212424242";
        _longDegisken = Long.valueOf(temp);
        System.out.println("_longDegisken çeviri sonrası: " + _longDegisken);
        _longDegisken = Long.parseLong(temp);
        System.out.println("_longDegisken parse çeviri sonrası: " + _longDegisken);
        System.out.println("\n\n");

        // String birleştirerek yazma
        System.out.println("Selam" + " " + "Nasılsın");

        // sayıları birleştirerek yazma
        System.out.println(2 + 3); // sonucu toplar
        System.out.println(2+""+3); // sonucu birleştirir

    }
}
