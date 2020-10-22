package com.example.exampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var test_time_order = "21 октября, 12:00"
        var test_sum_order = 450.0
        var test_count_goods = 8
        var test_street: String = "Василенко"
        var test_home_number: String = "21/1"
        var test_entrance: String = "4"
        var test_floor: String = "4"
        var test_apartment: String = "112"
        var test_time_comleted: Int = 60

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

            val order1 = Order(
                1,
                test_time_order,
                test_sum_order,
                test_count_goods,
                test_street,
                test_home_number,
                test_entrance,
                test_floor,
                test_apartment,
                test_time_comleted
            )
            return order1
        }

        fun pushTestData(order: Order) {
            numberOrder.text = order.numberOrder.toString()
            timeOrder.text = order.timeOrder.toString()
            numOrder.text = order.numberOrder.toString()
            sumOrder.text = "${order.countGoods.toString()} товаров,  ${order.sumOrder.toString()}"
            timeCompleted.text = "${order.timeCompleted.toString()} минут"
            addressOrder.text = "Ул. ${order.street} ${order.homeNumber}, ${order.entrance}п., ${order.floor} этаж, кв.${order.apartment}"



        }

        val order = createTestClass()
        pushTestData(order)
    }
}
