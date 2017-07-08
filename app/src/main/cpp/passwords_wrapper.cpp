/*
This file is part of ElectronPass.

ElectronPass is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

ElectronPass is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with ElectronPass. If not, see <http://www.gnu.org/licenses/>.
*/

#include <jni.h>
#include <string>
#include "../../../lib/libelectronpass/include/passwords.hpp"

extern "C" {

    using namespace electronpass::passwords;
    JNIEXPORT jstring

    JNICALL
    Java_io_github_electronpass_libelectronpass_Passwords_generate_1random_1pass(
            JNIEnv *env,
            jobject,
            int len) {
        std::string pass = generate_random_pass(len);
        return env->NewStringUTF(pass.c_str());
    }
}
