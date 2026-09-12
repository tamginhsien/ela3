with open('app/src/main/java/com/example/ela2/data/ExampleAdapter.kt', 'r', encoding='utf-8') as f:
    code = f.read()

code = code.replace('import android.widget.ImageButton', '')
code = code.replace('val buttonCopy: ImageButton =', 'val buttonCopy: View =')

with open('app/src/main/java/com/example/ela2/data/ExampleAdapter.kt', 'w', encoding='utf-8') as f:
    f.write(code)
