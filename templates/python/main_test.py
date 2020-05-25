from main import add

def test_function():
    """
    This is an example unit test in pytest.
    It checks the add() function for correctness.
    """
    assert add(2, 3) == 5
    assert add(-1, 2) == 1
