plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.tau.loginapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tau.loginapp"
        minSdk = 24
        //noinspection OldTargetApi
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
}


    dependencies {

        implementation(libs.appcompat)
        implementation(libs.material)
        implementation(libs.activity)
        implementation(libs.constraintlayout)
        implementation(libs.annotation)
        implementation(libs.lifecycle.livedata.ktx)
        implementation(libs.lifecycle.viewmodel.ktx)
        testImplementation(libs.junit)
        androidTestImplementation(libs.ext.junit)
        androidTestImplementation(libs.espresso.core)
        //noinspection UseTomlInstead
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
        //noinspection UseTomlInstead
        androidTestImplementation("androidx.test:runner:1.5.2")
        //noinspection UseTomlInstead
        androidTestImplementation("androidx.test:rules:1.5.0")
        implementation(libs.guava)
    }
