package HackerRank

//import scala.io.StdIn.readLine
//
import scala.io.StdIn.readLine
object Solution11 {

  def main(args: Array[String]) {

    //println("please enter the input string")
    val input_string:String=readLine()
    //Calling count_calculator function and printing the output
    print(count_calculator(input_string))

  }
  def count_calculator(input_string:String):StringBuffer=
  {
    var output_string=new StringBuffer()
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
        output_string.append(concerned_char)
      else
        output_string.append(concerned_char+count.toString)
      index+=1
    }
    output_string
  }
}
//
