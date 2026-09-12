package com.example.ela2.data

import com.example.ela2.R

object ExampleRepository {
    val examples = listOf(
        // MEGA Examples (Submenu 3.1)
        Example("ex1", "Example 1: Capacitive Sensor Piano", R.string.code_ex_1, R.drawable.connection_examples3_1_1, "https://www.youtube.com/watch?v=A0JoCosAPT8", "MEGA"),
        Example("ex2", "Example 2: Water Level Sensor", R.string.code_ex_2, R.drawable.connection_examples3_1_2, "https://www.youtube.com/watch?v=rdadoMGVQoQ", "MEGA"),
        Example("ex3", "Example 3: Countdown Timer", R.string.code_ex_3, R.drawable.connection_examples3_1_3, "https://www.youtube.com/watch?v=5Ryw650tDwY", "MEGA"),
        
        // UNO Examples (Submenu 3.2)
        Example("ex4", "Example 4: Blinking with Transistor", R.string.code_ex_4, R.drawable.connection_examples3_2_1, "https://www.youtube.com/watch?v=VqfPNENyrEs", "UNO"),
        Example("ex5", "Example 5: 4-Digit 7-Segment LED Display", R.string.code_ex_5, R.drawable.connection_examples3_2_2, "https://www.youtube.com/watch?v=CitcX6gJQRs", "UNO"),
        Example("ex6", "Example 6: Light Detecting Servo Motor", R.string.code_ex_6, R.drawable.connection_examples3_2_3, "https://www.youtube.com/watch?v=mSvN8ngRW9I", "UNO"),
        
        // NANO Examples (Submenu 3.3)
        Example("ex7", "Example 7: Polygraph with Serial Plotter", R.string.code_ex_7, R.drawable.connection_examples3_3_1, "https://www.youtube.com/watch?v=d6MoIg0VJOM", "NANO"),
        Example("ex8", "Example 8: Windows CPU & RAM Monitoring", R.string.code_ex_8, R.drawable.connection_examples3_3_2, "https://www.youtube.com/watch?v=d-Em3nUdov0", "NANO"),
        Example("ex9", "Example 9: Ultrasonic Sensor", R.string.code_ex_9, R.drawable.connection_examples3_3_3, "https://www.youtube.com/watch?v=QUSUySVf8Bg", "NANO")
    )

    fun getExamplesByCategory(category: String): List<Example> {
        return examples.filter { it.category == category }
    }

    fun getExampleById(id: String): Example? {
        return examples.find { it.id == id }
    }
}
