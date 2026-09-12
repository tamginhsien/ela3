import re

with open('C:/Users/User/.gemini/antigravity/brain/0cf47af9-12b0-4053-b29d-8c4989b84bd7/task.md', 'r', encoding='utf-8') as f:
    text = f.read()

text = text.replace('- [ ] Implement Zoomable/Pannable Image Viewer for Wiring Diagrams', '- [x] Implement Zoomable/Pannable Image Viewer for Wiring Diagrams')
text = text.replace('- [ ] Upgrade to Material You (Dynamic System Colors)', '- [x] Upgrade to Material You (Dynamic System Colors)')
text = text.replace('- [ ] Implement Single-Activity Architecture (Jetpack Navigation Component)', '- [x] Implement Single-Activity Architecture (Jetpack Navigation Component)')

with open('C:/Users/User/.gemini/antigravity/brain/0cf47af9-12b0-4053-b29d-8c4989b84bd7/task.md', 'w', encoding='utf-8') as f:
    f.write(text)
