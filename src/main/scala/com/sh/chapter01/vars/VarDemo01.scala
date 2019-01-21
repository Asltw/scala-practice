package com.sh.chapter01.vars

object VarDemo01 {

  def main(args: Array[String]): Unit = {
    val age: Int = 20;
    val sal: Double = 10.9
    val name: String = "tom"
    val isPass: Boolean = true
    // 在scal中，小数默认为Double类型，整数默认为Int
    val score: Float = 70.9f

    print(s"$age $isPass")
  }

}
