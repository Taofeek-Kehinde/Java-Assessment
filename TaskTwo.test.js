const numberArray = require("./TaskTwo");

test("Square each number in the array and sort the array", () => {
    const numbers = [3, 2, 7, 1, 4];
    const squaredAndSorted = numberArray(numbers);
    expect(squaredAndSorted).toEqual([1, 4, 9, 16, 49]);
});

test("Test with negative numbers", () => {
    const numbers = [-3, -2, -7, -1, -4];
    const squaredAndSorted = numberArray(numbers);
    expect(squaredAndSorted).toEqual([1, 4, 9, 16, 49]);
});

test("Test with mixed positive and negative numbers", () => {
    const numbers = [-3, 2, -7, 1, 4];
    const squaredAndSorted = numberArray(numbers);
    expect(squaredAndSorted).toEqual([1, 4, 9, 16, 49]);
});     