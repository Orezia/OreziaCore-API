plugins {
    this.`java-library`
    this.`maven-publish`
    this.id("co.uzzu.dotenv.gradle") version "1.2.0"
}

// region properties

// Properties from file `gradle.properties`

/**
 * Version of the plugin.
 */
val pluginVersion: String by project

/**
 * GitHub username. Gets from system environment (GITHUB_ACTOR) or .env file (USERNAME).
 */
val githubUsername: String = System.getenv("GITHUB_ACTOR") ?: env.USERNAME.value

/**
 * GitHub token. Gets from system environment (GITHUB_TOKEN) or .env file (TOKEN).
 */
val githubToken: String = System.getenv("GITHUB_TOKEN") ?: env.TOKEN.value

// endregion

group = "fr.orezia.mc"
version = pluginVersion

java {
    this.sourceCompatibility = JavaVersion.VERSION_16
    this.targetCompatibility = JavaVersion.VERSION_16
    this.withSourcesJar()
    this.withJavadocJar()
}

repositories {
    this.mavenCentral()
    this.mavenLocal()
    this.maven {
        this.url = uri("https://papermc.io/repo/repository/maven-public/")
    }
    this.maven {
        this.name = "sonatype"
        this.url = uri("https://oss.sonatype.org/content/groups/public/")
    }
    this.maven {
        this.url = uri("https://jitpack.io")
    }
    this.maven {
        this.url = uri("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    }
}

dependencies {
    this.api("org.jetbrains:annotations:22.0.0")
    this.api("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT") {
        // Remove transitive dependency `common-lang`, we use `common-lang3`
        exclude("commons-lang")
    }
    this.api("org.bstats:bstats-bukkit:2.2.1")
    this.api("org.apache.commons:commons-lang3:3.12.0")
}

publishing {
    this.repositories {
        // Core-API repository (for publishing)
        this.maven {
            this.name = "GitHubPackages"
            this.url = uri("https://maven.pkg.github.com/Orezia/OreziaCore-API")
            this.credentials {
                this.username = githubUsername
                this.password = githubToken
            }
        }
    }
    publications {
        create<MavenPublication>("gpr") {
            from(components.findByName("java"))
        }
    }
}