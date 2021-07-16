package TaskProgs

object Traits extends App
{
     var ob=new circle()
     ob.area()
  var ob1=new Rectangle()
   ob1.area()
  var ob2=new Square()
  ob2.area()


      trait Shape
  {
      def area()
  }
  class  circle extends Shape
  {
        def area(): Unit =
        {
           var r=22
             var area=3.04*r*r
             println(area)
        }
  }
  class Rectangle extends Shape
  {
         def area(): Unit ={

           var l=22
           var b=33.5
           val area=l*b
           println(area)
         }
  }
  class  Square extends Shape{
     def area(): Unit ={

        var a=60
        var area=a*a
       println(area)

     }
  }
}
