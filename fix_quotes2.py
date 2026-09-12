for i in [1, 2, 3]:
    filename = f'app/src/main/res/layout/activity_submenu3{i}.xml'
    with open(filename, 'r', encoding='utf-8') as f:
        xml = f.read()
    xml = xml.replace('codeEx1\\"', 'codeEx1"')
    xml = xml.replace('codeEx2\\"', 'codeEx2"')
    xml = xml.replace('codeEx3\\"', 'codeEx3"')
    xml = xml.replace('codeEx4\\"', 'codeEx4"')
    xml = xml.replace('codeEx5\\"', 'codeEx5"')
    xml = xml.replace('codeEx6\\"', 'codeEx6"')
    xml = xml.replace('codeEx7\\"', 'codeEx7"')
    xml = xml.replace('codeEx8\\"', 'codeEx8"')
    xml = xml.replace('codeEx9\\"', 'codeEx9"')
    with open(filename, 'w', encoding='utf-8') as f:
        f.write(xml)
