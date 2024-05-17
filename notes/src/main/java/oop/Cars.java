package oop;

class Cars {
    private String car; 

    public Cars() {
        this.car = "undefined";
    }
    
    public Cars(String car) { // constructors can have parameters
          this.car = car; // this.car refers to primitive type variable of class
    }

    public String get() {
          return car;	
    }

    public void set(String set) {
        car = set;
  }
} 
    

