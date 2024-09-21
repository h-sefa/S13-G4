package org.example;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance(){

        return Math.sqrt( y * y +  x * x );
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(Math.abs(x-p.x),2) + Math.pow(Math.abs(y-p.y),2));
    }
    public double distance(int a, int b) {
        return Math.sqrt(Math.pow(Math.abs(x-a),2) + Math.pow(Math.abs(y-b),2));
    }


}

/*
√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    Bu işlemin matematiksel olarak yapımı: √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA) şeklindedir.
√ işlemi karekök işlemini tanımlar. Math.sqrt bu işlem için kullanılmalıdır.
distance metodu için 3 farklı overloading istenmektedir
distance() hiçbir değer almazsa (0,0) noktasına göre uzaklık hesaplanmalı.
distance(Point p) şeklinde başka bir Point objesi alırsa verilen noktaya göre uzaklık hesaplanmalı.
distance(int a, int b) şeklinde 2 farklı int parametresi alınırsa (a,b) ye göre uzaklık bulunmalı.
 */
