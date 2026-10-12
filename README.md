# TrimCheck Android — private demo

This is a **real Android WebView application source project**, wrapping the working offline TrimCheck 0.5 HTML demo. The app is not yet compiled into an APK in this environment because the Android SDK/Gradle toolchain is unavailable here.

## Build without a computer (using GitHub in your Android browser)
1. Create a **private** GitHub repository, e.g. `trimcheck-android`.
2. Upload the contents of this project (not the outer folder) to the repository. The `.github/workflows/android-apk.yml` file must retain its folder path. GitHub's web upload interface may not preserve nested folder paths conveniently on Android; GitHub Codespaces can unzip and commit the project more easily.
3. In GitHub, open **Actions → Build private TrimCheck APK → Run workflow**. It also runs when you push to `main`.
4. Open the successful run, under **Artifacts** download `TrimCheck-Android-Demo-APK` (ZIP). Extract `app-debug.apk` and install it on your phone. Android may ask you to allow installs from your browser or Files app.

This debug APK is for **private testing only**, not a Google Play release. For Play Store publication, configure an owned package name, signing key, privacy/data policy, and release AAB. Keep your production signing key safe.

## Demo details
- Offline HTML app bundled inside APK; no network permission.
- Brand: TrimCheck; 3 navigation choices; synthetic demo vehicle database.
- All stock and equipment fictional/unverified.
- Saved searches use local WebView storage and are not synced to Chrome.
- Native Android sharing of demonstration summaries.
- No external vehicle database or stock integration.
