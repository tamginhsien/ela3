for i in [1, 2, 3]:
    filename = f'app/src/main/res/layout/activity_submenu3{i}.xml'
    with open(filename, 'r', encoding='utf-8') as f:
        xml = f.read()
    xml = xml.replace('android:id=\\"@+id/codeEx', 'android:id="@+id/codeEx')
    with open(filename, 'w', encoding='utf-8') as f:
        f.write(xml)
