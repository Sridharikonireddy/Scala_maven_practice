package TaskProgs

object map  extends App
{
     val States=Map("Ap"->40000,"tn"->20000,"up"->50000,"kerela"->70000,"pune"->9000,"goa"->5000)
  States.foreach {
    case (names, population)=> println(s"$names $population")
  }
      States.foreach {
        case(names,population) =>if(population>10000) println(s"$names,$population==>",(population*2))
      }

}
