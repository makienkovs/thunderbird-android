plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.lint) apply false
    alias(libs.plugins.android.test) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.parcelize) apply false
    alias(libs.plugins.ksp) apply false

    id("thunderbird.quality.spotless")
    id("thunderbird.dependency.check")
}

val propertyTestCoverage: String? by extra

allprojects {
    extra.apply {
        set("testCoverageEnabled", propertyTestCoverage != null)
    }

    tasks.withType<Test> {
        testLogging {
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
            showCauses = true
            showExceptions = true
            showStackTraces = true
        }
    }
}

tasks.register("testsOnCi") {
    val skipTests = setOf("testReleaseUnitTest")

    dependsOn(
        subprojects.map { project -> project.tasks.withType(Test::class.java) }
            .flatten()
            .filterNot { task -> task.name in skipTests },
    )
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = libs.versions.gradle.get()
    distributionType = Wrapper.DistributionType.ALL
}

tasks.register<Copy>("copyFiles").configure {
    println("Copy files start")

    //Название приложения
    copy {
        from("mos/app-k9mail/src")
        into("app-k9mail/src")
    }

    //Ресурсы для бокового меню
    copy {
        from("mos/feature/navigation/drawer/src")
        into("feature/navigation/drawer/src")
    }

    //Иконки
    copy {
        from("mos/core/ui/legacy/designsystem/src")
        into("core/ui/legacy/designsystem/src")
    }

    //Иконка приложения для Compose
    copy {
        from("mos/core/ui/compose/theme2/k9mail/src")
        into("core/ui/compose/theme2/k9mail/src")
    }

    //Иконка приложения
    copy {
        from("mos/core/ui/legacy/theme2/k9mail/src")
        into("core/ui/legacy/theme2/k9mail/src")
    }

    //Шрифт для Compose
    copy {
        from("mos/core/ui/compose/theme2/common/src")
        into("core/ui/compose/theme2/common/src")
    }

    //Шрифт для Legacy
    copy {
        from("mos/core/ui/legacy/theme2/common/src")
        into("core/ui/legacy/theme2/common/src")
    }

    //Цвета, курсор
    copy {
        from("mos/legacy/core/src")
        into("legacy/core/src")
    }

    //Стиль и лайаут тулбара
    copy {
        from("mos/legacy/ui/base/src")
        into("legacy/ui/base/src")
    }

    //Стили и цвета Legacy, ссылки на ресурсы
    copy {
        from("mos/legacy/ui/legacy/src")
        into("legacy/ui/legacy/src")
    }

    //Тексты раздела шифрование
    copy {
        from("mos/plugins/openpgp-api-lib/openpgp-api/src")
        into("plugins/openpgp-api-lib/openpgp-api/src")
    }

    println("Copy files end")
}
