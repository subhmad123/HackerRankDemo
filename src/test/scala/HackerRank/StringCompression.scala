package HackerRank

import scala.io.StdIn.readLine

object StringCompression extends App{
  println("please enter the input string")
  val input_string:String=readLine()
  //Calling count_calculator function and printing the output
  print(count_calculator(input_string))


  /**
   * this function returns the frequency of each letter in the word
   * @param input_string
   * @return
   */
  def count_calculator(input_string:String):String=
  {
       var output_string:String=""
       var index=0
       while (index <= input_string.length - 1)
       {
           val concerned_char=input_string(index)
           var count=1
           var intermediate_count=index
           while(intermediate_count+1<=input_string.length - 1 && input_string(intermediate_count) == input_string(intermediate_count+1))
           {
               count += 1
               intermediate_count += 1
           }
           index=intermediate_count
           if(count==1)
             output_string+=concerned_char
           else
             output_string+=(concerned_char+count.toString)
           index+=1
       }
         output_string
  }


}
