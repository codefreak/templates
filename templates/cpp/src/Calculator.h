#ifndef CALCULATOR_H_
#define CALCULATOR_H_

class Calculator {
 public:
    /**
     * Return the sum of a and b
     * Throws an exception if a and/or b have illegal resultTypes or the result cannot be calculated
     *
     * @param a first addend
     * @param b second addend
     * @return sum of a and b
     */
    int add(int a, int b);
};

#endif  // CALCULATOR_H_
