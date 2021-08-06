function matrixSearch(bigArr, smallArr) {
    // for loops through big array for the first value of the second array
    for (let i = 0; i < bigArr.length; i++) {
        for (let j = 0; j < bigArr[i].length; j++) {
            console.log(`checking big array value ${bigArr[i][j]} for ${smallArr[0][0]}.`)
            if (bigArr[i][j] == smallArr[0][0]) {
                var valueFound = true;
                console.log("found the first value, checking the rest.")
                // for loops to cycle through the small array
                for (let l = 0; l < smallArr.length; l++) {
                    for (let m = 0; m < smallArr[l].length; m++) {
                        // compare to the corresponding value of the big array
                        console.log(`comparing ${smallArr[l][m]} to ${bigArr[i + l][j + m]}`)
                        // if the values are not the same, return false
                        if (smallArr[l][m] != bigArr[i + l][j + m]) {
                            console.log(`the values ${bigArr[i+l][j+m]} and ${smallArr[l][m]} do not match.`)
                            return false;
                        }
                    }
                }
                // if it didn't return false and it goes through the loop, it must be correct
                console.log("did not find any mismatched values, the pictures match")
                return true;
            }
        }
    }
    // if it never finds the first value in the for loop, return false
    if (valueFound != true){
        console.log("first value not found.")
        return false;
    }
}

var bigarray = [
    [12, 34, 45, 56],
    [98, 87, 76, 65],
    [45, 56, 78, 89],
    [76, 43, 32, 21]
]

var smallarray = [
    [45, 56],
    [76, 65]
]

var smallarray2 = [
    [45, 56],
    [43, 65]
]

var smallarray3 = [
    [78]
]
var smallarray4 = [
    [78],
    [32]
]

var smallarray5 = [
    [2],
    [32]
]

var smallarray6 = [
    [54, 43]
]

console.log(matrixSearch(bigarray, smallarray)) // true
// console.log(matrixSearch(bigarray, smallarray2)) // false
// console.log(matrixSearch(bigarray, smallarray3)) // true
// console.log(matrixSearch(bigarray, smallarray4)) // true
// console.log(matrixSearch(bigarray, smallarray6)) // false