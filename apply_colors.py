import re

with open('app/src/main/java/com/example/ela2/MainActivity.kt', 'r', encoding='utf-8') as f:
    code = f.read()

import_statement = "import com.google.android.material.color.DynamicColors\n"
apply_statement = "        DynamicColors.applyToActivitiesIfAvailable(application)\n        super.onCreate(savedInstanceState)"

if "DynamicColors" not in code:
    code = code.replace("import android.os.Bundle", import_statement + "import android.os.Bundle")
    code = code.replace("super.onCreate(savedInstanceState)", apply_statement)

with open('app/src/main/java/com/example/ela2/MainActivity.kt', 'w', encoding='utf-8') as f:
    f.write(code)
