const findShortestWord = require("./TaskOne");

test("Find shortest word in a sentence", () => {
    const sentence = "My name is Taofeek and I am learning JavaScript.";
    const shortestWord = findShortestWord(sentence);
    expect(shortestWord).toBe("I");
});

