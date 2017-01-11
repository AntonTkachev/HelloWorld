import scala.collection.mutable.ListBuffer

object P12 extends App {

  /**
    * P12 (**) Decode a run-length encoded list.
    * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
    * Example:
    * *
    * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    **/

  def decode(list: List[(Int, Symbol)]) = {
    var endList = new ListBuffer[Symbol]()
    list.foreach(x => {
      val res = List.fill(x._1)(x._2)
      res.foreach(s => endList += s)
    })
    println(endList.toList)
  }

  decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
}

object P14 extends App {

  /**
    * P14 (*) Duplicate the elements of a list.
    * Example:
    * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    **/

  def duplicate(list: List[Symbol], numOfIter: Int = 2) = {
    var endList = new ListBuffer[Symbol]()
    list.foreach(x => {
      for (i <- 1 to numOfIter) {
        endList += x
      }
    })
    println(endList)
  }

  duplicate(List('a, 'b, 'c, 'c, 'd))
}

object P15 extends App {

  /**
    * P15 (**) Duplicate the elements of a list a given number of times.
    * Example:
    * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
    **/

  P14.duplicate(List('a, 'b, 'c, 'c, 'd), 3)
}