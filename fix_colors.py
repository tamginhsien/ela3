import os

files = [
    'app/src/main/res/layout/activity_example_list.xml',
    'app/src/main/res/layout/item_example.xml'
]

for file in files:
    with open(file, 'r', encoding='utf-8') as f:
        xml = f.read()
    
    xml = xml.replace('android:background="#F5F7FA"', 'android:background="?attr/colorSurface"')
    xml = xml.replace('android:background="#00979D"', 'android:background="?attr/colorPrimary"')
    xml = xml.replace('app:cardBackgroundColor="@android:color/white"', 'app:cardBackgroundColor="?attr/colorSurface"')
    xml = xml.replace('android:textColor="#00979D"', 'android:textColor="?attr/colorPrimary"')
    xml = xml.replace('android:backgroundTint="#00979D"', 'android:backgroundTint="?attr/colorPrimary"')
    xml = xml.replace('app:tint="#00979D"', 'app:tint="?attr/colorPrimary"')
    
    with open(file, 'w', encoding='utf-8') as f:
        f.write(xml)
