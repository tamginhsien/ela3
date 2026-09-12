import re

for i in [2, 3]:
    filename = f'app/src/main/res/layout/activity_submenu3{i}.xml'
    with open(filename, 'r', encoding='utf-8') as f:
        xml = f.read()

    ex_start = (i - 1) * 3 + 1
    
    for ex in range(ex_start, ex_start + 3):
        xml = re.sub(
            fr'(<TextView\s+android:layout_width=\"match_parent\"\s+android:layout_height=\"wrap_content\"\s+android:text=\"@string/code_ex_{ex}\")',
            fr'\g<1> android:id=\"@+id/codeEx{ex}\"', 
            xml
        )
    
    with open(filename, 'w', encoding='utf-8') as f:
        f.write(xml)
