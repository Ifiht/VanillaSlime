plugins {
    id("java")
    id("xyz.jpenilla.run-paper") version "2.3.0"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.evlis"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    } // PaperLib
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") {
        name = "spigotmc-repo"
    } // Spigot-API
    maven("https://jitpack.io") {
        name = "jitpack.io"
    } // ItemsAdder
    maven("https://maven.enginehub.org/repo/") {
        name = "worldedit-repo"
    } // WorldEdit
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi") {
        name = "placeholderapi-repo"
    } // PlaceholderAPI
    maven("https://nexus.neetgames.com/repository/maven-public") {
        name = "mcmmo-repo"
    } // mcMMO
    maven("https://repo.walshy.dev/public") {
        name = "walshy-public"
    } // ClearLag
    maven("https://repo.codemc.io/repository/maven-public/") {
        name = "codemc-repo"
    } // Orebfuscator
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
    implementation("org.apache.commons:commons-lang3:3.0")
}

val targetJavaVersion = 21
var javaVersion = JavaVersion.toVersion(targetJavaVersion)

java.sourceCompatibility = javaVersion
java.targetCompatibility = javaVersion

tasks {
    runServer {
        // Configure the Minecraft version for our task.
        // This is the only required configuration besides applying the plugin.
        // Your plugin's jar (or shadowJar if present) will be used automatically.
        minecraftVersion("1.21.1")
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"

    if (targetJavaVersion >= 10 || JavaVersion.current().isJava10Compatible()) {
        options.release.set(targetJavaVersion)
    }
}

tasks.processResources {
    val props = mapOf("version" to version)
    inputs.properties(props)
    filteringCharset = "UTF-8"
    filesMatching("plugin.yml") {
        expand(props)
    }
}
