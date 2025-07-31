# Pokemon App - MVI Compose Multiplatform Template ✨

A beautiful, modern Pokemon application built with Compose Multiplatform featuring MVI architecture,
type-safe navigation, and dynamic theming. Explore Pokemon, manage favorites, and enjoy a seamless
experience across Android, Desktop, and iOS platforms.

[![News Kotlin Multiplatform AppPreview](screenshot/pokemon_cmp_mvi_template.png)]()

## ✨ Features

🎯 Core Features

- 📱 Multiplatform: Android, Desktop, and iOS support
- 🏗️ MVI Architecture: Clean, predictable state management
- 🧭 Type-Safe Navigation: Kotlin Serialization-based routing
- 🎨 Material 3 Design: Modern UI with dynamic theming
- 🌓 Theme Management: Dark mode + Android Dynamic Colors
- 💾 Offline Support: Room database for favorites
- 🔄 Reactive UI: Real-time updates with StateFlow

🐾 Pokemon Features

- 🔍 Pokemon List: Browse all Pokemon with infinite scrolling
- ❤️ Favorites Management: Add/remove Pokemon from favorites
- 📊 Detailed View: Stats, abilities, types, and more
- 🎨 Type-based Theming: Colors based on Pokemon types
- ✨ Shimmer Loading: Beautiful loading animations

🎭 UI/UX Features

- 🌊 Smooth Animations: Page transitions and micro-interactions
- 📱 Adaptive UI: Responsive design for all screen sizes
- 👆 Swipe Actions: Swipe-to-delete favorites
- 🌈 Dynamic Colors: Android 12+ Material You support
- ⚡ Performance: Optimized with lazy loading and caching

## Getting Started

### Installation 🛠️

1. Clone this repository:
   ```bash
   git clone https://github.com/Coding-Meet/CMP-MVI-Template.git
   ```
2. Open in the latest version of Android Studio or intellij idea.

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
- For Desktop with hot reload, run
  `./gradlew desktopRun -DmainClass=com.example.cmp_mvi_template.MainKt`

## Screenshot 💻

## Android

<table>
   <tr>
    <td><img src="screenshot/android/1_android.png" alt="android"></td>
    <td><img src="screenshot/android/2_android.png" alt="android"></td>
    <td><img src="screenshot/android/3_android.png" alt="android"></td>
    <td><img src="screenshot/android/4_android.png" alt="android"></td>
   </tr>
   <tr>
    <td><img src="screenshot/android/5_android.png" alt="android"></td>
    <td><img src="screenshot/android/6_android.png" alt="android"></td>
    <td><img src="screenshot/android/7_android.png" alt="android"></td>
    <td><img src="screenshot/android/8_android.png" alt="android"></td>
   </tr>
   <tr>
    <td><img src="screenshot/android/9_android.png" alt="android"></td>
    <td><img src="screenshot/android/10_android.png" alt="android"></td>
    <td><img src="screenshot/android/11_android.png" alt="android"></td>
    <td><img src="screenshot/android/12_android.png" alt="android"></td>
    </tr>
   <tr>
    <td><img src="screenshot/android/13_android.png" alt="android"></td>
    <td><img src="screenshot/android/14_android.png" alt="android"></td>
    <td><img src="screenshot/android/15_android.png" alt="android"></td>
   </tr>
</table>

## IOS

<table>
   <tr>
        <td><img src="screenshot/ios/1_ios.png" alt="ios"></td>
        <td><img src="screenshot/ios/2_ios.png" alt="ios"></td>
        <td><img src="screenshot/ios/3_ios.png" alt="ios"></td>
   </tr>
   <tr>
        <td><img src="screenshot/ios/4_ios.png" alt="ios"></td>
        <td><img src="screenshot/ios/5_ios.png" alt="ios"></td>
        <td><img src="screenshot/ios/6_ios.png" alt="ios"></td>
   </tr>
    <tr>
        <td><img src="screenshot/ios/7_ios.png" alt="ios"></td>
        <td><img src="screenshot/ios/8_ios.png" alt="ios"></td>
        <td><img src="screenshot/ios/9_ios.png" alt="ios"></td>
    </tr>
    <tr>
        <td><img src="screenshot/ios/10_ios.png" alt="ios"></td>
        <td><img src="screenshot/ios/11_ios.png" alt="ios"></td>
        <td><img src="screenshot/ios/12_ios.png" alt="ios"></td>
    </tr>
