# FetchContent is available since 3.11
cmake_minimum_required(VERSION 3.11)
project(ExampleProject)

set(CMAKE_CXX_STANDARD 11)

include_directories(src)

add_subdirectory(src)

if(DEFINED ENV{CI})
    add_subdirectory(test)
endif()
