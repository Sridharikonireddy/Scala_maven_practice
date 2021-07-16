package TaskProgs

object Caseclss1 extends App
{
    var Stu=Student(1,"Cse","sree")
  println(Stu.id+" "+Stu.Department+" "+Stu.Name)
  var Stu1=Stu.copy(id=2)
 println(Stu1.id+" "+Stu1.Department+" "+Stu1.Name)


}
case class Student(id:Int,Department:String,Name:String)