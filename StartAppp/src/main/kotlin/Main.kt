fun main(args: Array<String>) {
    //println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // var 일반적으로 통용되는 변수 언제든지 읽기 쓰기가 가능함 vs val 선언시에만 초기화 가능 중간에 값을 변경할수 없음

/*   var intArr = arrayOf(1,2,3,4,5)
    var nullArr = arrayOfNulls<Int>(5)
    println(intArr[2])
    println(add(5,6,7))*/

    /*for (i in 0..9 step 3 ){
        print(i)
        //3의배수만 출력 for문 1 ~9까지 3의배수 출력
    }*/

   /* for (i in 'a'..'e'){
        print(i)
    }*/
   /* for (i in 9 downTo 0 step 3){
        println(i)
    }*/
   /* for (i in 1..10){
        if (i ==3) break
        println(i)
    }*/
  /*  loop@for (i in 1..10){
        for (j in 1..10){
            if (i==1 && j==2) break@loop
            println("i: $i, j:$j")
        }
    }
//var a =Person("박보영",1990)
   var a = Animal("별이",5,"개")
    var b = Dog("별이",5)
    a.introduce()
    b.introduce()
    b.bark()*/

  /* var d =Dog()
    d.run()
    d.eat()*/
}


/*fun add (a:Int,b:Int,c:Int):Int{

    return a+b+c
}*/
/* fun add (a:Int,b:Int,c:Int) =a +b+c*/

/*
class Person(var name:String, val birthYear:Int){
 init {
     println("안녕하세요,${this.birthYear}년생,${this.name}입니다.")
 }
constructor(name:String) :this(name,1997){
    println("보조생성자가 사용되었습니다.")
}
}*/
/*
open class Animal(var name: String,var age:Int,var type:String){
fun  introduce(){
    print("저는 ${type} ${name}이고,${age}살 입니다.")

}
}
class Dog (name: String,age:Int):Animal(name,age,"개")
{
    fun bark(){
        println("멍멍")
    }
}*/

/*
abstract class Animal{
    abstract fun eat()
   fun sniff(){
       println("킁킁")
   }

}
class Rabbit:Animal(){
    override fun eat() {
       println("당근을 먹습니다")
    }
}*/

/*interface Runner{
    fun run()
}
interface Eater{
    fun eat(){
        println("음식을 먹습니다")
    }
}
class Dog:Runner,Eater{
    override fun run() {
        println("우다다 뜁니다")
    }

    override fun eat() {
        println("허겁지겁먹습니다.")
    }
}*/

