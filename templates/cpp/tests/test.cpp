#define CATCH_CONFIG_MAIN
#include "catch.hpp"
#include "AddFunction.hpp"

TEST_CASE("Testing add", "[add]") {
    REQUIRE( add(1, 2) == 3 );
    REQUIRE( add(2, -2) == 0 );
}