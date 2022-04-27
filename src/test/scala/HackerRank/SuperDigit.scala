package HackerRank

import scala.annotation.tailrec
import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object Solution {

  def main(args: Array[String]) {
    var value=readLine()
    //println("please enter the required number to check")
    var number:String=value.split(" ")(0)
    //println("please enter the repetition frequency")
    var frequency:Int=value.split(" ")(1).toInt
    while(frequency!=1||number.length>1){
      number=find_super(number,frequency).toString
      frequency=1
    }
    println(number)
  }

  def find_super(number:String,frequency: Int):Long={
    val sum:Long=number.map(x=>x.toLong-'0').sum
    sum*frequency
  }
}
