cmake_minimum_required(VERSION 3.10)
project(ExampleProject)

set(CMAKE_CXX_STANDARD 11)

include_directories(src)

add_subdirectory(src)

if(DEFINED ENV{CI})
    add_subdirectory(test)
endif()
