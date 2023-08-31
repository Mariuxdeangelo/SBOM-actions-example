# SBOM in CI/CD with Github actions

This is just a little project where i try to figure out how to use Github Actions to generate a SBOM. This are my results so far.

### Syft
Syft worked best for me. Just add the action and get a artifact with the run you can download. Also the SBOM looks good. It contains some information about dependencies and stuff. Also looks well maintained. [Syft action](https://github.com/anchore/sbom-action)

### CdxGen
Unfortunatly CdxGen github action was discontinued. Also i was not able to make the action work. I get errorrs that it can't read my Gradle Files. That might be because CdxGen can not work with newer versions of Gradle. [CdxGen action](https://github.com/CycloneDX/cdxgen-action)

### Trivy
Trivy works but does not produce a real SBOM. There is no information about dependencies or other stuff. Also i was not able to deduct what SBOM i got. There was no information about type (SPDX or CycloneDx) or Version (1.4/ 1.5 2.2/2.3) [Trivy action](https://github.com/aquasecurity/trivy-action)

### Microsoft SBOM-Tool
[Microsoft-SBOM-Tool action](https://github.com/microsoft/sbom-tool/blob/main/docs/setting-up-github-actions.md)