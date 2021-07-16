package TaskProgs

object Caseclss extends App
{
    var Stu=Student(1,"Cse","sree")
     Stu.Display()
}
case class Student(id:Int,Department:String,Name:String)
{
     def Display() {
       println(id)
       println(Department)
       println(Name)
     }
}