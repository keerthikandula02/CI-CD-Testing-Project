# Test Results

GitHub Actions generates Maven Surefire XML reports under `target/surefire-reports/`. The workflow uploads them as a build artifact even when a test fails, using `if: always()`.

Use the Actions tab to inspect real execution history after pushing a commit.
