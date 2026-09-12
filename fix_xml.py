with open('app/src/main/res/layout/item_example.xml', 'r', encoding='utf-8') as f:
    xml = f.read()

xml = xml.replace('<ImageView\n            android:id="@+id/imageWiring"', '<com.github.chrisbanes.photoview.PhotoView\n            android:id="@+id/imageWiring"')
xml = xml.replace('android:layout_marginBottom="16dp" />', 'android:layout_marginBottom="16dp" />\n\n        <TextView\n            android:layout_width="match_parent"\n            android:layout_height="wrap_content"\n            android:text="(Pinch to zoom diagram)"\n            android:textAlignment="center"\n            android:textSize="12sp"\n            android:textColor="#888888"\n            android:layout_marginTop="-12dp"\n            android:layout_marginBottom="16dp"/>')

with open('app/src/main/res/layout/item_example.xml', 'w', encoding='utf-8') as f:
    f.write(xml)
