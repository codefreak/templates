#include<iostream>
#include"Calculator.h"
using namespace std;

void printSumOf(int a, int b) {
    Calculator calculator;
    cout << a << " + " << b << " = " << calculator.add(a, b) << endl;
}

int main() {
    printSumOf(3, 4);
    printSumOf(-2, 3);
    printSumOf(0, 0);
    return 0;
}

