cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -Wall -Wextra -Wold-style-cast -pedantic")

add_library( # Sets the name of the library.
             libelectronpass-wrapper
             SHARED
             src/main/cpp/passwords_wrapper.cpp )

target_link_libraries(libelectronpass-wrapper
                      electronpass)

add_subdirectory(lib/libelectronpass)