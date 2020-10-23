package com.example.exampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testTimeOrder: String = "21 октября, 12:00"
        val testSumOrder = 450.0
        val testCountGoods = 8
        val testStreet: String = "Василенко"
        val testHomeNumber: String = "21/1"
        val testEntrance: String = "4"
        val testFloor: String = "4"
        val testApartment: String = "112"
        val testTimeCompleted: Int = 60

        data class Order(
            val numberOrder: Int,
            val timeOrder: Any,
            val sumOrder: Double,
            val countGoods: Int,
            val street: String,
            val homeNumber: String,
            val entrance: String,
            val floor: String,
            val apartment: String,
            val timeCompleted: Int
        )


        fun createTestClass(): Order {

            return Order(
                1,
                testTimeOrder,
                testSumOrder,
                testCountGoods,
                testStreet,
                testHomeNumber,
                testEntrance,
                testFloor,
                testApartment,
                testTimeCompleted
            )
        }

        val order = createTestClass()

        fun pushTestData(order: Order) {
            numberOrder.text = getString(R.string.number_order, order.numberOrder.toString())
            timeOrder.text = getString(R.string.time_order, order.timeOrder)
            sumOrder.text =
                getString(R.string.sum_order, order.countGoods.toString(), order.sumOrder)
            timeCompleted.text = getString(R.string.time_completed, order.timeCompleted)
            addressOrder.text = getString(
                R.string.address_order,
                order.street,
                order.homeNumber,
                order.entrance,
                order.floor,
                order.apartment
            )

        }

        pushTestData(order)
    }
}
