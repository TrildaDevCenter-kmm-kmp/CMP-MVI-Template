# MVI Compose Multiplatform Template ✨

### Run the app on your device or emulator:

- For Android, run the `composeApp` module by selecting the `app` configuration. If you need help
  with the
  configuration, follow this link
  for [android](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html#run-your-application-on-android)
- For iOS, run the `composeApp` module by selecting the `iosApp` configuration. If you need help
  with the configuration,
  follow this link
  for [Ios](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-create-first-app.html#run-your-application-on-ios)
- For Desktop, run `./gradlew :composeApp:run`
- For Desktop with hot reload, run `./gradlew desktopRun -DmainClass=com.example.cmp_mvi_template.MainKt`


└── CMP-MVI-Template/
├── composeApp/
│   ├── setting.preferences_pb
│   ├── build.gradle.kts
│   └── src/
│       ├── androidMain/
│       │   ├── AndroidManifest.xml
│       │   ├── res/
│       │   │   └── values/
│       │   │       └── strings.xml
│       │   │  
│       │   └── kotlin/
│       │       └── com/
│       │           └── example/
│       │               └── cmp_mvi_template/
│       │                   ├── MyApplication.kt
│       │                   ├── MainActivity.kt
│       │                   └── core/
│       │                       └── platform/
│       │                           ├── theme/
│       │                           │   └── PlatformTheme.android.kt
│       │                           ├── datastore/
│       │                           │   └── createDataStore.android.kt
│       │                           ├── toast/
│       │                           │   ├── AndroidToastManager.kt
│       │                           │   └── ToastManager.android.kt
│       │                           ├── http_engine/
│       │                           │   └── GetHttpClientEngine.android.kt
│       │                           └── database/
│       │                               └── getDatabaseBuilder.android.kt
│       ├── commonMain/
│       │   ├── composeResources/
│       │   │   ├── values/
│       │   │   │   └── strings.xml
│       │   │   └── drawable/
│       │   │       └── compose-multiplatform.xml
│       │   └── kotlin/
│       │       └── com/
│       │           └── example/
│       │               └── cmp_mvi_template/
│       │                   ├── di/
│       │                   │   ├── initKoin.kt
│       │                   │   └── CoreModule.kt
│       │                   ├── app/
│       │                   │   ├── presentation/
│       │                   │   │   ├── App.kt
│       │                   │   │   ├── AppThemeState.kt
│       │                   │   │   └── AppViewModel.kt
│       │                   │   └── di/
│       │                   │       └── AppModule.kt
│       │                   ├── core/
│       │                   │   ├── utility/
│       │                   │   │   ├── ComposableExtensions.kt
│       │                   │   │   ├── UiText.kt
│       │                   │   │   ├── IconResource.kt
│       │                   │   │   ├── AppLogger.kt
│       │                   │   │   └── StateController.kt
│       │                   │   ├── domain/
│       │                   │   │   ├── DataErrorToUiTextExtension.kt
│       │                   │   │   ├── Paginator.kt
│       │                   │   │   ├── DataError.kt
│       │                   │   │   ├── Error.kt
│       │                   │   │   └── ResultWrapper.kt
│       │                   │   ├── data/
│       │                   │   │   ├── datastore/
│       │                   │   │   │   ├── ThemeMode.kt
│       │                   │   │   │   └── ThemePreferences.kt
│       │                   │   │   ├── local/
│       │                   │   │   │   ├── PokemonDatabase.kt
│       │                   │   │   │   ├── PokemonDatabaseConstructor.kt
│       │                   │   │   │   └── dao/
│       │                   │   │   │       └── PokemonDao.kt
│       │                   │   │   └── network/
│       │                   │   │       ├── NetworkExtensions.kt
│       │                   │   │       └── HttpClientFactory.kt
│       │                   │   └── platform/
│       │                   │       ├── theme/
│       │                   │       │   └── PlatformTheme.kt
│       │                   │       ├── datastore/
│       │                   │       │   ├── createDataStore.kt
│       │                   │       │   └── AppSettings.kt
│       │                   │       ├── toast/
│       │                   │       │   ├── ToastManager.kt
│       │                   │       │   ├── ToastManagerFactory.kt
│       │                   │       │   └── ToastDuration.kt
│       │                   │       ├── http_engine/
│       │                   │       │   └── GetHttpClientEngine.kt
│       │                   │       └── database/
│       │                   │           └── getDatabaseBuilder.kt
│       │                   ├── ui/
│       │                   │   ├── theme/
│       │                   │   │   ├── AnnotationPreview.kt
│       │                   │   │   ├── Color.kt
│       │                   │   │   ├── Theme.kt
│       │                   │   │   └── Type.kt
│       │                   │   ├── dialog/
│       │                   │   │   ├── ToastPopup.kt
│       │                   │   │   └── LoadingDialog.kt
│       │                   │   ├── navigation/
│       │                   │   │   ├── AppDestination.kt
│       │                   │   │   ├── AdaptiveNavigation.kt
│       │                   │   │   ├── NavigationExtensions.kt
│       │                   │   │   └── bottom_navigation_bar/
│       │                   │   │       ├── NavigationItem.kt
│       │                   │   │       └── BottomNavigationBar.kt
│       │                   │   ├── layout/
│       │                   │   │   └── ErrorMessageLayout.kt
│       │                   │   └── component/
│       │                   │       ├── badges/
│       │                   │       │   └── Badges.kt
│       │                   │       ├── text/
│       │                   │       │   └── Text.kt
│       │                   │       ├── radio_button/
│       │                   │       │   └── RadioButton.kt
│       │                   │       ├── divider/
│       │                   │       │   └── Divider.kt
│       │                   │       ├── navigation_bar/
│       │                   │       │   └── NavigationBar.kt
│       │                   │       ├── progress_indicator/
│       │                   │       │   └── ProgressIndicators.kt
│       │                   │       ├── button/
│       │                   │       │   └── Button.kt
│       │                   │       ├── switch_custom/
│       │                   │       │   └── Switch.kt
│       │                   │       ├── slider/
│       │                   │       │   └── Slider.kt
│       │                   │       ├── icon_button/
│       │                   │       │   └── IconButton.kt
│       │                   │       ├── checkbox/
│       │                   │       │   └── Checkbox.kt
│       │                   │       ├── fab/
│       │                   │       │   └── Fab.kt
│       │                   │       ├── segmented_button/
│       │                   │       │   └── SegmentedButton.kt
│       │                   │       ├── bottom_app_bar/
│       │                   │       │   └── BottomAppBar.kt
│       │                   │       └── top_app_bar/
│       │                   │           └── TopAppBar.kt
│       │                   └── feature/
│       │                       ├── setting/
│       │                       │   ├── di/
│       │                       │   │   └── SettingModule.kt
│       │                       │   └── presentation/
│       │                       │       ├── screen/
│       │                       │       │   ├── SettingScreen.kt
│       │                       │       │   ├── SettingEvent.kt
│       │                       │       │   ├── SettingState.kt
│       │                       │       │   ├── SettingViewModel.kt
│       │                       │       │   └── SettingEffect.kt
│       │                       │       └── component/
│       │                       │           ├── DynamicThemeToggleAndroidOnly.kt
│       │                       │           ├── ThemeSelectionRow.kt
│       │                       │           ├── ThemeSelectionDialog.kt
│       │                       │           └── ThemePreview.kt
│       │                       ├── pokemon/
│       │                       │   ├── di/
│       │                       │   │   └── PokemonModule.kt
│       │                       │   ├── presentation/
│       │                       │   │   ├── component/
│       │                       │   │   │   ├── PokemonCard.kt
│       │                       │   │   │   └── ShimmerEffect.kt
│       │                       │   │   ├── pokemon_details/
│       │                       │   │   │   ├── screen/
│       │                       │   │   │   │   ├── PokemonDetailsViewModel.kt
│       │                       │   │   │   │   ├── PokemonDetailsEvent.kt
│       │                       │   │   │   │   ├── PokemonDetailsScreen.kt
│       │                       │   │   │   │   ├── PokemonDetailsEffect.kt
│       │                       │   │   │   │   └── PokemonDetailsState.kt
│       │                       │   │   │   └── component/
│       │                       │   │   │       ├── PokemonAbilitiesSection.kt
│       │                       │   │   │       ├── PokemonDetailsContent.kt
│       │                       │   │   │       ├── PokemonStatsSection.kt
│       │                       │   │   │       ├── PokemonBasicInfoSection.kt
│       │                       │   │   │       └── PokemonImageSection.kt
│       │                       │   │   ├── pokemon_list/
│       │                       │   │   │   └── screen/
│       │                       │   │   │       ├── PokemonListEvent.kt
│       │                       │   │   │       ├── PokemonListViewModel.kt
│       │                       │   │   │       ├── PokemonListScreen.kt
│       │                       │   │   │       ├── PokemonListEffect.kt
│       │                       │   │   │       └── PokemonListState.kt
│       │                       │   │   └── favorites/
│       │                       │   │       ├── screen/
│       │                       │   │       │   ├── FavoritesState.kt
│       │                       │   │       │   ├── FavoritesScreen.kt
│       │                       │   │       │   ├── FavoritesEffect.kt
│       │                       │   │       │   ├── FavoritesEvent.kt
│       │                       │   │       │   └── FavoritesViewModel.kt
│       │                       │   │       └── component/
│       │                       │   │           ├── SwipeToDeletePokemonCard.kt
│       │                       │   │           ├── FavoritesListContent.kt
│       │                       │   │           └── EmptyFavoritesScreen.kt
│       │                       │   ├── domain/
│       │                       │   │   ├── usecase/
│       │                       │   │   │   ├── GetFavoritesPokemonUseCase.kt
│       │                       │   │   │   ├── GetPokemonDetailsUseCase.kt
│       │                       │   │   │   ├── CheckIfFavoriteUseCase.kt
│       │                       │   │   │   ├── GetPokemonListUseCase.kt
│       │                       │   │   │   └── ToggleFavoriteUseCase.kt
│       │                       │   │   ├── entity/
│       │                       │   │   │   ├── PokemonEntity.kt
│       │                       │   │   │   └── Pokemon.kt
│       │                       │   │   └── repository/
│       │                       │   │       └── PokemonRepository.kt
│       │                       │   └── data/
│       │                       │       ├── mapper/
│       │                       │       │   └── toDomain.kt
│       │                       │       ├── repository/
│       │                       │       │   └── PokemonRepositoryImpl.kt
│       │                       │       └── remote/
│       │                       │           ├── api/
│       │                       │           │   ├── PokemonApiServiceImpl.kt
│       │                       │           │   └── PokemonApiService.kt
│       │                       │           └── dto/
│       │                       │               └── PokemonListResponseDto.kt
│       │                       └── sample_example/
│       │                           ├── di/
│       │                           │   └── SampleExampleModule.kt
│       │                           └── presentation/
│       │                               └── screen/
│       │                                   ├── SampleEffect.kt
│       │                                   ├── SampleExampleScreen.kt
│       │                                   ├── SampleEvent.kt
│       │                                   ├── SampleState.kt
│       │                                   └── SampleExampleViewModel.kt
│       ├── desktopMain/
│       │   └── kotlin/
│       │       └── com/
│       │           └── example/
│       │               ├── .DS_Store
│       │               └── cmp_mvi_template/
│       │                   ├── .DS_Store
│       │                   ├── main.kt
│       │                   └── core/
│       │                       └── platform/
│       │                           ├── theme/
│       │                           │   └── PlatformTheme.desktop.kt
│       │                           ├── datastore/
│       │                           │   └── createDataStore.desktop.kt
│       │                           ├── toast/
│       │                           │   ├── RoundedPanel.kt
│       │                           │   ├── ToastManager.desktop.kt
│       │                           │   └── DesktopToastManager.kt
│       │                           ├── http_engine/
│       │                           │   └── GetHttpClientEngine.desktop.kt
│       │                           └── database/
│       │                               └── getDatabaseBuilder.desktop.kt
│       ├── commonTest/
│       │   └── kotlin/
│       │       └── com/
│       │           └── example/
│       │               └── cmp_mvi_template/
│       │                   └── ComposeAppCommonTest.kt
│       └── iosMain/
│           └── kotlin/
│               └── com/
│                   └── example/
│                       └── cmp_mvi_template/
│                           ├── MainViewController.kt
│                           └── core/
│                               └── platform/
│                                   ├── theme/
│                                   │   └── PlatformTheme.ios.kt
│                                   ├── datastore/
│                                   │   └── createDataStore.ios.kt
│                                   ├── toast/
│                                   │   ├── ToastManager.ios.kt
│                                   │   └── IosToastManager.kt
│                                   ├── http_engine/
│                                   │   └── GetHttpClientEngine.ios.kt
│                                   └── database/
│                                       └── getDatabaseBuilder.ios.kt

composeApp/
└── src/
├── commonMain/kotlin/com/meet/recipe/
│   ├── core/                           # Core utilities & infrastructure
│   │   ├── network/
│   │   │   ├── HttpClientFactory.kt
│   │   │   └── NetworkExtensions.kt
│   │   ├── utility/
│   │   │   ├── Result.kt
│   │   │   ├── DataError.kt
│   │   │   └── UiText.kt
│   │   ├── database/
│   │   │   └── DatabaseFactory.kt
│   │   ├── di/
│   │   │   └── CoreModule.kt
│   │   └── theme/
│   │       ├── Theme.kt
│   │       ├── Color.kt
│   │       └── Typography.kt
│   ├── navigation/                     # Type-safe navigation
│   │   ├── AppDestination.kt
│   │   ├── NavigationExtensions.kt
│   │   └── AdaptiveNavigation.kt
│   ├── shared/                         # Shared components
│   │   ├── component/
│   │   │   ├── card/
│   │   │   ├── button/
│   │   │   ├── input/
│   │   │   └── layout/
│   │   ├── model/
│   │   └── util/
│   └── feature/                        # Feature modules
│       └── {feature_name}/
│           ├── data/
│           │   ├── repository/
│           │   ├── remote/
│           │   ├── local/
│           │   └── mapper/
│           ├── domain/
│           │   ├── entity/
│           │   ├── repository/
│           │   └── usecase/
│           ├── presentation/
│           │   ├── screen/
│           │   ├── component/
│           │   └── viewmodel/
│           └── di/
├── androidMain/kotlin/com/meet/recipe/
├── iosMain/kotlin/com/meet/recipe/
└── desktopMain/kotlin/com/meet/recipe/
├── local.properties
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradle/
│   ├── libs.versions.toml
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties