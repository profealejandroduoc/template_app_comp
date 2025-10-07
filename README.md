# EJEMPLO COMPONENTES Y NAVEGACION 

## Agregar Librerias que se utilizarán
   * Navigation Compose
   * Iconos extendidos de material

en el archivo *libs.verssion.toml* de Gradle Script agregar

```toml
navigationCompose="2.9.4"
iconExtended="1.7.8"

[libraries]
androidx-navigation-compose = {group ="androidx.navigation", name="navigation-compose", version.ref="navigationCompose"}
androidx-icons-extended={group="androidx.compose.material", name="material-icons-extended-android", version.ref="iconExtended"}
```

en *build.gradle.kts*
```kts
    //Agregando dependencias de librerias
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.icons.extended)
```

## Generación del Menu Lateral
