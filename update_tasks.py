import re

with open('C:/Users/User/.gemini/antigravity/brain/0cf47af9-12b0-4053-b29d-8c4989b84bd7/task.md', 'r', encoding='utf-8') as f:
    text = f.read()

text = text.replace('- [ ] Migrate static strings.xml Arduino code data to a local Room Database', '- [x] Migrate static strings.xml Arduino code data to a local Room Database')
text = text.replace('- [ ] Implement Syntax Highlighting for Arduino Code displays', '- [x] Implement Syntax Highlighting for Arduino Code displays')
text = text.replace('- [ ] Add "Copy Code to Clipboard" & "Share Code" buttons', '- [x] Add "Copy Code to Clipboard" & "Share Code" buttons')

with open('C:/Users/User/.gemini/antigravity/brain/0cf47af9-12b0-4053-b29d-8c4989b84bd7/task.md', 'w', encoding='utf-8') as f:
    f.write(text)
