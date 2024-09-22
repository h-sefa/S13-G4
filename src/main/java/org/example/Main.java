package org.example;

public class Main {
    public static void main(String[] args) {
        Point point1 =new Point(3,4);
        Point point2 =new Point(3,7);

        System.out.println(point1.distance());
        System.out.println(point2.distance(point1));
        System.out.println(point1.distance(5,6));




        Player player1 = new Player("Arthur", 120, Weapon.SWORD);  // healthPercentage 100'e set edilir
        System.out.println("Player1 health: " + player1.healthRemaining());  // 100

        // Sağlık kaybetme
        player1.loseHealth(30);
        System.out.println("Player1 health after damage: " + player1.healthRemaining());  // 70

        // Sağlık iksiri kullanma
        player1.restoreHealth(40);
        System.out.println("Player1 health after restoring: " + player1.healthRemaining());  // 100

        // Fazla hasar alma
        player1.loseHealth(150);  // "Arthur player has been knocked out of game"
    }
}