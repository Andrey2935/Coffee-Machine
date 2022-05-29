package machine

fun main() {
    var water = 400
    var milk = 540
    var beans = 120
    var dispCups = 9
    var money = 550
    while (true) {
        print("Write action (buy, fill, take, remaining, exit): ")
        val action = readln()
        println(action)
        when (action) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                val actionBuy = readln()
                println(actionBuy)
                when {
                    actionBuy == "back" -> println()
                    actionBuy.toInt() == 1 -> {
                        if (water < 250) println("Sorry, not enough water!")
                        else if (beans < 16) println("Sorry, not enough coffee beans!")
                        else if (dispCups < 1) println("Sorry, not enough disposable cups!")
                        else {
                            water -= 250
                            beans -= 16
                            dispCups--
                            money += 4
                            println("I have enough resources, making you a coffee!")
                        }
                    }
                    actionBuy.toInt() == 2 -> {
                        if (water < 350) println("Sorry, not enough water!")
                        else if (milk < 75) println("Sorry, not enough milk!")
                        else if (beans < 20) println("Sorry, not enough coffee beans!")
                        else if (dispCups < 1) println("Sorry, not enough disposable cups!")
                        else {
                            water -= 350
                            milk -= 75
                            beans -= 20
                            dispCups--
                            money += 7
                            println("I have enough resources, making you a coffee!")
                        }
                    }
                    actionBuy.toInt() == 3 -> {
                        if (water < 200) println("Sorry, not enough water!")
                        else if (milk < 100) println("Sorry, not enough milk!")
                        else if (beans < 12) println("Sorry, not enough coffee beans!")
                        else if (dispCups < 1) println("Sorry, not enough disposable cups!")
                        else {
                            water -= 200
                            milk -= 100
                            beans -= 12
                            dispCups--
                            money += 6
                            println("I have enough resources, making you a coffee!")
                        }
                    }
                }

            }
            "fill" -> {
                print("Write how many ml of water do you want to add: ")
                val upWater = readln().toInt()
                println(upWater)
                water += upWater
                print("Write how many ml of milk do you want to add: ")
                val upMilk = readln().toInt()
                println(upMilk)
                milk += upMilk
                print("Write how many grams of coffee beans do you want to add: ")
                val upBeans = readln().toInt()
                println(upBeans)
                beans += upBeans
                print("Write how many disposable cups of coffee do you want to add: ")
                val upDispCups = readln().toInt()
                println(upDispCups)
                dispCups += upDispCups
                println()
            }
            "take" -> {
                println("I gave you $$money")
                money = 0
            }
            "remaining" -> {
                printBalance(water, milk, beans, dispCups, money)
            }
            "exit" -> break
        }
    }
}

fun printBalance(water: Int, milk: Int, beans: Int, dispCups: Int, money: Int) {
    println(
        """
        The coffee machine has:
        $water ml of water
        $milk ml of milk
        $beans g of coffee beans
        $dispCups disposable cups
        $$money of money
        
    """.trimIndent()
    )
}
