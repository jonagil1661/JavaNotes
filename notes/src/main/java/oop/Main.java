package oop;

import oop.Cars;

class Main {
      /*
       * Class / Parent Class: Universities
       * Objects / Child Classes: UGA, GT, GSU
       */

      /*
       * Class / Parent Class: Fruits
       * Objects / Child Classes: apple, orange, banana
       */
      public static void main(String[] args) {
            Cars obj1 = new Cars("BMW");
            Cars obj2 = new Cars("Audi");
            System.out.println(obj1.get()); // BMW
            System.out.println(obj2.get()); // Audi
            obj1.set("Mercedes"); // obj1 is now Mercedes, not BMW
      }
}
