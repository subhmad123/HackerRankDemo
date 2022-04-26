package HackerRank

import scala.io.StdIn.readInt

object PentagonalNumber extends App{
    println("enter the number of inputs")
    val num=readInt()
    val tab_array=new Array[Int](100001)
    tabulation_dp()
    println("please enter the numbers for which you want pentagonal number")
    for(i<-0 until num){
      var input=readInt()
      println(input+"th pentagonal number is"+tab_array(input))
    }

  /**
   *applying tabulation method of dynamic programming. Already storing the results for further inputs based on previous outputs
   */
    def tabulation_dp(): Unit ={
      tab_array(1)=1
      tab_array(2)=5
      for(i<-3 until 100001){
        tab_array(i)=3+(2*tab_array(i-1))-tab_array(i-2)
      }
    }
}