</table>

## Desktop

<table>
   <tr>
        <td><img src="screenshot/desktop/1_desktop.png" alt="desktop"></td>
        <td><img src="screenshot/desktop/2_desktop.png" alt="desktop"></td>
   </tr>
    <tr>
        <td><img src="screenshot/desktop/3_desktop.png" alt="desktop"></td>
        <td><img src="screenshot/desktop/4_desktop.png" alt="desktop"></td>
    </tr>
    <tr>
        <td><img src="screenshot/desktop/5_desktop.png" alt="desktop"></td>
        <td><img src="screenshot/desktop/6_desktop.png" alt="desktop"></td>
    </tr>
    <tr>
        <td><img src="screenshot/desktop/7_desktop.png" alt="desktop"></td>
        <td><img src="screenshot/desktop/8_desktop.png" alt="desktop"></td>
    </tr>
    <tr>
        <td><img src="screenshot/desktop/9_desktop.png" alt="desktop"></td>    
        <td><img src="screenshot/desktop/10_desktop.png" alt="desktop"></td>
    </tr>
    <tr>
        <td><img src="screenshot/desktop/11_desktop.png" alt="desktop"></td>
        <td><img src="screenshot/desktop/12_desktop.png" alt="desktop"></td>    
    </tr>
</table>

## 🏗️ Architecture

### Clean Architecture + MVI Pattern

```
📱 Presentation Layer (UI)
├── 🎭 Compose Screens
├── 🧠 ViewModels (MVI)
└── 📊 State Management

💼 Domain Layer (Business Logic)  
├── 📋 Use Cases
├── 🏪 Repository Interfaces
└── 📦 Domain Models

💾 Data Layer (Data Sources)
├── 🌐 Remote (Ktor + PokéAPI)
├── 💿 Local (Room Database)  
└── 🔄 Repository Implementation
```

### Tech Stack

- 🎯 UI: Compose Multiplatform + Material 3
- 🏗️ Architecture: MVI + Clean Architecture + Use Cases
- 🧭 Navigation: Compose Navigation + Type-safe routes
- 🌐 Networking: Ktor Client + JSON Serialization
- 💾 Database: Room + SQLite (multiplatform)
- 🎨 Theming: DataStore Preferences + Dynamic Colors
- 🔧 Dependency Injection: Koin
- 🖼️ Images: Coil3 (async image loading)

## 📁 Project Structure

