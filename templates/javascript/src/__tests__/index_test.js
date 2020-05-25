const { add } = require('../index')

test("add function", () => {
    expect(add(2, 3)).toBe(5)
    expect(add(-1, 2)).toBe(1)
})