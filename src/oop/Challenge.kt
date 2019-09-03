package oop

import java.util.*

interface Sellable {
    fun sell()
}

abstract class InventoryItem(val name: String, val price: Int, var purchaseDate: Date, var sold: Boolean): Sellable {
    override fun sell() {
        if (!sold) {
            println("Selling this $name")
        } else {
            println("Already sold this $name")
        }
    }

    override fun toString(): String {
        return "InventoryItem(name=$name, price=$price, purchaseDate=$purchaseDate, sold=$sold)"
    }

    abstract fun copy(): InventoryItem
}

class Armor(name: String, price: Int, purchaseDate: Date, val owner: String): InventoryItem(name, price, purchaseDate, false), Sellable {
    fun upgrade() {
        println("Upgrading $name")
    }

    override fun copy(): InventoryItem {
        val copy = Armor(name, price, purchaseDate, owner)
        copy.sold = this.sold
        return copy
    }
}

class Potion(name: String, price: Int, purchaseDate: Date, val cooldown: Int): InventoryItem(name, price, purchaseDate, false), Sellable {

    fun consume() {
        println("Consuming $name potion")
    }

    override fun copy(): InventoryItem {
        val copy = Potion(name, price, purchaseDate, cooldown)
        copy.sold = this.sold
        return copy
    }
}

fun main(args: Array<String>) {
    val armor = Armor("Valyrian", 500, Date(2019, 9,1), "Mars")
    val potion = Potion("HP", 100, Date(2019, 9,2), 10)
    println(armor)
    println(potion)

    armor.upgrade()
    potion.consume()
    armor.sell()
    potion.sell()
}