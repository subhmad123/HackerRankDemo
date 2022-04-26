package HackerRank

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt

object listReplication
{
        def main(args:Array[String]): Unit =
        {
                  println("Please enter the replication factor")
                  val replication_factor:Int=readInt()
                  println("Please enter the number of elements in the list")
                  val number_of_elements_in_list=readInt()
                  val input_list:ListBuffer[Int]=ListBuffer()
                  println("please enter the elements of the list")
                  for(i<-0 until number_of_elements_in_list)
                  {
                    input_list.addOne(readInt())
                  }
        //calling repetitionCreator function and printing the output received
        println("Here is output\n"+repetitionCreator(replication_factor,input_list).mkString("\n"))

         }


  /**
   *  This function repeats every element in the input list according to desired frequency and returns output_list
   * @param no_of_repetition
   * @param input_list
   * @return
   */
        def repetitionCreator(no_of_repetition:Int, input_list:ListBuffer[Int]): List[Int] =
        {
                  var output_list:List[Int]=List()
                  input_list.map(x=>{
                    for(i<-0 until no_of_repetition)
                    {
                      output_list=output_list:+x
                    }
                  })
                  output_list
        }
}

