fun main(args: Array<String>) {
    //task1
    fun printFullName(firstName: String, lastName: String) {
        val fullName = "$firstName $lastName"
        println(fullName)
    }
    val firstName = "Kirya"
    val lastName = "Artem"
    printFullName(firstName, lastName)
//task2
    printFullName(firstName = firstName, lastName = lastName)
    //task3
    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }
    val fullName = calculateFullName(firstName, lastName)
    println(fullName)
    //task4
    fun CalculateFullName(firstName: String, lastName: String): Pair<String, Int> {
        val FullName = "$firstName $lastName"
        val fullNameLength = fullName.length
        return Pair(FullName, fullNameLength)
    }
    val result = CalculateFullName(firstName, lastName)
    val FullName = result.first
    val fullNameLength = result.second
    println("Полное имя: $FullName")
    println("Длина имени: $fullNameLength")
    //task5
    fun isPrime(number: Int): Boolean {
        if (number <= 1) return false
        if (number <= 3) return true
        if (number % 2 == 0 || number % 3 == 0) return false

        var i = 5
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) return false
            i += 6
        }

        return true
    }
    val num = 17
    val isPrimeNum = isPrime(num)
    if (isPrimeNum) {
        println("$num - простое число")
    }
    else {
        println("$num - не простое число")
    }
    //task6
    fun fibonacci(n: Int): Int {
        if (n <= 0) return 0
        if (n == 1 || n == 2) return 1

        var prev = 1
        var current = 1

        for (i in 3..n) {
            val next = prev + current
            prev = current
            current = next
        }

        return current
    }
    val n = 10 //Номер элемента последовательности, который надо найти
    val fibValue = fibonacci(n)
    println("Значение $n-го элемента последовательности Фибоначчи: $fibValue")
}