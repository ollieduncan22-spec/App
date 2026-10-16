# SpecTrim Android — live web test wrapper

This app loads https://ollieduncan22-spec.github.io/Trimcheck-Test/index.html in an Android WebView. Changes published to that site can appear in the app on reload (subject to caching). This is a TEST endpoint, not the production site.

## Build
Upload these files to the existing App repository, preserving paths. GitHub Actions > Build SpecTrim Android APK > Run workflow. Download the SpecTrim-Live-Android-APK artifact, extract it, and install app-debug.apk.

## Important limitations
- **Icon not yet rebranded:** `app/src/main/res/drawable/trimcheck_icon.png` is the old icon from the source ZIP. Replace it with the approved ST icon artwork before building a final branded APK. The manifest still points to this filename.
- This workflow produces a **debug-signed APK**. A new runner may use a different signing key, preventing in-place upgrades. Keep the old APK until the new one is tested; uninstalling loses local app data. A stable release keystore is required for reliable upgrades.
- The project was not compiled or tested against a real Android device here.
- Network access is required; no offline fallback. The website, Supabase configuration, and role permissions must be independently tested.
- Website updates appear when the WebView reloads; there is no native automatic APK update mechanism.
- External links open outside the app. If the login flow relies on external identity providers or callback URLs, test them carefully.
