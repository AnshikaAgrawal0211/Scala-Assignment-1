class Max {
  def FindMax(): Unit={
    val list:List[Int]= List(2,3,4,19)
    var max=list(0)
    for(current<-0 to list.length-1)
      {
        if(list(current)>max)
          max=list(current)
      }
    println(s"$max")
  }


}
