with open('app/src/main/res/layout/item_example.xml', 'r', encoding='utf-8') as f:
    xml = f.read()

old_xml = '''            <ImageButton
                android:id="@+id/buttonCopy"
                android:layout_width="48dp"
                android:layout_height="48dp"
                android:layout_gravity="top|end"
                android:background="?attr/selectableItemBackgroundBorderless"
                android:src="@android:drawable/ic_menu_copy"
                app:tint="#00979D"
                android:contentDescription="Copy Code"/>'''

new_xml = '''            <com.google.android.material.button.MaterialButton
                android:id="@+id/buttonCopy"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="top|end"
                android:text="COPY"
                android:textColor="#00979D"
                app:rippleColor="#3300979D" />'''

xml = xml.replace(old_xml, new_xml)

with open('app/src/main/res/layout/item_example.xml', 'w', encoding='utf-8') as f:
    f.write(xml)
