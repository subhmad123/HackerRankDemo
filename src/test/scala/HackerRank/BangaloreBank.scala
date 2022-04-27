package HackerRank

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.{readInt, readLine}

import scala.io.StdIn.{readInt, readLine}
object BangaloreBank {
  def main(args:Array[String]): Unit ={
    var number=readInt()
    var A=readLine().replace("0","10").split(" ").map(_.toInt)
    var dp=Array.ofDim[Int](number)
    var s=0
    for(i<-0 until number){
      s=dp(0)
      for(j<- 1 until i) {
        println("first for loop A(i)=" +A(i)+"A(j-1)=="+A(j-1))
        s=Math.min(s,dp(j)+math.abs(A(i)-A(j-1)))
      }
      dp(i)=s
      for(j<- 0 until i) {
        dp(j)+=math.abs(A(i)-A(i-1))
      }
    println(i+" th loop"+dp.toList)
    }
    println(dp.min+number)
  }

}