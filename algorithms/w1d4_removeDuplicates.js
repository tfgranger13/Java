function removeDuplicates(arr) {
    // check value on left
    for (let i = 0; i < arr.length; i++) {
        // compare to values starting on the right side
        for (let j = arr.length - 1; j > i; j--) {
            // if the values are equal
            if (arr[j] == arr[i]) {
                // remove the value on the right
                arr.splice(j, 1);
            }
        }
    }
    // return the array
    return arr;
}
var x = [3, 6, 1, 2, 8, 9, 4, 3, 2, 6, 0];

console.log(removeDuplicates(x));

function removeDuplicatesHard(arr) {
    // create key to hold numbers used
    var used = {};
    // loop through the array
    for (let i = 0; i < arr.length; i++) {
        // check if the key is not in use
        if (!used[arr[i]]) {
            // if it's not, add it as a key
            used[arr[i]] = "used";
        }
        // else it is in use
        else {
            // remove from the array
            arr.splice(i, 1);
            // deincrement i to account for the removed value
            i--;
        }
    }
    // return the modified array
    return arr;
}
var x = [3, 6, 1, 2, 8, 9, 4, 3, 2, 6, 0];

console.log(removeDuplicatesHard(x));