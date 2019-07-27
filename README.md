# fat-aar-sample
Example of [fat-aar](https://github.com/cpdroid/fat-aar) plugin.

## Usage
Run gradle task:
```gradle
gradlew :mylibrary:deployFreeRelease
```
this will build project *mylirary* to aar file and copy the aar file to *app/libs* directory, then you can use the embedded dependency in the app module
