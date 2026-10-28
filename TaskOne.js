function findShortestWord(sentence) {

    let words =  sentence.trim().split(" ");

    let shortestWord = words[0];

    for(let word in words) {
        if(words[word].length < shortestWord.length) {
            shortestWord = words[word];
        }   
}
return shortestWord;   
}

module.exports = findShortestWord;

