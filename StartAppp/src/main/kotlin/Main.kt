fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // var 일반적으로 통용되는 변수 언제든지 읽기 쓰기가 가능함 vs val 선언시에만 초기화 가능 중간에 값을 변경할수 없음

   var intArr = arrayOf(1,2,3,4,5)
    var nullArr = arrayOfNulls<Int>(5)
    println(intArr[2])
    println(add(5,6,7))
}


/*fun add (a:Int,b:Int,c:Int):Int{

    return a+b+c
}*/
 fun add (a:Int,b:Int,c:Int) =a +b+c