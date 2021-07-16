package TaskProgs

object StudentClass extends App
{

    var ob=new Student(1,"sree","cse",77.2)
    ob.Display()
    class Student(id:Int,name:String,Department:String,marks:Double)
  {
       def Display(): Unit =
    {
       println(id)
      println(name)
      println(Department)
      println(marks)
    }
  }
}
