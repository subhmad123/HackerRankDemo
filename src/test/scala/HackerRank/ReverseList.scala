package HackerRank

import scala.io.StdIn.readInt

object ReverseList{

          def main(args:Array[String]): Unit =
          {
                //taking input from user for number of elements in list to reverse
                println("please enter the number of elements in the list")
                val num: Int = readInt()
                var input_list: List[Int] = List()
                println("please enter list elements one by one")
                for (i <- 0 until num) {
                  input_list = input_list :+ readInt()
                }

                //calling list_reverser method and printing the received output
                println("Output below:-\n"+list_reverser(input_list).mkString("\n"))

          }

  /**
   * this function reverses the content of the list without using reverse function
   * @param input_list
   * @return
   */
          def list_reverser(input_list:List[Int]): List[Int] ={
                 var output_list:List[Int]=List()
                 if(input_list.isEmpty)
                 {
                      List()
                 }
                else
                 {
                      input_list.map(x=>{
                        output_list=x+:output_list
                      })
                      output_list
                 }
          }
}
