package com.practice
object ClassConstr {
  def main(args: Array[String])
  {
    val obj1 = new ClassConstr.Car("sree",201,70)
    val obj2 = new ClassConstr.Car("naag", 202,60)
    obj1.Display()
    obj2.Display()

  }


  class Car(Name: String, Id:Int, Percentage:Int) {
    def Display() {
      println("name is : " + Name);
      println("id is : " + Id);
      println("percentage is : " + Percentage);
    }
  }
}

