function numberArray(numbers) {
   
    for(let index = 0; index < numbers.length; index++) {
        
        numbers[index ] = numbers[index] * numbers[index];

}

return numbers.sort((firstNumber, secondNumber) => firstNumber - secondNumber);

}

module.exports = numberArray;