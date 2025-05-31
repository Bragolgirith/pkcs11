rootProject.name = "pkcs11"

include("pkcs11-cli")
include("pkcs11-library")
include("pkcs11-testing")

dependencyResolutionManagement {
    versionCatalogs {
        create("libraries") {
            // Plugins
            plugin("shadow", "com.gradleup.shadow").version("8.3.6")

            // Testing (General)
            library("junit-api", "org.junit.jupiter:junit-jupiter-api:5.13.0")
            library("junit-engine", "org.junit.jupiter:junit-jupiter-engine:5.13.0")
            library("junit-platform-launcher", "org.junit.platform:junit-platform-launcher:1.13.0")

            // Testing (PDF signing)
            library("slf4j-nop", "org.slf4j:slf4j-nop:2.0.17")
            library("itext-kernel", "com.itextpdf:kernel:9.2.0")
            library("itext-io", "com.itextpdf:io:9.2.0")
            library("itext-layout", "com.itextpdf:layout:9.2.0")
            library("itext-sign", "com.itextpdf:sign:9.2.0")
            library("itext-bouncycastle", "com.itextpdf:bouncy-castle-adapter:9.2.0")
        }
    }
}
