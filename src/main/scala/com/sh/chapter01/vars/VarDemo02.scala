package com.sh.chapter01.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    // 类型推到
    val num = 10 //这时num就是Int类型
    // 证明：方式1，可以利用idea的提示证明
    // 方式2：num.isInstanceof[Int]
    print(num.isInstanceOf[Int])
    // 类型确定后，就不能在修改，说明scala是强类型语言
    // （1）在声明/定义一个变量时，可以使用var 或者 val 来修饰，var 修饰的变量可变， val 修饰的变量不可变
    // （2）因为val 没有线程安全问题，因此效率高，scala的设计者推荐使用val
    // （3）如果对象需改变，则使用var
    val dog = new Dog
    dog.age = 90
    dog.name = "小花"
  }
}

class Dog {
  // 声明一个age属性，给一个默认值 _ 因为类型是Int，所以默认值为0
  var age: Int = _
  // 声明名字
  var name: String = ""
}
