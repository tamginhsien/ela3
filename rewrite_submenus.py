template = '''package com.example.ela2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar
import com.example.ela2.data.ExampleAdapter
import com.example.ela2.data.ExampleRepository

class {class_name} : AppCompatActivity() {{
    override fun onCreate(savedInstanceState: Bundle?) {{
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_list)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.title = "Arduino {category} Examples"
        setSupportActionBar(toolbar)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        
        val examples = ExampleRepository.getExamplesByCategory("{category}")
        recyclerView.adapter = ExampleAdapter(examples, this)
    }}
}}
'''

with open('app/src/main/java/com/example/ela2/Submenu3_1.kt', 'w') as f:
    f.write(template.format(class_name='Submenu3_1', category='MEGA'))

with open('app/src/main/java/com/example/ela2/Submenu3_2.kt', 'w') as f:
    f.write(template.format(class_name='Submenu3_2', category='UNO'))

with open('app/src/main/java/com/example/ela2/Submenu3_3.kt', 'w') as f:
    f.write(template.format(class_name='Submenu3_3', category='NANO'))
