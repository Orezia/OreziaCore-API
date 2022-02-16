# Orezia Core API

![Java version](https://img.shields.io/badge/java-^17-yellow)
![MC version](https://img.shields.io/badge/MC-v1.18.1-green)
[![GitHub release](https://img.shields.io/badge/release-vX-blue)](https://github.com/dederobert/OreziaCore-API/releases/tag/X)

[![Maven build](https://github.com/Orezia/OreziaCore-API/actions/workflows/maven_build.yml/badge.svg)](https://github.com/Orezia/OreziaCore-API/actions/workflows/maven_build.yml)

API publique pour le plugin `OreziaCore`.

[English version](./README.md)

## Table des matières :

- [Intégration](#intergration-)
  - [Soft-dépendance](#soft-dependance-)
  - [Hard-dépendance](#hard-dependance-)
- [Version](#version-)

## Intégration :

Pour intégrer votre plugin avec `OreziaCore`, vous devez ajouter `OreziaCore-API` parmi les dépendances de votre projet.

Maven :

```xml
<repositories>
  <repository>
    <id>github-orezia-core-api</id>
    <url>https://maven.pkg.github.com/Orezia/OreziaCore-API</url>
  </repository>
</repositories>
```
```xml
<dependencies>
  <dependency>
    <groupId>fr.orezia.mc</groupId>
    <artifactId>oreziacore-api</artifactId>
    <version>VERSION</version>
  </dependency>
</dependencies>
```

Gradle :

```groovy
repositories {
    maven {
        name = "GithubOreziaCoreApi"
        url = uri("https://maven.pkg.github.com/Orezia/OreziaCore-API")
    }
}
```
```groovy
dependencies {
    implementation group: 'fr.orezia.mc', name: 'OreziaCore-API', version: VERSION
}
```

### Soft-dépendance :

Pour être soft-dépendant d'`OreziaCore`, vous devez embarquer la dépendance `OreziaCore-API` dans votre plugin (c'est-à-dire inclure la dépendance dans le JAR de votre plugin).

### Hard-dépendance :

Si votre plugin est hard-dépendant d'`OreziaCore`, vous pouvez considérer la dépendance `OreziaCore-API` comme "provided".

## Version :

- __1.0__
    - TODO
