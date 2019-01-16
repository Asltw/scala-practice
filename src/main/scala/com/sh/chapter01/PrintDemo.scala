package com.sh.chapter01

object PrintDemo {
  def main(args: Array[String]): Unit = {
    val str1: String = "hello"
    val str2: String = " word!"
    println(str1 + str2)

    val name: String = "tom"
    val age: Int = 27
    val sal: Float = 10.65f
    val height: Double = 180.15

    printf("名字=%s 年龄=%d 薪水=%f 身高=%f", name, age, sal, height) // 保留小数点2位：%.2f

    // scala支持使用$输出内容
    println(s"个人信息如下：\n 名字$name \n年龄$age \n薪水$sal")
    // 如果在字符串中出现了类似${age + 10} 则表示大括号中是一个表达式
    println(s"个人信息如下：\n 名字$name \n年龄${age - 2} \n薪水${sal * 100}")

    val ints = new Array[Int](10)
  }
}
