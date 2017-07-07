#!/bin/bash

curl https://download.libsodium.org/libsodium/releases/LATEST.tar.gz -o libsodium.tar.gz
tar xzf libsodium.tar.gz
rm libsodium.tar.gz
mv libsodium-* libsodium
cd libsodium
bash autogen.sh

for file in dist-build/android-*; do
	if [ ${file} != "dist-build/android-build.sh" ] ; then
		bash ${file};
	fi
done

# could be done using symlinks
cp -r libsodium-android-i686/ libsodium-android-x86
cp -r libsodium-android-armv6 libsodium-android-armeabi
cp -r libsodium-android-armv7-a libsodium-android-armeabi-v7a
cp -r libsodium-android-armv8-a libsodium-android-arm64-v8a