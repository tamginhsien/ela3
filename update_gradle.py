import re

with open('app/build.gradle', 'r', encoding='utf-8') as f:
    gradle = f.read()

# Add PhotoView to dependencies
dependency = "\n    implementation 'com.github.chrisbanes:PhotoView:2.3.0'\n"
if "chrisbanes:PhotoView" not in gradle:
    gradle = gradle.replace('dependencies {', 'dependencies {' + dependency)

with open('app/build.gradle', 'w', encoding='utf-8') as f:
    f.write(gradle)
