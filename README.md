# Orezia Core API

![Java version](https://img.shields.io/badge/java-^17-yellow)
![MC version](https://img.shields.io/badge/MC-v1.18.1-green)
[![GitHub release](https://img.shields.io/badge/release-vX-blue)](https://github.com/dederobert/OreziaCore-API/releases/tag/X)

[![Maven build](https://github.com/Orezia/OreziaCore-API/actions/workflows/maven_build.yml/badge.svg)](https://github.com/Orezia/OreziaCore-API/actions/workflows/maven_build.yml)

Public API for the `OreziaCore` plugin.

[Version française](./LISEZMOI.md)

## Table of contents :

- [Integrating](#integrating-)
  - [Soft-dependency](#soft-dependency-)
  - [Hard-dependency](#hard-dependency-)
- [Version](#version-)

## Integrating :

In order to integrate your plugin with `OreziaCore`, you have to add `OreziaCore-API` as dependency of your project.

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

### Soft-dependency :

In order to add `OreziaCore` as soft-dependency, you have to shade the dependency `OreziaCore-API` in your plugin (i.e. include the dependency in your plugin JAR).

### Hard-dependency :

If your plugin is hard-dependent on `OreziaCore`, you can consider the dependency `OreziaCore-API` as provided.

## Version :

- __1.0__
  - \+ Annotation `@UnsafeStaticInitialization` 
  - \+ Annotation `@SafeStaticInitialization` 
  - \+ Definition of core configurations and messages
  - \+ Definition of the reload event
  - \+ Annotation for cascading operations on entities
  - \+ Annotation for transient fields
  - \+ Annotation for public API
  - \+ Definition of a command expert
  - \+ Definition of a command
  - \+ Definition of a reloadable plugin
  - \+ Definition of an Orezia plugin
