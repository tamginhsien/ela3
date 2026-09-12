with open('app/src/main/java/com/example/ela2/data/ExampleAdapter.kt', 'r', encoding='utf-8') as f:
    code = f.read()

code = code.replace('inflate(R.id.item_example', 'inflate(R.layout.item_example')
code = code.replace('putExtra("EXAMPLE_ID", "\ (\)")', 'putExtra("EXAMPLE_ID", example.title + " (" + example.category + ")")')

with open('app/src/main/java/com/example/ela2/data/ExampleAdapter.kt', 'w', encoding='utf-8') as f:
    f.write(code)
