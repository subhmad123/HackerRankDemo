package HackerRank

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.{readInt, readLine}

import scala.io.StdIn.{readInt, readLine}
object BangaloreBank {
  def main(args:Array[String]): Unit ={
    var number=readInt()
    var account_num=readLine().replace("0","10").split(" ").map(_.toInt)
    var dp=new Array[Int](number)
    var current_min=0
    for(i<-0 until number){
      current_min=dp(0)
      for(j<- 1 until i) {
        current_min=Math.min(current_min,dp(j)+math.abs(account_num(i)-account_num(j-1)))
                  // 9,0+(3-1)=(9,2)=2
      }
      dp(i)=current_min
      for(j<- 0 until i) {
        dp(j)+=math.abs(account_num(i)-account_num(i-1))
      }
    //println(i+" th loop"+dp.toList)
    }
    println(dp.min+number)
  }

}