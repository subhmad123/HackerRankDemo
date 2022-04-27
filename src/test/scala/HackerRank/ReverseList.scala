package HackerRank

import scala.io.StdIn.readInt

def f(arr:List[Int]):List[Int] = {
  var output_list:List[Int]=List()
  if(arr.isEmpty)
  {
  List()
  }
  else
  {
  arr.map(x=>{
  output_list=x+:output_list
  })
  output_list
  }
  }