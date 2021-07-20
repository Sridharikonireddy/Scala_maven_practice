package TaskProgs



object StringInterpolation extends App
{
  val ob=new person("*********sree","is a good girl")
  ob.display("**********")


}
class person(name:String,Message:String)
{
  def display(name:String)={
    println(s"${this.name} $Message $name")
  }

}