```
CMP-MVI-Template/
├── composeApp/                             # ✅ Main Compose Multiplatform app module
│   ├── build.gradle.kts                    # ➕ Gradle config for this module
│   ├── setting.preferences_pb              # 📦 Proto DataStore schema for user settings (theme, etc.)
│
│   └── src/
│       ├── androidMain/                    # 🤖 Android-specific code
│       │   ├── AndroidManifest.xml         # 📄 Manifest file for Android
│       │   └── kotlin/
│       │       └── com/example/cmp_mvi_template/
│       │           ├── MainActivity.kt     # 🚀 Entry point for Android app
│       │           ├── MyApplication.kt    # 🏁 Application class for Koin setup
│       │           └── core/platform/      # 🔌 Android actual implementations for platform interfaces
│
│       ├── iosMain/                        # 🍎 iOS-specific code (uses Kotlin/Native)
│       │   └── kotlin/
│       │       └── com/example/cmp_mvi_template/
│       │           ├── MainViewController.kt # 🧭 iOS screen entry point (UIKit)
│       │           └── core/platform/        # 🔌 iOS actual implementations for platform interfaces
│
│       ├── desktopMain/                    # 🖥 Desktop-specific entry point
│       │   └── kotlin/
│       │       └── com/example/cmp_mvi_template/
│       │           └── main.kt             # 💻 Desktop launcher with ComposeWindow
│
│       ├── commonMain/                     # 🔁 Shared code between all platforms
│       │   ├── composeResources/           # 🎨 Compose Multiplatform resources (fonts, strings, etc.)
│       │   └── kotlin/
│       │       └── com/example/cmp_mvi_template/
│       │
│       │           ├── di/                 # 🧩 Dependency Injection modules using Koin
│       │           │   ├── AppModule.kt
│       │           │   └── PlatformModule.kt
│       │
│       │           ├── app/                # 🌐 App-level shared state (theme, scaffold, etc.)
│       │           │   ├── AppViewModel.kt
│       │           │   └── AppScaffold.kt
│       │
│       │           ├── core/               # 📚 Core layer for base domain, utils, and data sources
│       │           │   ├── utility/        # 🔧 Utility helpers (formatters, validators, etc.)
│       │           │   ├── domain/         # 📦 Base models like pagination, error handling
│       │           │   ├── data/           # 🗃️ Base local + remote source contracts or shared logic
│       │           │   └── platform/       # 🌍 Expect interfaces for platform-specific functionality
│       │
│       │           ├── ui/                 # 🧱 Reusable UI components
│       │           │   ├── Button/
│       │           │   ├── Dialog/
│       │           │   ├── Layout/
│       │           │   └── Theme/          # 🎨 Theme definitions (Typography, Colors, Dimens)
│       │
│       │           └── feature/            # 🌟 Feature modules – each screen or flow has its own folder
│       │               ├── pokemon/        # 🐱 Pokemon feature (MVI pattern)
│       │               │   ├── domain/     # 🔁 Business logic interfaces & models
│       │               │   ├── data/       # 💾 Repository, fake/local/remote data
│       │               │   ├── presentation/ # 🎭 UI state, event, screen, and ViewModel
│       │               │   └── di/         # 🧩 Feature-specific DI
│       │
│       │               ├── setting/        # ⚙️ App settings (e.g., theme selection)
│       │               │   └── presentation/ # 🎭 UI state + screen for settings
│       │
│       │               └── sample_example/ # 🧪 Optional example/template feature
│       │                   ├── presentation/
│       │                   └── domain/
│       ├── commonTest/                     # 🧪 Shared unit tests
│       │   └── com/example/cmp_mvi_template/
│       │       └── ComposeAppCommonTest.kt # ✅ Sample shared test

```

## 📁 Detail Project Structure

```
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
```

## 🎯 Next Goals

Here are the upcoming tasks and feature enhancements planned for the project:

- Koin Annotations Integration
    - Use Koin Annotation processing (@Single, @Factory, etc.) to simplify and reduce boilerplate
      for dependency injection.

- 🔄 GraphQL Support for Pokémon API
    - Implement a GraphQL version of the Pokémon API using Ktor Client. Will be explored in a
      separate branch for experimentation.

- 🗃️ SQLDelight Sample Integration
    - Integrate SQLDelight only as a working code sample in a separate module/branch.
    - Purpose: Keep reusable code ready for future use or cross-platform Kotlin projects.
    - ✅ Room will continue as the primary local storage solution for this app.

- ⚙️ Dev Tooling Scripts (Automation)
    - Build Gradle or Kotlin-based scripts for:
        - 🔁 Renaming package names along with folder structure
        - 📦 Creating distributable builds per platform
        - 🚀 Auto-generating feature modules with basic files (UI, ViewModel, State, Events) by
          providing just a feature name

- 🧩 Component Showcase Screen
    - All UI components are implemented but not visible inside the app.
    - A new Component Explorer Screen will be added where:
        - You can view all components (buttons, cards, inputs, etc.)
        - Helpful for testing and design consistency on a real device

- 🧪 Unit & Instrumented Testing
    - Add unit tests for core business logic and ViewModels
    - Add instrumented UI tests for critical user flows
    - Integrate test coverage tools for quality tracking

- 📱 Maestro Integration (UI Flow Testing)
    - Set up Maestro to define UI flow test scripts

## Contributing 🤝

Feel free to contribute to this project by submitting issues, pull requests, or providing valuable
feedback. Your
contributions are always welcome! 🙌

## ❤ Show your support

Give a ⭐️ if this project helped you!

<a href="https://www.buymeacoffee.com/codingmeet" target="_blank">
<img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" width="160">
</a>

Your generosity is greatly appreciated! Thank you for supporting this project.

## Connect with me

[![](https://img.shields.io/badge/Youtube-red?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@CodingMeet26?si=FuKwU-aBaf_5kukR)
[![](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/coding-meet-a74933273/)
[![](https://img.shields.io/badge/Twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/CodingMeet)

## Author

**Meet**