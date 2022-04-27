package HackerRank

import scala.io.StdIn.readLine

import scala.io.StdIn.readLine
object Solution {

  def main(args: Array[String]) {
    val number_to_achieve:Int=readLine().split(" ")(0).toInt;
    // println("please enter the array elements in single line")
    val given_array=readLine().split(" ").map(x=>x.toInt)
    //sorting the input array in descending order
    val sorted_array_desc=given_array.sorted.reverse
    //calling calculate_factors method
    println(calculate_factors(sorted_array_desc,number_to_achieve))
  }
  def calculate_factors(sorted_arr:Array[Int],number_to_achieve:Int):String=
  {

    var required_num: Int = number_to_achieve
    var output_list: List[Int] = List(required_num)
    var index: Int = 0
    while (index <= sorted_arr.length - 1 && required_num > 1)
    {
      if (required_num % sorted_arr(index) == 0) {
        required_num = required_num / sorted_arr(index)
        output_list = required_num :: output_list
      }
      else {
        index = index + 1
      }

    }
    if (required_num == 1)
      output_list.mkString(" ")
    else
      "-1"
  }
}

