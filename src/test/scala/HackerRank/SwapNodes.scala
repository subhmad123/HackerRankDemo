package HackerRank

import scala.io.StdIn.{readInt, readLine}

import scala.io.StdIn.{readInt, readLine}
object Solution {
  //creating left and right node array for storing child node index of every node
  val left_nodes=new Array[Int](2000)
  val right_nodes=new Array[Int](2000)
  //output array stores the traversal output of the tree
  val output_array=new Array[Int](2000)
  var output_array_index:Int=0


  def main(args: Array[String]) {
    take_inputs()
  }
  /**
   *this function takes inputs from the user and stores child nodes indexes in left and right node arrays. For each input testcase,it calls swap function and then traverses the tree
   */
  def take_inputs(): Unit =
  {
    val number_of_nodes=readInt()
    for(parent_node<-1 to number_of_nodes)
    {
      //for each line of child index input, splitting it with space
      val array_input=(readLine().split(" ").map(_.toInt))
      //storing child node index at same index of parent
      left_nodes(parent_node)=array_input(0)
      right_nodes(parent_node)=array_input(1)
    }


    val no_of_depths_for_swapping=readInt()
    for(j<-1 to no_of_depths_for_swapping)
    {
      val depth_to_swap=readInt();
      //calling swap_nodes function,starting with root node and passing depth of root node
      swap_nodes(1,1,depth_to_swap);
      //passing starting index to store the tree status starting from leftmost part of the tree
      output_array_index=0
      current_status_tree(1)
      println(output_array.take(number_of_nodes).mkString(" "));
    }
  }


  /**
   *this function make recursive calls to reach most depth of tree and then moves upwards one by one depth and checks whether we have to swap the nodes in that depth.If yes,then it swaps the nodes
   * @param position_in_array     this variable acts as position initially but second run onwards starts taking values stored in left and right array
   * @param current_depth
   * @param depth_to_swap
   */

  def swap_nodes(position_in_array:Int,current_depth:Int,depth_to_swap:Int): Unit ={
    if(position_in_array!=(-1)){
      swap_nodes(left_nodes(position_in_array),current_depth+1,depth_to_swap)
      swap_nodes(right_nodes(position_in_array),current_depth+1,depth_to_swap)

      if(current_depth%depth_to_swap==0){
        val tmp=left_nodes(position_in_array)
        left_nodes(position_in_array)=right_nodes(position_in_array)
        right_nodes(position_in_array)=tmp
      }
    }
  }

  /**
   * this function traverses the tree
   * @param index_val
   */
  def current_status_tree(index_val:Int): Unit ={
    if(index_val!=(-1)){
      //calling recursively to reach till leftmost part of the tree
      current_status_tree(left_nodes(index_val))
      output_array(output_array_index)=index_val
      //stored the value of the root node of the current node system and then increasing the index to store right child value
      output_array_index+=1
      current_status_tree(right_nodes(index_val))

    }
  }
}
