package com.example.exampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataList: Map<String, Any> = mapOf(
            "testNumberOrder" to 1,
            "testTimeOrder" to "21 октября, 12:00",
            "testSumOrder" to 450.0,
            "testCountGoods" to 8,
            "testStreet" to "Василенко",
            "testHomeNumber" to "21/1",
            "testEntrance" to "4",
            "testFloor" to "4",
            "testApartment" to "112",
            "testTimeCompleted" to 60
        )

        val order = createTestClass(dataList)
        pushTestData(order)
    }

    private fun createTestClass(dataList: Map<String, Any>): Order {
        return Order(
            dataList["testNumberOrder"] as Int,
            dataList["testTimeOrder"] as String,
            dataList["testSumOrder"] as Double,
            dataList["testCountGoods"] as Int,
            dataList["testStreet"] as String,
            dataList["testHomeNumber"] as String,
            dataList["testEntrance"] as String,
            dataList["testFloor"] as String,
            dataList["testApartment"] as String,
            dataList["testTimeCompleted"] as Int
        )
    }

    private fun pushTestData(order: Order) {
        numberOrder.text = getString(R.string.number_order, order.numberOrder)
        timeOrder.text = getString(R.string.time_order, order.timeOrder)
        sumOrder.text =
            getString(R.string.sum_order, order.countGoods, order.sumOrder)
        numOrder.text = getString(R.string.number_order, order.numberOrder)
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
}
