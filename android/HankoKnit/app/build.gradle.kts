plugins {
    id("com.android.application")
}

android {
    namespace = "com.niaxcroknit.hankoknit"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.niaxcroknit.hankoknit"
        minSdk = 24
        targetSdk = 36
        // 스토어에 새로 올릴 때마다 versionCode를 1씩 올려 주세요.
        versionCode = 2
        versionName = "1.0.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.12.1")
}
