#include<limits.h>
#include"gtest/gtest.h"
#include"Calculator.h"
using namespace std;

class CalculatorTest : public ::testing::Test {
    protected:
    
        CalculatorTest() {
            calculator = new Calculator();
        }

        ~CalculatorTest() override {
            delete calculator;
        }

        Calculator* calculator;
};

TEST_F(CalculatorTest, AdditionWithRegularNumbers) {
    int a = -3;
    int b = 7;
    EXPECT_EQ(calculator->add(a, b), a + b);
}

TEST_F(CalculatorTest, ValidAdditionsWithExtremeValues) {
    EXPECT_EQ(calculator->add(INT_MAX, 0), INT_MAX);
    EXPECT_EQ(calculator->add(INT_MIN, 0), INT_MIN);
    EXPECT_EQ(calculator->add(INT_MAX, INT_MIN + 1), 0);
}

TEST_F(CalculatorTest, InvalidAdditionsThatWouldResultInAnIntegerOverflow) {
    EXPECT_ANY_THROW(calculator->add(INT_MAX, 1));
    EXPECT_ANY_THROW(calculator->add(INT_MAX - 10, 11));
    EXPECT_ANY_THROW(calculator->add(INT_MIN, -1));
    EXPECT_ANY_THROW(calculator->add(INT_MIN + 10, -11));
}
