package HackerRank

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

//copy this code to hackerrank
def f(num:Int,arr:List[Int]):List[Int] =  {
  var output_list:List[Int]=List()
  arr.map(x=>{
  for(i<-0 until num)
  {
  output_list=output_list:+x
  }
  })
  output_list
  }
