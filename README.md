# Electronpass Android
ElectronPass Android client written in Kotlin and C++.

## Development environment
This Android app is currently developed using Android Studio 3.0 or newer. To run it, you will need at least basic Android SDK packages AND:
- NDK
- CMake
- LLDB

These are all available for download via Android SKD Manager.

After cloning this repo, you have to initialize libelectronpass submodule:
````
git submodule init
git submodule update
````

`libelectronpass` requires `libsodium` - to download and compile it for Android run (might take a while):
````
cd app/lib # THIS IS IMPORTANT!
bash fetch_sodium.sh
````

**Important notes**:
- on Linux, you might have wrong version of `libncurses` and clang won't find it - run these commands:
    ````
    sudo ln -s /usr/lib/libncursesw.so.6.0 /usr/lib/libncurses.so.5
    sudo ln -s /usr/lib/libncursesw.so.6.0 /usr/lib/libtinfo.so.5
    ````
- instant run might cause problems - to disable it go to `Settings > Build, Execution, Deployment > Instant Run`

## License
Code in this project is licensed under [GNU GPLv3 license](https://github.com/electronpass/electronpass-android/blob/master/LICENSE). Some third party files are subjective to their respective license.