set(BINARY ${CMAKE_PROJECT_NAME})
add_executable(${BINARY}_run main.cpp Calculator.cpp Calculator.h)
add_library(${BINARY}_lib STATIC main.cpp Calculator.cpp Calculator.h)
