# Shape Layout Gradient

Modern reconstruction of the solved Shapes Drawables exercise: a layout background built entirely from an XML shape/gradient drawable.

## Modernization

This repository isolates one historical classroom exercise into a clean, buildable Android project. It uses Java 17, AndroidX/AppCompat 1.8.0, View Binding, AGP 9.3.0, compile/target SDK 37, min SDK 23, and GitHub Actions running unit tests, Android Lint, and a debug build.

The visual requirement remains implemented with Android XML resources rather than being replaced by runtime drawing code, because XML drawables are the subject of the exercise.

See [`docs/ORIGINAL_REVIEW.md`](docs/ORIGINAL_REVIEW.md) for the assessment of the original material.

## Build

```bash
gradle testDebugUnitTest lintDebug assembleDebug
```
