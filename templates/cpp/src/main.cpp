#include<iostream>
#include"Calculator.h"

void printSumOf(int a, int b) {
    Calculator calculator;
    std::cout << a << " + " << b << " = " << calculator.add(a, b) << std::endl;
}

int main() {
    printSumOf(3, 4);
    printSumOf(-2, 3);
    printSumOf(0, 0);
    return 0;
}
