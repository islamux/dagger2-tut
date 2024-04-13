plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.islamux.dagger2tut"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.islamux.dagger2tut"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Dagger2
    val dagger2Version ="2.51.1"
    annotationProcessor ("com.google.dagger:dagger-compiler:$dagger2Version")
    implementation ("com.google.dagger:dagger-android-support:$dagger2Version") // if you use the support libraries
    annotationProcessor ("com.google.dagger:dagger-android-processor:$dagger2Version")

}