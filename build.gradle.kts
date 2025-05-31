subprojects {
    apply {
        plugin("java")
    }

    group = "ch.swaechter"
    version = "0.0.1"

    repositories {
        mavenCentral()
        maven(url = "https://repo.itextsupport.com/artifactory/releases/")
    }

    tasks.withType<JavaCompile> {
        sourceCompatibility = JavaVersion.VERSION_24.toString()
        targetCompatibility = JavaVersion.VERSION_24.toString()
        options.encoding = "UTF-8"
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
