import re

with open('app/src/main/res/layout/activity_submenu31.xml', 'r', encoding='utf-8') as f:
    xml = f.read()

xml = re.sub(r'(<TextView\s+android:layout_width=\"match_parent\"\s+android:layout_height=\"wrap_content\"\s+android:text=\"@string/code_ex_1\")', r'\1 android:id=\"@+id/codeEx1\"', xml)
xml = re.sub(r'(<TextView\s+android:layout_width=\"match_parent\"\s+android:layout_height=\"wrap_content\"\s+android:text=\"@string/code_ex_2\")', r'\1 android:id=\"@+id/codeEx2\"', xml)
xml = re.sub(r'(<TextView\s+android:layout_width=\"match_parent\"\s+android:layout_height=\"wrap_content\"\s+android:text=\"@string/code_ex_3\")', r'\1 android:id=\"@+id/codeEx3\"', xml)

with open('app/src/main/res/layout/activity_submenu31.xml', 'w', encoding='utf-8') as f:
    f.write(xml)
