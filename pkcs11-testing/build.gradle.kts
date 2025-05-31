dependencies {
    // Project
    testImplementation(project(":pkcs11-cli"))
    testImplementation(project(":pkcs11-library"))

    implementation(libraries.slf4j.nop)
    implementation(libraries.itext.kernel)
    implementation(libraries.itext.io)
    implementation(libraries.itext.layout)
    implementation(libraries.itext.sign)
    implementation(libraries.itext.bouncycastle) {
        exclude(group = "org.bouncycastle", module = "bcpkix-jdk15on")
        exclude(group = "org.bouncycastle", module = "bcprov-jdk15on")
    }

    // Testing (General)
    testImplementation(libraries.junit.api)
    testImplementation(libraries.junit.engine)
    testRuntimeOnly(libraries.junit.engine)
    testRuntimeOnly(libraries.junit.platform.launcher)
}
