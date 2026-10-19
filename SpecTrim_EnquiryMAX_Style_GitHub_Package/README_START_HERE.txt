SPECTRIM — GitHub-ready interface preview

This ZIP is structured for upload to the root of the existing GitHub repository.

NEW: index.html and app/src/main/assets/index.html render the EnquiryMAX-inspired dashboard.
NEW: classic.html preserves the previous website and its workflows.
UNCHANGED: owner.html, Android project, Gradle and existing assets.

IMPORTANT: The new dashboard currently displays 6 explicitly illustrative vehicles and is NOT connected to Supabase stock or authentication. The legacy pages are retained but must be separately validated. Do not deploy as a live dealer product without backend integration and security testing.

GitHub: upload the contents of this ZIP at repository ROOT, replacing files with the same names. GitHub Pages should serve index.html. Rebuild APK through existing GitHub Actions to see the new Android WebView interface. Existing APK installs do not auto-update.
