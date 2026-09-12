with open('app/build.gradle', 'r') as f:
    s = f.read()
s = s.replace('compileSdk 34', 'compileSdk 36')
s = s.replace('targetSdk 34', 'targetSdk 36')
with open('app/build.gradle', 'w') as f:
    f.write(s)
